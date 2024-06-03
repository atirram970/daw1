let $doc := doc("datos.xml")
let $partes_rojas := $doc//parte[color = 'Rojo']
return count($partes_rojas)