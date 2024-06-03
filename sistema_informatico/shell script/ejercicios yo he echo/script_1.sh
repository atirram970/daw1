#!/bin/bash

#Este programa suma los argumentos que le pasemos
#Suma todos los parametros que le pasemos

#!/bin/bash

# Verifica que se hayan proporcionado argumentos
if [ $# -eq 0 ]; then
    echo "Uso: $0 num1 num2 num3 ..."
    exit 1
fi

suma=0
# Recorre todos los argumentos y los suma
for num in "$@";
do
    suma=$((suma + num))
done

# Imprime el resultado
echo "La suma de los números proporcionados es: $suma
