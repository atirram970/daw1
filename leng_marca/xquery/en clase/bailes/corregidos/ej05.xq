(: Mostrar los nombres de los bailes que contienen una c :)
for $nombre_baile in doc("bailes.xml")//baile/nombre
where contains($nombre_baile,"r")
return $nombre_baile/text()