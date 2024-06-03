(:Obtener todos los países que tienen el euro como moneda:)
let $doc := doc("geografia.xml")
for $pais in $doc/geografia//pais
where $pais/moneda="euro"
return $pais/@nombres