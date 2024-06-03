#!/bin/bash

# Verifica si la cadena coincide con un patrón regex
cadena="hola123"
if [[ $cadena =~ [0-9]+$ ]]; then
    echo "La cadena contiene solo números al final."
fi
