(:4. Marca y modelo de las impresoras que puedan imprimir en a3 y que puedan imprimir a mas de 1 tamaño:)
for $impresora in doc("impresoras.xml")//impresora
where $impresora/tamanios/tamanio = "A3" and count($impresora/tamanios/tamanio)>1
return
<impresora>
  <marca>{$impresora/marca/text()}</marca>
  <modelo>{$impresora/modelo/text()}</modelo>
</impresora>