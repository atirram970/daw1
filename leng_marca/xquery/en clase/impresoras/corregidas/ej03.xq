(:3. Marca y modelo de las impresoras que puedan imprimir en tamaño A3 (pueden tener otros).:)
for $impresora in doc("impresoras.xml")/impresoras/impresora
where $impresora/tamanios/tamanio = "A3"
return
<impresora>
<marca>{$impresora/marca/text()}</marca>
<modelo>{$impresora/modelo/text()}</modelo>
</impresora>