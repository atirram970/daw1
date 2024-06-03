(:Obtener todos los países que tienen el euro como moneda:)
let $doc := doc("geografia.xml")
let $paises := $doc/geografia/paises/pais[moneda = 'euro']
return 
<ol>
{
  for $pais in $paises
  order by $pais/@nombre
  return <li>{$pais/@nombre/data()}</li>
}
</ol>