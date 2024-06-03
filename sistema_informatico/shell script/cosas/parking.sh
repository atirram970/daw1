#!/bin/bash



#Comprobamos si existe el archivo, si no existe se crea
if ! [ -f parking.txt ]; then
	touch parking.txt	
fi

#Leemos la matricula
clear
echo "PARKING"
echo "-------"
read -p "Matricula: " matr

#Si es la cadena vacía no hacemos nada
while [ "$matr" != "" ]; do
	L=$(grep ^$matr parking.txt)

	# Si grep me devuelve 0 (éxito) que se guarda en la variable $?,
	# quiere decir que la matrícula está en el fichero
	# así que podemos borrarlo del fichero

	if [ "$?" = "0" ]; then
		clear
		echo "SALIENDO..."
		sleep 5
		sed -i /^$matr/d parking.txt	
				
	else
	# Si grep me devuelve 1 (error) quiere decir que la matrícula
	# no está en el fichero, así que debemos escribirlo en el fichero
		clear
		echo "ENTRANDO..."
		sleep 5
		#Guardar fecha y hora
		f=$(date +%d/%m/%y)
		h=$(date +%H:%M)
		#Añadimos la linea al archivo
		echo "$matr $f $h" >> parking.txt
	fi	


	clear
	echo "PARKING"
	echo "-------"
	
	read -p "Matricula: " matr
done
