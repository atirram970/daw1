(: 1. Marca y modelo de las impresoras láser :)
for $impresora in doc("impresoras.xml")/impresoras/impresora
where $impresora/@tipo = "láser"
return
<impresora>
<marca>{$impresora/marca/text()}</marca>
<modelo>{$impresora/modelo/text()}</modelo>
</impresora>