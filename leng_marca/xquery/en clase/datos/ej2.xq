(:La cantidad de piezas de la ciudad:)
let $doc := doc("datos.xml")
let $partes := $doc//parte
let $partes_londres := $doc//parte[ciudad = 'Londres']
return 
<partes>
  <N_Total>{count($partes)}</N_Total>
  <N_Londres>{count($partes_londres)}</N_Londres>
</partes>
