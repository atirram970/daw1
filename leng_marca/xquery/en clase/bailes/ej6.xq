(:6. Mostrar nombre de los bailes donde el profesor sea Lozano:)

for $baile in doc("bailes.xml")//baile
where  contains($baile/profesor/text(), "Lozano")
return $baile/nombre/text()