(:Obtener el precio del baile con el precio más caro:)
max (
for $baile in doc("bailes.xml")//bailes/baile
return $baile/precio/text()
)