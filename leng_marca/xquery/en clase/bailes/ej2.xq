(: 2. Muestra el nombre y precio de todos los bailes :)
for $nodo_baile in doc("bailes.xml")//baile
return
<baile>
  <nombre>{$nodo_baile/nombre/text()}</nombre>
  <precio>{$nodo_baile/precio/text()}</precio>
</baile>