#!/bin/bash
# Ejemplo de menú

function mostrar_menu() {
	clear
	echo "MENU PRINCIPAL"
	echo "--------------"
	echo ""
	echo "1. Listado de ficheros."
	echo "2. Directorio actual."
	echo "3. Listado detallado de ficheros."
	echo "4. Salir."
}

function listado() {
	clear
	echo "LISTADO"
	echo "-------"

	ls

	read
}

function directorio_actual() {
	clear
	echo "DIRECTORIO ACTUAL"
	echo "-----------------"

	pwd

	read
}

function listado_detallado() {
	clear
	echo "LISTADO DETALLADO"
	echo "-----------------"

	ls -l

	read
}

opcion=5
while [ "$opcion" != "4" ]; do
	mostrar_menu
	read -p "Introduzca una opción: " opcion

	case "$opcion" in
		"1") listado
		;;
		"2") directorio_actual
		;;
		"3") listado_detallado
		;;
		"4")
		;;
		*)
		;;
	esac
done
