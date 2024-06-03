(: 1. Muestra el nombre de todos los bailes:)
for $nombre_baile in doc("bailes.xml")//baile/nombre
return $nombre_baile/text()