(: 3. Muestra el nombre y precio de todos los bailes, pero solo los superiores a 40€ :)
for $nodo_baile in doc("bailes.xml")//baile
where $nodo_baile/number(precio) > 40
return
<baile>
  <nombre>{$nodo_baile/nombre/text()}</nombre>
  <precio>{$nodo_baile/precio/text()}</precio>
</baile>