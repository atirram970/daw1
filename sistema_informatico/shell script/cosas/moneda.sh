#!/bin/bash



#Leer el número de lanzamientos

echo "LANZAMIENTO DE MONEDA"
echo "---------------------"

read -p "Número de lanzamientos: " lanza

numcaras=0

for ((i=0 ; i<$lanza ; i++));
do

	valor=$[$RANDOM%2]
	if [ $valor = 0 ]; then
		numcaras=$[$numcaras+1]
	fi

done

echo "Han salido $numcaras caras y $[$lanza-$numcaras] cruces."
