(:Obtener las categorías de libros que hayan tenido alguna oferta.:)

let $doc := doc("libreria.xml")
for $libro in $doc//libro
let $oferta := $doc//oferta[reflibro/text()=$libro/titulo/text()]
return
if ($libro/titulo/text() = $oferta) then (
  <libro>
  <categoria>{$libro/@categoria}</categoria>
</libro>
)
