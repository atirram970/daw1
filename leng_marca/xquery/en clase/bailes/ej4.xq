(:4. Mostrar los bailes ordenados por nombre:)

for $nomBaile in doc("bailes.xml")//baile/nombre
order by $nomBaile/nombre/text() ascending
return $nomBaile/text()