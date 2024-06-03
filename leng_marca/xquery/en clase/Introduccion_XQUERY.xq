(:
for $libro in /bib/book
return $libro/title
:)

(:
for $libro in /bib/book
return <titulo>{$libro/title/text()}</titulo>
:)

(:
for $libro at $index in /bib/book
return <titulo>{$index} - {$libro/title/text()}</titulo>
:)
(:
<biblioteca>
{
  for $libro in /bib/book
  return <titulo>{$libro/title/text()}</titulo> 
}
</biblioteca>
:)

(:
<books_after_2003>
{
for $libro at $index in /bib/book
return

if ($libro/year > 2003) then (
  <book>
  {$libro/title/text()}
  </book>
)}
</books_after_2003>
:)

(:
for $libro in /bib/book
return
if ($libro/@id = 1) then (
 $libro/title 
)
:)

(:
let $libros := /bib/book
return <title>($libros/title)</title>
:)

(:
let $libros := /bib/book
return <ultimo_anio_publicacion>{max($libros/year)}</ultimo_anio_publicacion>
:)

(:
let $anios := /bib/book
let $maxAnio := (
  max($anios/year)
)
return $maxAnio
:)

(:
(:facilitar la legibilidad usando variables:)
for $libro in /bib/book
let $publicador := $libro/publisher/text()
let $titulo := $libro/title/text()
return
<libro>
<titulo>{$titulo}</titulo>
<editorial>{$publicador}</editorial>
</libro>
:)

(:
(:Clausula WHERE:)
for $lib in /bib/book
(:where $lib/author = "Stevens":)
(:where starts-with($lib/author, "Ste"):)
where $lib/author = "Stevens" or $lib/autor = "Buneman"
(:return concat(concat($lib/title/text(), " - "), $lib/author/text()):)
return $lib/title/text()
:)

(:Ordenación:)
for $lib in /bib/book
order by $lib/title descending
return $lib/title/text()