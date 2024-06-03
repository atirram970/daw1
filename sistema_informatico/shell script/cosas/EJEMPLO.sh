#!/bin/bash

function mostrar_menu() {
	clear
	echo "MENU PRINCIPAL"
	echo "--------------"
	echo ""
	echo "1. Leer archivo"
	echo "2. Sobrescribir en archivo"
	echo "3. Insertar en archivo"
	echo "4. Borrar archivo"
	echo "5. Copiar archivo"
	echo "6. Salir"
}

function existe_archivo() {
	if [ -f $1 ]; then
		return 1	
	else
		return 0
	fi
}

function leer() {
	clear
	echo "LEER ARCHIVO"
	echo "------------"
	
	ls *.txt
	
	read -p "¿Qué archivo quieres leer? " fich
	existe=$(existe_archivo $fich)
	echo "$existe"
	if [ $existe ]; then
		while IFS= read -r linea
		do
				echo "$linea"
		
		done < $fich
	else
		read -p "Quieres crear el archivo $fich (S/N): " resp
		if [ $resp = "S" ] || [ $resp = "s" ]; then
			touch $fich
			echo "El archivo $fich ha sido creado."
		else
			echo "El archivo $fich no se ha creado"
		fi
	fi
	read
}

function sobrescribir() {
	clear
	echo "SOBRESCRIBIR EN ARCHIVO"
	echo "-----------------------"
	
	ls *.txt
	
	read -p "¿Qué archivo quieres sobreescribir? " fich
	
	
	read -p "Dime qué quieres sobrescribir en el archivo $fich: " linea
	
	echo "$linea" > $fich
		
	read
}

function insertar() {
	clear
	echo "INSERTAR EN ARCHIVO"
	echo "--------------------"
	
	ls *.txt
	
	read -p "¿En qué archivo quieres insertar? " fich
	
	read -p "Dime qué quieres insertar en el archivo $fich: " linea
	
	echo "$linea" >> $fich
		
	read
}

function borrar() {
	clear
	echo "BORRAR EN ARCHIVO"
	echo "-----------------"
	
	ls *.txt
	
	read -p "¿Qué archivo quieres borrar? " fich
	
	if [ -f $fich ]; then	
		rm $fich
		echo "$fich BORRADO"
	else
		echo "El archivo $fich no existe"
	fi	

	read	
	
}

function copiar() {
	clear
	echo "COPIAR ARCHIVO"
	echo "--------------------"
	ls *.txt
	
	read -p "¿Qué archivo quieres copiar? " fich
	
	if [ -f $fich ]; then	
		
		read -p "Dime la ruta donde lo quieres copiar: " ruta
		if [ "$ruta" = "./" ]; then
			read -p "Dime otro nombre para el archivo: " nom
			cp $fich $nom
		else
			cp $fich $ruta
		fi
	else
		echo "El archivo no existe"
	fi	

	read	
	
}

# PROGRAMA PRINCIPAL

#Comprobamos si existe el archivo, si no existe se crea


#Gestión del menú
opcion=0
while [ "$opcion" != "6" ]; do
	mostrar_menu
	read -p "Introduzca una opción: " opcion

	case "$opcion" in
		"1") leer
		;;
		"2") sobrescribir 
		;;
		"3") insertar 
		;;
		"4") borrar
		;;
		"5") copiar
		;;
		"6")
		;;
		*)
		;;
	esac
done
