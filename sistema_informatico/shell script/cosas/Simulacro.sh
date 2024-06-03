#!/bin/bash
# Simulacro

oldIFS=$IFS

function mostrar_menu() {
	clear
	echo "MENU PRINCIPAL"
	echo "--------------"
	echo ""
	echo "1. Operaciones básicas"
	echo "2. Operaciones avanzadas"
	echo "0. Salir."
}

function mostrar_menu_basicas() {
	clear
	echo "MENU OPERACIONES BÁSICAS"
	echo "--------------------------"
	echo ""
	echo "1. Suma."
	echo "2. Resta."
	echo "3. Multiplicar."
	echo "4. Dividir."
	echo "0. Salir."
}

function mostrar_menu_avanzadas() {
	clear
	echo "MENU OPERACIONES BÁSICAS"
	echo "--------------------------"
	echo ""
	echo "1. Módulo."
	echo "2. Potencia."
	echo "3. Raíz Cuadrada."
	echo "0. Salir."
}


function sumar() {
	clear
	echo "SUMA"
	echo "----"
	if [ $op_ent -eq 1 ]; then
		echo "El resultado es $[$n1+$n2]"		
	else
		if [ ! -f $fich ]; then
			echo "Perdona, $fich no es un fichero"
		else 
			while IFS=" " read -r nf1 nf2
			do
				echo "$nf1 + $nf2 = $[$nf1+$nf2]"		
			done < $fich
		fi
	fi
	read
}

function raiz_cuadrada() {
	clear
	echo "RAIZ CUADRADA"
	echo "-------------"
				
	if [ $op_ent -eq 1 ]; then
		echo "El resultado es $(echo "sqrt($n1)" | bc)"		# Potencia $(echo "$n1^$n2" | bc)"	
	else
		if [ ! -f $fich ]; then
			echo "Perdona, $fich no es un fichero"
		else 
			while IFS=" " read -r nf1 nf2
			do
				echo "$nf1 + $nf2 = $[$nf1+$nf2]"		
			done < $fich
		fi
	fi
	read
}


function operaciones_basicas() {
	opcion2=5
	while [ "$opcion2" != "0" ]; do
	mostrar_menu_basicas
	read -p "Introduzca una opción: " opcion2
	case "$opcion2" in
			"1") sumar
			;;
			"2")    clear
				echo "RESTA"
				echo "-----"
				
				read
			;;
			"3")    clear
				echo "MULTIPLICAR"
				echo "-----------"
				
				read
			;;
			"4")    clear
				echo "DIVIDIR"
				echo "------."
				
				read
			;;
			"0") 	break 
			;;
			*)
			;;
		esac
	done
}

function operaciones_avanzadas() {
	clear
	opcion3=5
	while [ "$opcion3" != "0" ]; do
	mostrar_menu_avanzadas
	read -p "Introduzca una opción: " opcion3
	case "$opcion3" in
			"1") 	clear
				echo "MÓDULO"
				echo "------"
				
				read
			;;
			"2")    clear
				echo "POTENCIA"
				echo "--------"
				
				read
			;; 
			"3")    raiz_cuadrada
			;;
			"0") 	break 
			;;
			*)
			;;
		esac
	done

}


# COMIENZA EL PROGRAMA PRINCIPAL

until [ $op_ent -eq 1 -o $op_ent -eq 2 ]
do
	clear
	echo "ENTRADA DE DATOS"
	echo "--------------"
	echo ""
	echo "1. Por teclado"
	echo "2. Por archivo"
	read -p "Elija una opcion: " op_ent
done
if [ $op_ent -eq 1 ]; then
	clear
	read -p "Introduzca el primer número: " n1
	read -p "Introduzca el segundo número: " n2
else
	clear
	read -p "Introduza la ruta absoluta del fichero: " fich
fi

opcion=5
while [ "$opcion" != "0" ]; do
	mostrar_menu
	read -p "Introduzca una opción: " opcion

	case "$opcion" in
		"1") operaciones_basicas
		;;
		"2") operaciones_avanzadas
		;;
		"0") break
		;;
		*)
		;;
	esac
done

IFS=$oldIFS
