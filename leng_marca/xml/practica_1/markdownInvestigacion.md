# Markdown

Markdown es un lenguaje de marcado que permite dar formato a textos de manera sencilla, creado en 2004 por John Gruber y Aaron Swartz.
Con el objetivo de facilitar la escritura y la lectura de documentos en la web. 
Markdown se basa en el uso de caracteres especiales como asteriscos, almohadillas, corchetes o guiones para indicar el estilo o la estructura del texto

Se puede convertir a otros formatos como HTML, PDF o RTF mediante herramientas específicas.
Algunas aplicaciones web como GitHub, Stack Overflow o Reddit utilizan Markdown como lenguaje de edición de textos, se puede usar Markdown también para crear presentaciones, libros, blogs o páginas web.

A continuación voy a mostrar algunos elementos básicos que se pueden usar en Markdown:

- Párrafos y saltos de línea: Para crear un párrafo se escribe el texto sin dejar líneas en blanco entre ellos y para el salto de linea se dejan dos espacios al final de la línea y se pulsa intro.

- Énfasis: Para poner una palabra o frase en negrita se usan dos asteriscos o dos guiones bajos alrededor del texto, así: `**negrita**` o `__negrita__`. Para ponerla en cursiva se usa un asterisco o un guión bajo, así: `*cursiva*` o `_cursiva_`. Se pueden combinar ambos estilos, así: `**_negrita y cursiva_**`.

- Listas: Para crear una lista no ordenada se usan guiones, asteriscos o signos más al principio de cada elemento, así:

```
- Elemento 1
- Elemento 2
- Elemento 3
```

Para crear una lista ordenada se usan números seguidos de un punto, así:

```
1. Elemento 1
2. Elemento 2
3. Elemento 3
```

- Enlaces: Para crear un enlace se usan corchetes para el texto del enlace y paréntesis para la URL, así: `[texto](url)`. Por ejemplo: `[IONOS](https://www.ionos.es/)`. También se pueden usar referencias numéricas al final del documento, así: `[texto][1]` y luego `[1]: url`. Por ejemplo: `[IONOS][1]` y luego `[1]: https://www.ionos.es/`.

- Imágenes: Para insertar una imagen se usa el mismo formato que para los enlaces, pero se añade un signo de exclamación al principio, así: `![texto](url)`. Por ejemplo: `![Logo de IONOS](https://www.ionos.es/digitalguide/fileadmin/DigitalGuide/Teaser/IONOS-Logo.png)`.

- Código: Para mostrar un fragmento de código se usan comillas invertidas alrededor del texto, así: `` `código` ``. Por ejemplo: `` `print("Hola mundo")` ``. Para mostrar un bloque de código se usan tres comillas invertidas al principio y al final del bloque, y se puede especificar el lenguaje de programación, así:

```python
def suma(a, b):
  return a + b

print(suma(2, 3))
```

- Citas: Para crear una cita se usa el signo mayor que al principio de la línea, así: `> cita`. Por ejemplo: `> La vida es lo que pasa mientras haces otros planes.`

- Encabezados: Para crear encabezados de diferentes niveles se usan almohadillas al principio de la línea, desde una hasta seis, así: `# Encabezado 1`, `## Encabezado 2`, `### Encabezado 3`, etc. Por ejemplo:

# Encabezado 1
## Encabezado 2
### Encabezado 3

- Reglas horizontales: Para crear una regla horizontal se usan tres o más guiones, asteriscos o signos menos seguidos, así: `---`, `***` o `___`. Por ejemplo:

---

Voy a usar [Free Markdown to HTML](https://markdowntohtml.com/) para transformar mi documento markdown a HTML

## Diferencias entre Markdown y HTML visualmente:
- Con el convertidor que he usado, no he notado ninguna diferencia visual notable

Aquí Un enlace del segundo archivo de markdown con la sintaxis de esta

[Documento Sintaxis Markdown](markdownSintaxis.md)

[Enlace repositorio github](https://github.com/atirram970/daw1/tree/main/leng_marca/practica_1)