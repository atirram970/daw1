(:a. Obtener todos los ríos que pasan por España:)
let $doc := doc("geografia.xml")
for $rios in $doc//rios/rio
where $rios/pais = 'España'
return 
<nombreRios>{$rios/nombre/text()}</nombreRios>