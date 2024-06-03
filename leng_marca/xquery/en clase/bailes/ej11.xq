(: Obtener el importe total recaudado por cada baile :)
for $baile in doc("bailes.xml")//bailes/baile
return
<baile>
<nombre>{$baile/nombre/text()}</nombre>
<importe_total>{number($baile/precio/text())*number($baile/plazas/text())}</importe_total>
</baile>