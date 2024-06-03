(:4. Una lista HTML con el nombre de los artistas nacidos en españa:)
<ul>
  {
    for $artista in doc("artistas.xml")//artista
    where $artista/pais = 'España'
    return
    <li>{$artista/nombreCompleto/text()}</li>
  }
</ul>