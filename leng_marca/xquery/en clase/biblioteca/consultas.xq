(: Utilizamos un bucle para con una consulta XPATH recorramos una serie de nodos. con $ establecemos variables y con return devolvemos los resultados
for $lib in /bib/book
return $lib/title
:)
(:
for $lib in /bib/book
return <titulo>{$lib/title/text()}</titulo>
:)
(:
for $lib at $index in /bib/book
return <titulo>{$index} - {$lib/title/text()}</titulo>
:)
(:
<biblioteca>
{
for $lib in /bib/book
return <titulo>{$lib/title/text()}</titulo>
}
</biblioteca>
:)
(:
for $lib in /bib/book
return
<book>
{$lib/title}
{if ($lib/year > 2003) then (
  <new/>
) else (
  <old/>
)}
</book>
:)
(:
<books_after_2003>
{
for $lib in /bib/book
return

if ($lib/year > 2003) then (
  <book>
  {$lib/title/text()}
  </book>
)}
</books_after_2003>
:)
(:
for $lib in /bib/book
return
if ($lib/@id > "1") then (
$lib
)
:)
(:
let $libros := /bib/book
return <titulo>{$libros/title}</titulo>
:)
(:Muestra el año de pubicación del último libro
let $libros := /bib/book
return <ultimo_anio_publicacion>{max($libros/year)}</ultimo_anio_publicacion>
:)
(:Uso de cálculo para dar valor a la variable
let $anios := /bib/book
let $maxAnio := (
  max($anios/year)
)
return $maxAnio
:)
(:Facilitar la legibilidad usando variables
for $libro in /bib/book
let $publicador := $libro/publisher/text()
let $titulo := $libro/title/text()
return
<libro>
<titulo>{$titulo}</titulo>
<editorial>{$publicador}</editorial>
</libro>
:)
(:Claúsula WHERE
for $lib in /bib/book
where $lib/author = "Stevens" or $lib/author = "Buneman"
return $lib/title/text()
:)
(:Ordenación:)
for $lib in /bib/book
order by $lib/title descending
return $lib/title/text()