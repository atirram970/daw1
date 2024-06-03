(:
Obtener una etiqueta XML con la superficie promedio y la superficie total de los países europeos con separador de miles y 2 decimales. Indicando la unidad en un atributo
Ejemplo:
<superficie_total unidad="km2">1.345.944</superficie_total>
<superficie_media unidad="km2">407.117,33</superficie_media>
:)
let $doc := doc("geografia.xml")
let $total := format-number(sum($doc//paises/pais/superficie), '#.00')
let $media := format-number(avg($doc//paises/pais/superficie), '#.00')
return
<superficie>
    <superficie_total unidad="km2">{$total}</superficie_total>
    <superficie_media unidad="km2">{$media}</superficie_media>
</superficie>