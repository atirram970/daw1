(:Obtener cuántos libros hay que no disponen de formato digital almacenados en el XML:)
let $libros := doc("libreria.xml")//libro
return
<libros>
  <NLibroSinFormatoDigital>{count($libros[not(elibro)])}</NLibroSinFormatoDigital>
</libros>
