(: 1. Muestra el nombre de todos los bailes :)
for $nomBaile in doc("bailes.xml")//baile/nombre
return $nomBaile/text()