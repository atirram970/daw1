#!/bin/bash
# Ejemplo de menú

function mostrar_menu() {
	clear
	echo "MENU PRINCIPAL"
	echo "--------------"
	echo ""
	echo "1. Cuadrado."
	echo "2. Triángulo."
	echo "3. Rectángulo."
	echo "4. Circulo."
	echo "5. Trapecio."
	echo "6. Salir."
		
}

function cuadrado() {

	clear
	echo "CUADRADO"
	echo "------------"
	echo ""
	
	read -p "Cuanto mide el lado del cuadrado: " lado
	opcion2=5
	while [ "$opcion2" != "3" ]; do
	clear	
	echo "CUADRADO"
	echo "------------"
	echo ""
	echo "1. Area."
	echo "2. Perímetro."
	echo "3. Salir."
	
	read -p "Introduzca una opción: " opcion2
	case "$opcion2" in
			"1") 	clear
				echo "CUADRADO - AREA"
				echo "---------------"
				echo "El área del cuadrado mide $[$lado*$lado]."				
				read
			;;
			"2")    clear
				echo "CUADRADO - PERIMETRO"
				echo "--------------------"
				echo "El perímetro del cuadrado mide $[4*$lado]."
				read
			;;
			"3") 	break 
			;;
			*)
			;;
		esac
	done

}

function triangulo() {
	
	clear
	echo "TRIANGULO"
	echo "---------"
	echo ""
	
	read -p "Cuanto mide el lado 1 del triangulo: " lado1
	read -p "Cuanto mide el lado 2 del triangulo: " lado2
	read -p "Cuanto mide el lado 3 del triangulo: " lado3
	read -p "Cuanto mide el altura del triangulo: " altura
	
	opcion2=5
	while [ "$opcion2" != "3" ]; do
	clear	
	echo "TRIANGULO"
	echo "------------"
	echo ""
	echo "1. Area."
	echo "2. Perímetro."
	echo "3. Salir."
	
	read -p "Introduzca una opción: " opcion2
	case "$opcion2" in
			"1") 	clear
				echo "TRIANGULO - AREA"
				echo "---------------"
				echo "El área del cuadrado mide $[($lado1*$altura)/2]."				
				read
			;;
			"2")    clear
				echo "TRIANGULO - PERIMETRO"
				echo "---------------------"
				echo "El perímetro del cuadrado mide $[$lado1+$lado2+$lado3]."
				read
			;;
			"3") 	break 
			;;
			*)
			;;
		esac
	done

}

function rectangulo() {
	clear
	echo "RECTANGULO"
	echo "------------"
	echo ""
	echo "1. Area."
	echo "2. Perímetro."
	echo "3. Salir."
}

opcion=5
while [ "$opcion" != "6" ]; do
	mostrar_menu
	read -p "Introduzca una opción: " opcion

	case "$opcion" in
		"1") cuadrado
		;;
		"2") triangulo
		;;
		"3") break
		;;
		*)
		;;
	esac
done
