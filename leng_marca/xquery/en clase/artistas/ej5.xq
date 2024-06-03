(:5. contar nº artistas nacidos antes de 1600:)
let $artistas :=
for $artista in doc("artistas.xml")//artista
where number($artista/nacimiento) < 1600
return $artista/nombreCompleto/text()
return count($artistas)