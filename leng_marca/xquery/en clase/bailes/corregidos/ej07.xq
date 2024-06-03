(:Mostrar los bailes que tienen id > 3 :)
for $baile in doc("bailes.xml")//baile
where $baile/@id > 3
return $baile/nombre/text()