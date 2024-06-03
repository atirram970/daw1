(:Obtener los títulos de los libros que disponen de formato digital:)
let $libros := doc("libreria.xml")//libro
return
<libros>
{
  for $libro in $libros[elibro]
  return
    <libro>
      <titulo>{$libro/titulo/text()}</titulo>
    </libro>
}
</libros>
