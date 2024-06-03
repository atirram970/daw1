(:Obtener el autor, año y precio de cada libro perteneciente a la categoría COCINA que no esté agotado:)
for $libro in doc("libreria.xml")//libro
where $libro/@categoria = 'COCINA' and not($libro/@agotado = 'true')
return
<libro>
  <autor>{$libro/autor/text()}</autor>
  <anio>{$libro/anio/text()}</anio>
  <precio>{$libro/precio/text()}</precio>
</libro>