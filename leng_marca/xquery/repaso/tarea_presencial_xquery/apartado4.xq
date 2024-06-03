(: 
Obtener una lista ordenada alfabéticamente por el nombre de cada país.
Ejemplo:
<ol>
<li>Argentina</li>
<li>España</li>
<li>Francia</li>
<li>Jamaica</li>
<li>Suiza</li>
<li>Uruguay</li>
</ol> 
:)
let $doc := doc("geografia.xml")
let $paises := $doc/geografia/paises/pais
return 
<ol>
{
  for $pais in $paises
  order by $pais/@nombre
  return <li>{$pais/@nombre/data()}</li>
}
</ol>