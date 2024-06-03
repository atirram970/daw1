(:b. Obtener todos los ríos que pasan por países de Europa:)
let $doc := doc("geografia.xml")
for $rios in $doc//rios/rio
where $rios/pais = 'España' or 'Francia' or 'Suiza'
return 
<nombreRios>{$rios/nombre/text()}</nombreRios>