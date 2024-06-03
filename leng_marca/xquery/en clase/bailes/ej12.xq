(:12. Obtener el dia-mes-año de comienzo de los bailes mensuales:)
for $baile in doc("bailes.xml")//bailes/baile
where $baile/precio/@cuota = "mensual"
let $fecha := tokenize($baile/comienzo, '/')
return
<baile>
  <nombre>{$baile/nombre/text()}</nombre>
  <dia_comienzo>{$fecha[1]}</dia_comienzo>
  <mes_comienzo>{$fecha[2]}</mes_comienzo>
  <anio_comienzo>{$fecha[3]}</anio_comienzo>
</baile>
