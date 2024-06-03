#!/bin/bash

#FUNCIONES
function menu() {
  echo "****************************************"
  echo "||            MENU PRINCIPAL          ||"
  echo "****************************************"
  echo
  echo "1."
  echo "2. SUBMENU"
  echo "3. SALIR"
}

function subMenu() {
  echo "****************************************"
  echo "||            MENU PRINCIPAL          ||"
  echo "****************************************"
  echo
  echo "4."
  echo "5."
  echo "6."
}

#VARIABLES
opc=0
cosa=0

#CUERPO PRINCIPAL SCRIPT
while [[ $opc -ne 3 ]]; do
  menu
  read -p "Dame una opcion: " opc
  case $opc in
      1)
        echo "1"
      ;;
      2)
        echo "Has elegido mostrar el submenu"
        subMenu
        read -p "dame otra cosa: " cosa
        case $cosa in
            4)
              echo "4"
            ;;
            5)
              echo "5"
            ;;
            6)
              echo "6"
            ;;
        esac
      ;;
      3)
        echo "Has elegido salir"
      ;;
      *)
        echo "Has elegido una opcion incorrecta"
      ;;
  esac
done
