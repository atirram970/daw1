(:1. modelos de las impresoras laser:)
for $impresora in doc("impresoras.xml")//impresora
where $impresora/@tipo = "láser"
return
<impresora>
  <marca>{$impresora/marca/text()}</marca>
  <modelo>{$impresora/modelo/text()}</modelo>
</impresora>