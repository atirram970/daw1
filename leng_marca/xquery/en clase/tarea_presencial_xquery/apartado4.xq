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
return
<ol>
{
for $pais in $doc//paises/pais/@nombre/data()
order by $pais
return 
<li>{$pais}</li>
}
</ol>