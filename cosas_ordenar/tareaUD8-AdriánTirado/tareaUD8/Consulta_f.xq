(:Obtener el nodo completo de todos los libros con un precio entre 20 y 40, 
ambos no incluidos, ordenados por el año de forma descendente:)

let $libros := doc("libreria.xml")//libro
return
<libros>
{
  for $libro in $libros
  where $libro/precio > 20 and $libro/precio < 40
  order by xs:integer($libro/anio) descending
  return $libro
}
</libros>
