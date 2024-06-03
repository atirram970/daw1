#!/bin/bash

#Este programa suma los argumentos que le pasemos
#Suma todos los parametros que le 

# Verifica que se hayan proporcionado argumentos
if [ $# -eq 0 ]; then
    echo "Uso: $0 num1 num2 num3 ..."
    exit 1
fi

suma=0
limite=$#
# Recorre todos los argumentos y los suma
for (( i = 0; i < limite; i++ )); do
  suma=$[$suma+$1]
  shift
done

# Imprime el resultado
echo "La suma de los números proporcionados es: $suma
