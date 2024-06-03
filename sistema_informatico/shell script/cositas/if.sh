#!/bin/bash

archivo="archivo.txt"
directorio="directorio"
cadena1="hola"
cadena2="mundo"
num1=5
num2=10

# Verificar si un archivo existe
if [ -e "$archivo" ]; then
    echo "$archivo existe."
else
    echo "$archivo no existe."
fi

# Verificar si es un archivo regular
if [ -f "$archivo" ]; then
    echo "$archivo es un archivo regular."
else
    echo "$archivo no es un archivo regular."
fi

# Verificar si es un directorio
if [ -d "$directorio" ]; then
    echo "$directorio existe."
else
    echo "$directorio no existe."
fi

# Verificar permisos de lectura
if [ -r "$archivo" ]; then
    echo "$archivo tiene permisos de lectura."
else
    echo "$archivo no tiene permisos de lectura."
fi

# Verificar permisos de escritura
if [ -w "$archivo" ]; then
    echo "$archivo tiene permisos de escritura."
else
    echo "$archivo no tiene permisos de escritura."
fi

# Verificar permisos de ejecución
if [ -x "$archivo" ]; then
    echo "$archivo tiene permisos de ejecución."
else
    echo "$archivo no tiene permisos de ejecución."
fi

# Verificar si un archivo no está vacío
if [ -s "$archivo" ]; then
    echo "$archivo no está vacío."
else
    echo "$archivo está vacío."
fi

# Verificar si un archivo es un enlace simbólico
if [ -h "$archivo" ]; then
    echo "$archivo es un enlace simbólico."
else
    echo "$archivo no es un enlace simbólico."
fi

# Verificar igualdad de cadenas
if [ "$cadena1" = "$cadena2" ]; then
    echo "Las cadenas son iguales."
else
    echo "Las cadenas no son iguales."
fi

# Verificar si una cadena está vacía
if [ -z "$cadena1" ]; then
    echo "La cadena1 está vacía."
else
    echo "La cadena1 no está vacía."
fi

# Verificar si dos números son iguales
if [ "$num1" -eq "$num2" ]; then
    echo "Los números son iguales."
else
    echo "Los números no son iguales."
fi

# Verificar si un número es menor que otro
if [ "$num1" -lt "$num2" ]; then
    echo "$num1 es menor que $num2."
else
    echo "$num1 no es menor que $num2."
fi

# Verificar si ambos comandos se ejecutan correctamente
if ls "$archivo" && echo "Archivo listado"; then
    echo "El comando ls y echo se ejecutaron correctamente."
else
    echo "Uno de los comandos falló."
fi

# Verificar si al menos uno de los comandos se ejecuta correctamente
if ls "$archivo" || echo "Intento listar archivo"; then
    echo "Al menos uno de los comandos se ejecutó correctamente."
else
    echo "Ambos comandos fallaron."
fi

# Verificar si un comando no se ejecuta correctamente
if ! ls "$archivo"; then
    echo "El comando ls no se ejecutó correctamente."
fi
