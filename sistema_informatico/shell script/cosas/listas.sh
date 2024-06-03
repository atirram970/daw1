#!/bin/bash
# Ejemplo de recorrido de listas
# Queremos saber que elementos de mi directorio actual es un directorio o es un fichero

for a in $(ls); do

	if [ -f $a ]; then
		echo "$a es un fichero"
	fi
	if [ -d $a ]; then
		echo "$a es un directorio"
	fi
done

sleep 5

clear

function dibuja() {

	case $1 in
	1) echo "        1         "
	   echo "    1   1         "
	   echo "1       1         "
	;;
	2) echo "    22222222      "
	   echo "   2        2     "
	   echo "           2      "
	;;
	9) echo "    99999999      "
	   echo "   9        9     "
	   echo "   9        9     "
	esac
	   
}


for b in 9 8 7 6 5 4 3 2 1 0; do
	clear
	dibuja $b
	sleep 1
done




