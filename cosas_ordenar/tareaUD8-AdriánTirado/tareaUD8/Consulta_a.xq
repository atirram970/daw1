(:Obtener el título y el precio de aquellos los libros que hayan tenido alguna 
oferta entre el 2020 o 2021:)

for $libro in doc("libreria.xml")//libro
let $oferta := doc("libreria.xml")//oferta
where $oferta/fecha_inicio >= "2020-01-01" and $oferta/fecha_fin <= "2021-12-31" and $oferta/reflibro = $libro/titulo
return
<libro>
  <titulo>{$libro/titulo/text()}</titulo>
  <precio>{$libro/precio/text()}</precio>
</libro>