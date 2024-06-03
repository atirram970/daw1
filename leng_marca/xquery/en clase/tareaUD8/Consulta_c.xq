(:Mostrar la estructura de una tabla de HTML con la cantidad total de libros y 
precio medio entre todos los libros:)
let $libros := doc("libreria.xml")//libro
return
<html>
<head>
  <title>Resumen de Libros</title>
</head>
<body>
  <table border="1">
    <tr>
      <th>Cantidad Total de Libros</th>
      <th>Precio Medio</th>
    </tr>
    <tr>
      <td>{count($libros)}</td>
      <td>{round(avg($libros/precio), 2)}</td>
    </tr>
  </table>
</body>
</html>