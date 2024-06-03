(:5. Modelo de las impresoras que soportan instalación en red.:)
for $impresora in doc("impresoras.xml")//impresora
(:where $impresora/enred:)
where exists($impresora/enred) 
return
<impresora>
  <modelo>{$impresora/modelo/text()}</modelo>
</impresora>