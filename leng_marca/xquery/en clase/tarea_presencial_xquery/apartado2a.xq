(:a. Obtener todos los ríos que pasan por España:)
let $doc := doc("geografia.xml")
for $rio in $doc//rio
where $rio/pais = "España"
return $rio/nombre/text()