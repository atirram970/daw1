(:Obtener el título y el precio de aquellos los libros que hayan tenido alguna 
oferta entre el 2020 o 2021:)

for $libro in doc("libreria.xml")//libro
let $oferta_inicio := doc("libreria.xml")/libreria/oferta[reflibro/text()=$libro/titulo/text()]/fecha_inicio
let $oferta_fin := doc("libreria.xml")/libreria/oferta[reflibro/text()=$libro/titulo/text()]/fecha_fin
where year-from-date($oferta_inicio) >= 2020 and year-from-date($oferta_fin) <= 2021 or year-from-date($oferta_inicio) < 2020 and year-from-date($oferta_fin) >= 2020
return
<libro>
  <titulo>{$libro/titulo/text()}</titulo>
  <precio>{$libro/precio/text()}</precio>
</libro>