(:8. Mostrar nombre de los profesores que dan clases de baile con cuota mensual:)

for $baile in doc("bailes.xml")//baile
where $baile/precio/@cuota = "mensual"
return $baile/profesor/text()