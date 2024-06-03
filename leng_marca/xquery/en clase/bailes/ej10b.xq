(:10b. Obtener el nombre del y el precio del baile con el precio más barato :)
let $minimo := min (
for $baile in doc("bailes.xml")//bailes/baile
return $baile/precio/text()
)
for $baile in doc("bailes.xml")//bailes/baile
where $baile/precio = $minimo
return
<baile>
  <nombre>{$baile/nombre/text()}</nombre>
  <precio>{$baile/precio/text()}</precio>
</baile>