(:11a. Obtener el nombre del y el precio del baile con el precio más caro:)
let $maximo := max (
for $baile in doc("bailes.xml")//bailes/baile
return $baile/precio/text()
)
for $baile in doc("bailes.xml")//bailes/baile
where $baile/precio = $maximo
return
<baile>
  <nombre>{$baile/nombre/text()}</nombre>
  <precio>{$baile/precio/text()}</precio>
</baile>