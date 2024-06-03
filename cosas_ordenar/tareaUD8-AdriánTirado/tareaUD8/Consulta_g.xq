(:Obtener las categorías de libros que hayan tenido alguna oferta.:)

let $libros := doc("libreria.xml")//libro
let $ofertas := doc("libreria.xml")//oferta
return
<libros>
{
  for $categoria in distinct-values($libros/@categoria)
  where some $oferta in $ofertas satisfies $oferta/reflibro = $libros/titulo
  return
    <categoria>{$categoria}</categoria>
}
</libros>
