(:5. Mostrar los nombres de los bailes que contienen una c:)

for $nomBaile in doc("bailes.xml")//baile/nombre/text()
where contains($nomBaile, "c")
return $nomBaile