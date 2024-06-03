#!/bin/bash

# FUNCTION
function menu_principal() {
  echo "BARAJA"
  echo "--------"
  echo "1. Baraja Española"
  echo "2. Baraja Francesa"
  echo "3. Salir"
  echo ""
  read -p "Elige una opción: " opc_principal
}

function iniciar_baraja() {
  > baraja.txt
  if [[ $1 == "espanola" ]]; then
    for palo in {0..3}; do
      for numero in {1..10}; do
        nombre_espaniol
        echo "$num $tipo" >> baraja.txt
      done
    done
  elif [[ $1 == "francesa" ]]; then
    for palo in {0..3}; do
      for numero in {1..13}; do
        nombre_frances
        echo "$num $tipo" >> baraja.txt
      done
    done
  fi
}

function nombre_espaniol() {
  case $palo in
      0) tipo="Oros" ;;
      1) tipo="Copas" ;;
      2) tipo="Espadas" ;;
      3) tipo="Bastos" ;;
  esac
  case $numero in
      1) num="As de" ;;
      2) num="2 de" ;;
      3) num="3 de" ;;
      4) num="4 de" ;;
      5) num="5 de" ;;
      6) num="6 de" ;;
      7) num="7 de" ;;
      8) num="Sota de" ;;
      9) num="Caballo de" ;;
      10) num="Rey de" ;;
  esac
}

function nombre_frances() {
  case $palo in
      0) tipo="Corazones" ;;
      1) tipo="Diamantes" ;;
      2) tipo="Tréboles" ;;
      3) tipo="Picas" ;;
  esac
  case $numero in
      1) num="As de" ;;
      2) num="2 de" ;;
      3) num="3 de" ;;
      4) num="4 de" ;;
      5) num="5 de" ;;
      6) num="6 de" ;;
      7) num="7 de" ;;
      8) num="8 de" ;;
      9) num="9 de" ;;
      10) num="10 de" ;;
      11) num="Valet de" ;;
      12) num="Dama de" ;;
      13) num="Rey de" ;;
  esac
}

function mostrar_baraja() {
  echo "Mostrando la baraja:"
  cat baraja.txt
}

function ordenar_baraja() {
  echo "Ordenando la baraja:"
  sort -n baraja.txt -o baraja.txt
  cat baraja.txt
}

function barajar_baraja() {
  echo "Barajando la baraja:"
  sort -R baraja.txt -o baraja.txt
  cat baraja.txt
}

function baraja_espaniola() {
  clear
  echo "BARAJA ESPAÑOLA"
  echo "-----------------"
  iniciar_baraja "espanola"
  echo "Baraja española inicializada y lista."
  while [[ $salir_submenu == false ]]; do
    read -p "¿Qué deseas hacer? (mostrar/ordenar/barajar/salir): " accion
    case $accion in
        "mostrar")
        mostrar_baraja
        sleep 3
        ;;
        "ordenar")
        ordenar_baraja
        sleep 3
        ;;
        "barajar")
        barajar_baraja
        sleep 3
        ;;
        "salir")
        salir_submenu=true
        ;;
        *)
        echo "Opción no válida."
        ;;
    esac
  done
  salir_submenu=false
}

function baraja_frances() {
  clear
  echo "BARAJA FRANCESA"
  echo "-----------------"
  iniciar_baraja "francesa"
  echo "Baraja francesa inicializada y lista."
  while [[ $salir_submenu == false ]]; do
    read -p "¿Qué deseas hacer? (mostrar/ordenar/barajar/salir): " accion
    case $accion in
        "mostrar")
        mostrar_baraja
        sleep 3
        ;;
        "ordenar")
        ordenar_baraja
        sleep 3
        ;;
        "barajar")
        barajar_baraja
        sleep 3
        ;;
        "salir")
        salir_submenu=true
        ;;
        *)
        echo "Opción no válida."
        ;;
    esac
  done
  salir_submenu=false
}

# VARIABLES
salir=false
salir_submenu=false
opc_principal=""

# CUERPO PRINCIPAL DEL SCRIPT
while [[ $salir == false ]]; do
  menu_principal
  case $opc_principal in
      1)
      baraja_espaniola
      ;;
      2)
      baraja_frances
      ;;
      3)
        salir=true
        echo "Hasta luego"
        sleep 2
      ;;
  esac
done
