#!/bin/bash
# Ejemplo de menú

function mostrar_menu() {
	clear
	echo "MENU PRINCIPAL"
	echo "--------------"
	echo ""
	echo "1. Entrada al parking"
	echo "2. Salida del parkinpog"
	echo "3. Listado por matrícula"
	echo "4. Listado por fecha"
	echo "5. Salir"
}

function entrada() {
	clear
	echo "ENTRADA A PARKING"
	echo "-----------------"
	read -p "Introduzca la matrícula: " matr
	while [ "$matr" != "" ]; do
		L=$(grep ^$matr parking.txt)

		# Si grep me devuelve 0 (éxito) que se guarda en la variable $?,
		# quiere decir que la matrícula está en el fichero
		# así que debemos mostrar mensaje de que el coche está YA en el parking
		if [ "$?" = "0" ]; then
			clear
			echo "El coche con esta matrícula ya ha entrado una vez en el parking."
			sleep 5
			# sed -i /^$matr/d parking.txt	
		else
		# Si grep me devuelve 1 (error) quiere decir que la matrícula
		# no está en el parking, así que debemos escribirlo en el fichero
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
		echo "ENTRADA A PARKING"
		echo "-----------------"
		read -p "Introduzca la matrícula: " matr
			
	done
}

function salida() {
	clear
	echo "SALIDA DE PARKING"
	echo "-----------------"
	read -p "Introduzca la matrícula: " matr
	while [ "$matr" != "" ]; do
		L=$(grep ^$matr parking.txt)

		# Si grep me devuelve 0 (éxito) que se guarda en la variable $?,
		# quiere decir que la matrícula está en el fichero
		# así que debemos mostrar mensaje de que el coche está YA en el parking
		if [ "$?" = "0" ]; then
			clear
			echo "SALIENDO..."
			sleep 5
			#Guardar fecha y hora
			f=$(date +%d/%m/%y)
			h=$(date +%H:%M)
			#Añadimos la linea al archivo
			echo "$matr $f $h" >> parking.txt
			#sed -i /^$matr/d parking.txt	
		else
		# Si grep me devuelve 1 (error) quiere decir que la matrícula
		# no está en el parking, así que debemos de mostrar mensaje de
		# que el coche NO está
			clear
			echo "El coche con esta matrícula no está en el parking"
			sleep 5			
		fi
		
		clear
		echo "ENTRADA A PARKING"
		echo "-----------------"
		read -p "Introduzca la matrícula: " matr
	done
}


function listado_matricula() {
	
	clear
	echo "LISTADO DE PARKING POR MATRICULA"
	echo "--------------------------------"
	read -p "Introduzca la matrícula: " matr
	
	echo -e "MATRICULA\tFECHA\t\tHORA"
	echo -e "---------\t-----\t\t----"
	while IFS=" " read -r matricula fecha hora
	do
		if [ "$matr" = "$matricula" ]; then
			echo -e "$matricula\t\t$fecha\t$hora"
		fi
	done < parking.txt
	read

}

function listado_fecha() {
	
	clear
	echo "LISTADO DE PARKING POR FECHA"
	echo "--------------------------------"
	read -p "Introduzca la fecha (DD/MM/YY): " fech
	
	echo -e "MATRICULA\tHORA"
	echo -e "---------\t----"
	while IFS=" " read -r matricula fecha hora
	do
		if [ "$fech" = "$fecha" ]; then
			echo -e "$matricula\t\t$hora"
		fi
	done < parking.txt
	read

}

#COMIENZA EL SCRIPT PRINCIPAL 

oldIFS=$IFS # Guardo el IFS del sistema

#Comprobamos si existe el archivo, si no existe se crea

if ! [ -f parking.txt ]; then
	touch parking.txt	
fi

#Gestión del menú
opcion=6
while [ "$opcion" != "5" ]; do
	mostrar_menu
	read -p "Introduzca una opción: " opcion

	case "$opcion" in
		"1") entrada
		;;
		"2") salida
		;;
		"3") listado_matricula
		;;
		"4") listado_fecha
		;;
		"5")
		;;
		*)
		;;
	esac
done

IFS=$oldIFS #Restauro el valor de IFS del sistema
IFS=$oldIFS
