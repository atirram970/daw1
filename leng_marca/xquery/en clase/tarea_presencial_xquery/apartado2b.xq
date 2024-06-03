(:b. Obtener todos los ríos que pasan por países de Europa:)
let $doc := doc("geografia.xml")
let $paises_europeos := $doc//continente[@nombre="Europa"]/pais
for $rio in $doc//rio
where $rio/pais = $paises_europeos
return $rio/nombre/text()