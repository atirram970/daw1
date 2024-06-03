#!/bin/bash

echo "El primer parámetro es $1"
echo "El segundo parámetro es $2"
echo "Todos los parámetros: $@"
#echo "Todos los parámetros: $*"
echo "Número de parámetros: $#"

cadena="Hola Mundo"
echo "Longitud de la cadena: ${#cadena}"
echo "Subcadena: ${cadena:0:4}"
nueva_cadena=${cadena/Mundo/Amigos}
echo "Nueva cadena: $nueva_cadena"
