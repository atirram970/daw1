(:3. Marca y modelo de las impresoras que puedan imprimir en a3:)
for $impresora in doc("impresoras.xml")//impresora
where $impresora/tamanios/tamanio = "A3"
return
<impresora>
  <marca>{$impresora/marca/text()}</marca>
  <modelo>{$impresora/modelo/text()}</modelo>
</impresora>