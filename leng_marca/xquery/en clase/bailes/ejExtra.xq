(: extra. Muestra todos los tipos de cuota de pago:)
for $nombre_baile in doc("bailes.xml")//baile/precio/@cuota
return $nombre_baile