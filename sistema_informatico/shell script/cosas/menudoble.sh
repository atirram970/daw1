#!/bin/bash
# Ejemplo de menú

function mostrar_menu() {
	clear
	echo "MENU PRINCIPAL"
	echo "--------------"
	echo ""
	echo "1. Listado de ficheros."
	echo "2. Directorio actual."
	echo "3. Salir."
}

function mostrar_menu_listado() {
	clear
	echo "MENU LISTADO"
	echo "------------"
	echo ""
	echo "1. Listado de ficheros simple."
	echo "2. Listado de ficheros detallado."
	echo "3. Salir."
}

function listado() {
	opcion2=5
	while [ "$opcion2" != "3" ]; do
	mostrar_menu_listado
	read -p "Introduzca una opción: " opcion2
	case "$opcion2" in
			"1") 	clear
				echo "LISTADO"
				echo "-------"
				ls
				read
			;;
			"2")    clear
				echo "LISTADO DETALLADO"
				echo "-------"
				ls -l
				read
			;;
			"3") 	break 
			;;
			*)
			;;
		esac
	done
}

function directorio_actual() {
	clear
	echo "DIRECTORIO ACTUAL"
	echo "-----------------"
	pwd
	read
}


opcion=5
while [ "$opcion" != "3" ]; do
	mostrar_menu
	read -p "Introduzca una opción: " opcion

	case "$opcion" in
		"1") listado
		;;
		"2") directorio_actual
		;;
		"3") break
		;;
		*)
		;;
	esac
done
