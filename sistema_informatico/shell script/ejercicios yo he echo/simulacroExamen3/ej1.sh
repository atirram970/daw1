#!/bin/bash

#============================
#COMPROBAR SI FICHERO EXISTE
#SI EXISTE LIMPIAR
#SINO CREAR

if [[ -f parking.txt ]]; then
  cat dev/null > parking.txt
else
  touch parking.txt
fi
#=============================

# FUNCIONES
function menu() {
  clear
  echo "MENU PRINCIPAL"
  echo "----------------"
  echo ""
  echo "1. Entrada al parking"
  echo "2. Salida del parking"
  echo "3. Listado por matrícula"
  echo "4. Listado por fecha"
  echo "5. Salir"
  read -p "Elige una opción: " opc
}

function entrada() {
  clear
  echo "ENTRADA"
  echo "---------"
  echo ""
  read -p "Dame la matrícula del vehiculo que entra: " mat_vehiculo
  if [[ -z $mat_vehiculo ]]; then
    echo "La matrícula no puede estar vacía"
    sleep 2
    return
  fi
  buscar=$(grep "^$mat_vehiculo" parking.txt | tail -1)
  if [[ $buscar == *":entrada" ]]; then
    echo "El coche ya está en el parking"
    sleep 2
  else
    echo "$mat_vehiculo:$(date +'%d/%m/%y %H:%M:%S'):entrada" >> parking.txt
    echo "Entrada registrada"
    sleep 2
  fi
}

function salida() {
  clear
  echo "SALIDA"
  echo "---------"
  echo ""
  read -p "Dame la matrícula del vehiculo que sale: " mat_vehiculo
  if [[ -z $mat_vehiculo ]]; then
    echo "La matrícula no puede estar vacía"
    sleep 2
    return
  fi
  buscar=$(grep "^$mat_vehiculo" parking.txt | tail -1)
  if [[ $buscar == *":entrada" ]]; then
    echo "$mat_vehiculo:$(date +'%d/%m/%y %H:%M:%S'):salida" >> parking.txt
    echo "Salida registrada"
    sleep 2
  else
    echo "El coche no está en el parking o ya ha salido"
    sleep 2
  fi
}

function listadoPorMatricula() {
  clear
  echo "Listado Por Matrícula"
  echo "-----------------------"
  echo ""
  read -p "Dame la matrícula del vehículo que deseas buscar: " mat_vehiculo
  grep "^$mat_vehiculo" parking.txt
  sleep 5
}

function listadoPorFecha() {
  clear
  echo "Listado Por Fecha"
  echo "-------------------"
  echo ""
  read -p "Dame el día que deseas ver (dd/mm/yy): " fecha
  grep "$fecha" parking.txt
  sleep 5
}

# VARIABLES
opc=""
mat_vehiculo=""
fecha=""
salir="false"

# CUERPO PRINCIPAL SCRIPT
while [[ $salir != "true" ]]; do
  menu
  case $opc in
      1)
        entrada
      ;;
      2)
        salida
      ;;
      3)
        listadoPorMatricula
      ;;
      4)
        listadoPorFecha
      ;;
      5)
        salir="true"
      ;;
      *)
        echo "Has elegido una opción incorrecta, elige un número del 1 al 5"
        sleep 2
      ;;
  esac
done
