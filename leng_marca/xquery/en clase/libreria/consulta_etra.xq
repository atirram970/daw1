(:Obtener titulos y precios + el idioma como atributo de los libros que están en oferta actualmente:)

let $doc := doc("libreria.xml")
let $hoy := current-date()
let $ofertas := 
for $oferta in $doc//oferta
where
$hoy >= $oferta/fecha_inicio and $hoy <= $oferta/fecha_fin
return $oferta
for $libro in $doc//libro
where $libro/titulo/text() = $ofertas/reflibro
order by $libro/titulo/@idioma
return
<libro>
  <titulo>{$libro/titulo/@idioma}{$libro/titulo/text()}</titulo>
  <precio>{$libro/precio/text()}</precio>
</libro>