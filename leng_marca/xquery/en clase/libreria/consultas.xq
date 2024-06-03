let $doc := doc("libreria.xml")
let $libro := $doc/libreria/libro
let $oferta := $doc/libreria/oferta
let $textoRepetido := ("a", "b", "c", "a", "b", "d")
let $muchosNumeros := 
<numeros>
  <numero>5</numero>
  <numero>6</numero>
  <numero>4</numero>
  <numero>5</numero>
</numeros>

for $libros in $libro
for $ofertas in $oferta
where $libro/titulo = $oferta/reflibro

return
<consulta>
  <text>{$libro/titulo/text()}</text>
  <node>{$libro/node()}</node>
  <element>{$libro/element()}</element>
  <attribute>{distinct-values($libro/attribute())}</attribute>
  <substring>{substring("camaleon", 1, 4)}</substring>
  <string-length>{string-length("camaleon")}</string-length>
  <upper-case>{upper-case("camaleon")}</upper-case>
  <lower-case>{lower-case("CAMALEON")}</lower-case>
  <ends-with>{ends-with("camaleon", "n")}</ends-with>
  <starts-with>{starts-with("camaleon", "c")}</starts-with>
  <contains>{contains("camaleon", "c")}</contains>
  <round>{round(5.51)}</round>
  <floor>{floor(5.51)}</floor>
  <ceiling>{ceiling(5.51)}</ceiling>
  <avg>{avg($muchosNumeros/numero)}</avg>
  <sum>{sum($muchosNumeros/numero)}</sum>
  <count>{count($muchosNumeros/numero)}</count>
  <max>{max($muchosNumeros/numero)}</max>
  <min>{min($muchosNumeros/numero)}</min>
  <empty>{empty($muchosNumeros)}</empty>
  <exists>{exists($muchosNumeros)}</exists>
  <distinct-values>{distinct-values($textoRepetido)}</distinct-values>
  <distinct-values>{distinct-values($muchosNumeros/numero)}</distinct-values>
  <remove>{remove($muchosNumeros/numero, 2)}</remove>
  <current-date>{current-date()}</current-date>
  <current-time>{current-time()}</current-time>
  <current-dateTime>{current-dateTime()}</current-dateTime>
  <year-from-date>{year-from-date(xs:date("2024-05-14"))}</year-from-date>
  <month-from-date>{month-from-date(xs:date("2024-05-14"))}</month-from-date>
  <day-from-date>{day-from-date(xs:date("2024-05-14"))}</day-from-date>
  <hours-from-time>{hours-from-time(xs:time("12:05:30"))}</hours-from-time>
  <minutes-from-time>{minutes-from-time(xs:time("12:05:30"))}</minutes-from-time>
  <seconds-from-time>{seconds-from-time(xs:time("12:05:30"))}</seconds-from-time>
</consulta>