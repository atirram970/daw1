(:Cuál es el baile más caro mensualmente por persona:)
let $baileMasCaro := max(
  for $baile_precio in doc("bailes.xml")//bailes/baile/precio
  return $baile_precio/../@id
)

for $baile in doc("bailes.xml")//bailes/baile
where $baile/@id = $baileMasCaro
return
<baile_mas_caro>
  <nombre>{$baile/nombre/text()}</nombre>
  <id>{$baileMasCaro}</id>
</baile_mas_caro>