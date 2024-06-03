(: Mostrar los bailes que se impartan en la sala 1 y que el precio sea menor a 35 :)
for $baile in doc("bailes.xml")//baile
where $baile/sala/text() = "1" and $baile/number(precio) < 35
return $baile/nombre/text()