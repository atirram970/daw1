#!/bin/bash

# Archivo de ejemplo
echo -e "foo\nbar\nfoo\nbaz" > archivo.txt

# -e: Añade el script de sed al comando
echo "Ejemplo con -e:"
echo "Hola Mundo" | sed -e 's/Mundo/Amigos/'  # Reemplaza "Mundo" con "Amigos"
echo

# -f: Lee el script de sed desde un archivo
echo "Ejemplo con -f:"
echo 's/Mundo/Amigos/' > script.sed
echo "Hola Mundo" | sed -f script.sed  # Usa script.sed para reemplazar "Mundo" con "Amigos"
echo

# -i: Edita los archivos en el lugar
echo "Ejemplo con -i:"
echo "Hola Mundo" > archivo.txt
sed -i 's/Mundo/Amigos/' archivo.txt  # Reemplaza "Mundo" con "Amigos" en el archivo
cat archivo.txt
echo

# -n: Suprime la salida automática
echo "Ejemplo con -n:"
echo -e "1\n2\n3" | sed -n '2p'  # Solo imprime la segunda línea
echo

# -r: Usa expresiones regulares extendidas
echo "Ejemplo con -r:"
echo "2024-05-28" | sed -r 's/[0-9]{4}-[0-9]{2}-[0-9]{2}/Fecha/'  # Reemplaza la fecha con "Fecha"
echo

# -E: Usa expresiones regulares extendidas (opción GNU compatible)
echo "Ejemplo con -E:"
echo "2024-05-28" | sed -E 's/[0-9]{4}-[0-9]{2}-[0-9]{2}/Fecha/'  # Reemplaza la fecha con "Fecha"
echo

# s: Sustitución de texto
echo "Ejemplo con s:"
echo "Hola Mundo" | sed 's/Mundo/Amigos/'  # Reemplaza "Mundo" con "Amigos"
echo

# p: Imprimir líneas
echo "Ejemplo con p:"
echo -e "1\n2\n3" | sed -n '2p'  # Solo imprime la segunda línea
echo

# d: Borrar líneas
echo "Ejemplo con d:"
echo -e "1\n2\n3" | sed '2d'  # Borra la segunda línea
echo

# a: Añadir texto después de una línea
echo "Ejemplo con a:"
echo "Hola" | sed 'a\Mundo'  # Añade "Mundo" después de "Hola"
echo

# i: Insertar texto antes de una línea
echo "Ejemplo con i:"
echo "Mundo" | sed 'i\Hola'  # Inserta "Hola" antes de "Mundo"
echo

# c: Cambiar líneas
echo "Ejemplo con c:"
echo -e "1\n2\n3" | sed '2c\Hola'  # Cambia la segunda línea por "Hola"
echo

# q: Salir de sed antes de procesar todas las líneas
echo "Ejemplo con q:"
echo -e "1\n2\n3" | sed '2q'  # Termina después de la segunda línea
echo

# r: Leer e insertar contenido de un archivo
echo "Ejemplo con r:"
echo "Hola" > archivo1.txt
echo "Mundo" > archivo2.txt
sed 'r archivo2.txt' archivo1.txt  # Inserta el contenido de archivo2.txt en archivo1.txt
echo

# w: Escribir líneas seleccionadas a un archivo
echo "Ejemplo con w:"
echo -e "1\n2\n3" | sed -n '2w archivo.txt'  # Escribe la segunda línea en archivo.txt
cat archivo.txt
echo

# y: Transformar caracteres
echo "Ejemplo con y:"
echo "abc" | sed 'y/abc/ABC/'  # Transforma "abc" a "ABC"
echo

# Número de línea
echo "Ejemplo con número de línea:"
echo -e "1\n2\n3" | sed '2s/2/Dos/'  # Reemplaza "2" con "Dos" en la segunda línea
echo

# Rango de líneas
echo "Ejemplo con rango de líneas:"
echo -e "1\n2\n3\n4" | sed '2,3s/[0-9]/X/'  # Reemplaza dígitos con "X" en la segunda y tercera línea
echo

# Patrón de búsqueda
echo "Ejemplo con patrón de búsqueda:"
echo -e "uno\ndos\ntres" | sed '/dos/s/dos/DOS/'  # Reemplaza "dos" con "DOS" solo en la línea que contiene "dos"
echo

# Combinación de comandos separados por punto y coma
echo "Ejemplo con combinación de comandos:"
echo "foo bar baz" | sed 's/foo/FOO/; s/bar/BAR/'  # Reemplaza "foo" con "FOO" y "bar" con "BAR"
echo

# Combinación de comandos usando -e
echo "Ejemplo con combinación usando -e:"
echo "foo bar baz" | sed -e 's/foo/FOO/' -e 's/bar/BAR/'  # Reemplaza "foo" con "FOO" y "bar" con "BAR"
