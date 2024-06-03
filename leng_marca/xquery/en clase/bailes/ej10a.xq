(:10a. Mostrar precio baile más caro:)
max(
  for $baile in doc("bailes.xml")//bailes/baile
  return $baile/precio/text() 
)
