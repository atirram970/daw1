(:5. Modelo de las impresoras que soportan instalación en red.:)
for $impresora in doc("impresoras.xml")/impresoras/impresora
where exists($impresora/enred)
(: También funcionaría --> where $impresora/enred :)
return
$impresora/modelo/text()