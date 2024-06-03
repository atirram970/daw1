(: 3. Muestra el nombre y precio de todos los bailes, pero solo los superiores a 40€ :)
let $nodo_baile := doc("bailes.xml")//baile
let $cuota := $nodo_baile/precio/@cuota/data()
return
<cuota>{distinct-values($cuota)}</cuota>