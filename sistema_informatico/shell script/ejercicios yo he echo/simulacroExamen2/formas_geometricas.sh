#!/bin/bash

# FUNCIONES
function menu_principal() {
  clear
  echo "MENU PRINCIPAL"
  echo "--------------"
  echo ""
  echo "1. Cuadrado"
  echo "2. Rectángulo"
  echo "3. Triángulo"
  echo "4. Rombo"
  echo "5. Paralelograma"
  echo "6. Trapecio"
  echo "7. Polígono Regular"
  echo "8. Circunferencia y Círculo"
  echo "9. Salir"
  read -p "Elija una opción (1-9): " opc_principal
}

function cuadrado() {
  clear
  echo "CUADRADO"
  echo "--------"
  echo
}

function triangulo() {
  clear
  echo "TRIÁNGULO"
  echo "---------"
  echo
}

function rectangulo() {
  clear
  echo "RECTÁNGULO"
  echo "----------"
  echo
}

function rombo() {
  clear
  echo "ROMBO"
  echo "-----"
  echo
}

function paralelograma() {
  clear
  echo "PARALELOGRAMA"
  echo "-------------"
  echo
}

function trapecio() {
  clear
  echo "TRAPECIO"
  echo "--------"
  echo
}

function poligono() {
  clear
  echo "POLÍGONO REGULAR"
  echo "----------------"
  echo
}

function circunferencia_circulo() {
  clear
  echo "CIRCUNFERENCIA Y CÍRCULO"
  echo "------------------------"
  echo
}

function operacion() {
  echo "1. Área"
  echo "2. Perímetro"
  echo "3. Salir"
  read -p "Elija una opción (1-3): " opc_eleccion
}

function calculo_cuadrado() {
  case $opc_eleccion in
    1)
      read -p "Cuánto mide el lado del cuadrado: " lado
      area=$(($lado*$lado))
      echo "Su área es $area"
      sleep 2
      ;;
    2)
      read -p "Cuánto mide el lado del cuadrado: " lado
      perimetro=$(($lado*4))
      echo "Su perímetro es $perimetro"
      sleep 2
      ;;
    3)
      ;;
    *)
      echo "Has elegido una opción incorrecta, elije un número del 1 al 3"
      sleep 2
      ;;
  esac
}

function calculo_rectangulo() {
  case $opc_eleccion in
    1)
      read -p "Cuánto mide el ancho del rectángulo: " ancho
      read -p "Cuánto mide el alto del rectángulo: " alto
      area=$(($ancho*$alto))
      echo "Su área es $area"
      sleep 2
      ;;
    2)
      read -p "Cuánto mide el ancho del rectángulo: " ancho
      read -p "Cuánto mide el alto del rectángulo: " alto
      perimetro=$(($ancho*2+$alto*2))
      echo "Su perímetro es $perimetro"
      sleep 2
      ;;
    3)
      ;;
    *)
      echo "Has elegido una opción incorrecta, elije un número del 1 al 3"
      sleep 2
      ;;
  esac
}

function calculo_triangulo() {
  case $opc_eleccion in
    1)
      read -p "Cuánto mide la base: " base
      read -p "Cuánto mide la altura: " altura
      area=$((($base*$altura)/2))
      echo "Su área es $area"
      sleep 2
      ;;
    2)
      read -p "Cuánto mide el primer lado: " lado1
      read -p "Cuánto mide el segundo lado: " lado2
      read -p "Cuánto mide el tercer lado: " lado3
      perimetro=$(($lado1+$lado2+$lado3))
      echo "Su perímetro es $perimetro"
      sleep 2
      ;;
    3)
      ;;
    *)
      echo "Has elegido una opción incorrecta, elije un número del 1 al 3"
      sleep 2
      ;;
  esac
}

function calculo_rombo() {
  case $opc_eleccion in
    1)
      read -p "Cuánto mide la diagonal mayor: " diagonal_mayor
      read -p "Cuánto mide la diagonal menor: " diagonal_menor
      area=$(($diagonal_mayor*$diagonal_menor/2))
      echo "Su área es $area"
      sleep 2
      ;;
    2)
      read -p "Cuánto mide el lado del rombo: " lado
      perimetro=$(($lado*4))
      echo "Su perímetro es $perimetro"
      sleep 2
      ;;
    3)
      ;;
    *)
      echo "Has elegido una opción incorrecta, elije un número del 1 al 3"
      sleep 2
      ;;
  esac
}

function calculo_paralelogramo() {
  case $opc_eleccion in
    1)
      read -p "Cuánto mide la base: " base
      read -p "Cuánto mide la altura: " altura
      area=$(($base*$altura))
      echo "Su área es $area"
      sleep 2
      ;;
    2)
      read -p "Cuánto mide el lado 1: " lado1
      read -p "Cuánto mide el lado 2: " lado2
      read -p "Cuánto mide la altura: " altura
      perimetro=$(($lado1+$lado2+$lado1+$lado2))
      echo "Su perímetro es $perimetro"
      sleep 2
      ;;
    3)
      ;;
    *)
      echo "Has elegido una opción incorrecta, elije un número del 1 al 3"
      sleep 2
      ;;
  esac
}

function calculo_trapecio() {
  case $opc_eleccion in
    1)
      read -p "Cuánto mide la base mayor: " base_mayor
      read -p "Cuánto mide la base menor: " base_menor
      read -p "Cuánto mide la altura: " altura
      area=$((($base_mayor+$base_menor)*$altura/2))
      echo "Su área es $area"
      sleep 2
      ;;
    2)
      read -p "Cuánto mide el lado 1: " lado1
      read -p "Cuánto mide el lado 2: " lado2
      read -p "Cuánto mide el lado 3: " lado3
      read -p "Cuánto mide el lado 4: " lado4
      perimetro=$(($lado1+$lado2+$lado3+$lado4))
      echo "Su perímetro es $perimetro"
      sleep 2
      ;;
    3)
      ;;
    *)
      echo "Has elegido una opción incorrecta, elije un número del 1 al 3"
      sleep 2
      ;;
  esac
}

function calculo_poligono() {
  case $opc_eleccion in
    1)
      read -p "Cuánto mide el lado del polígono: " lado
      read -p "Cuánto mide el apotema: " apotema
      read -p "Cuántas caras tiene el polígono: " numero_caras
      area=$(echo "scale=2; $numero_caras * $lado * $apotema / 2" | bc)
      echo "Su área es $area"
      sleep 2
      ;;
    2)
      read -p "Cuánto mide el lado del polígono: " lado
      read -p "Cuántas caras tiene el polígono: " numero_caras
      perimetro=$(($lado*$numero_caras))
      echo "Su perímetro es $perimetro"
      sleep 2
      ;;
    3)
      ;;
    *)
      echo "Has elegido una opción incorrecta, elije un número del 1 al 3"
      sleep 2
      ;;
  esac
}

function calculo_circunferencia_circulo() {
  case $opc_eleccion in
    1)
      read -p "Cuánto mide el radio del círculo: " radio
      area=$(echo "scale=2; 3.14159 * $radio * $radio" | bc)
      echo "Su área es $area"
      sleep 2
      ;;
    2)
      read -p "Cuánto mide el radio del círculo: " radio
      perimetro=$(echo "scale=2; 2 * 3.14159 * $radio" | bc)
      echo "Su perímetro es $perimetro"
      sleep 2
      ;;
    3)
      ;;
    *)
      echo "Has elegido una opción incorrecta, elije un número del 1 al 3"
      sleep 2
      ;;
  esac
}

#VARIABLES
opc_principal=""
opc_eleccion=""

# CUERPO PRINCIPAL DEL SCRIPT
while [[ $opc_principal -ne 9 ]]; do
  opc_eleccion=""
  menu_principal
  case $opc_principal in
    1)
      while [[ $opc_eleccion -ne 3 ]]; do
        cuadrado
        operacion
        calculo_cuadrado
      done
      ;;
    2)
      while [[ $opc_eleccion -ne 3 ]]; do
        rectangulo
        operacion
        calculo_rectangulo
      done
      ;;
    3)
      while [[ $opc_eleccion -ne 3 ]]; do
        triangulo
        operacion
        calculo_triangulo
      done
      ;;
    4)
      while [[ $opc_eleccion -ne 3 ]]; do
        rombo
        operacion
        calculo_rombo
      done
      ;;
    5)
      while [[ $opc_eleccion -ne 3 ]]; do
        paralelograma
        operacion
        calculo_paralelogramo
      done
      ;;
    6)
      while [[ $opc_eleccion -ne 3 ]]; do
        trapecio
        operacion
        calculo_trapecio
      done
      ;;
    7)
      while [[ $opc_eleccion -ne 3 ]]; do
        poligono
        operacion
        calculo_poligono
      done
      ;;
    8)
      while [[ $opc_eleccion -ne 3 ]]; do
        circunferencia_circulo
        operacion
        calculo_circunferencia_circulo
      done
      ;;
    9)
      echo "Hasta luego"
      sleep 2
      ;;
    *)
      echo "Has elegido una opción incorrecta, elije un número del 1 al 8"
      sleep 2
      ;;
  esac
done
