#!/bin/bash

echo "Desde 0 a 10"
seq 0 10

echo "Desde 0 a 10 de 2 en 2"
seq 0 2 10

echo "Desde 0 a 10 de 2 en 2, mostrandolo horizontalmente"
seq -s ' ' 0 2 10

echo "Cambiar formato de numeros del seq a FLOAT por ejemplo"
seq -f "%.2f" 1 0.5 3

echo "Mostrar todos los números con mismo ancho (si es 10, el 1 es --> 01)"
seq -w 1 10

echo "Cambiar formato de numeros del seq a fecha"
seq -f "2024-05-%02g" 1 31

echo "Cambiar formato del seq para mostrar Numero: \$num"
seq -f "Número: %g" 1 1 5

echo "Cambiar formato del seq muestre \$num€"
seq -f "Precio: %.2f€" 1 0.5 3
