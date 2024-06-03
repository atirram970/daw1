#!/bin/bash

# Este programa suma los argumentos que le pasemos
# Sólo podemos pasar 2


if [ $# -gt 2 ]; then

	suma=$[$1+$2]
	echo "La suma es $suma"

else

	echo "Los argumentos pasados son: " $*
	echo "Hasta que no facilites dos argumentos no sumo"

fi
