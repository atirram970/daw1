(:Obtener el día, mes y año de comienzo de los bailes mensuales:)
for $baile in doc("bailes.xml")//bailes/baile
where $baile/precio/@cuota = "mensual"
return
<baile>
<nombre>{$baile/nombre/text()}</nombre>
<dia_comienzo>{day-from-date(xs:date($baile/comienzo))}</dia_comienzo>
<mes_comienzo>{month-from-date($baile/comienzo)}</mes_comienzo>
<anio_comienzo>{year-from-date($baile/comienzo)}</anio_comienzo>
</baile>