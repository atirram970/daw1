(:La ciudad de los proveedores que tienen un codigo de estado mayor a 15:)
let $doc := doc("datos.xml")
let $proveedor := $doc//proveedor[ estado > 15 ]
return $proveedor/ciudad/text()