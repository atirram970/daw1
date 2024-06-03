(:7. Mostrar nombre de los bailes donde el id > 3:)

for $baile in doc("bailes.xml")//baile
where  $baile/@id > 3
return $baile/nombre/text()