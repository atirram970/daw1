(:Obtener el importe total recaudado por cada baile mensualmente:)
for $baile in doc("bailes.xml")//bailes/baile
let $total := if ($baile/precio/@cuota = "trimestral") then (
  (number($baile/precio/text())*number($baile/plazas/text()) div 3)
) else (
    if ($baile/precio/@cuota = "anual") then (
        (number($baile/precio/text())*number($baile/plazas/text()) div 12)
    ) else (
        (number($baile/precio/text())*number($baile/plazas/text()))
    )
)
return
<baile>
<nombre>{$baile/nombre/text()}</nombre>
<importe_mensual>{$total}</importe_mensual>
</baile>