#!/bin/bash
#Menu

#FUNCIONES
function mostrar_menu() {
  clear
  echo "|**********************************|"
  echo "|          Menu   Principal        |"
  echo "|**********************************|"
  echo
  echo "1. Listar Directorios"
  echo "2. Directorio Actual"
  echo "3. Listado detallado de fichero"
  echo "4. Salir"
}

#VARIABLES
opcion=5

#PROGRAMA PRINCIPAL
while [[ opcion -ne 4 ]]; do
  mostrar_menu
  read -p "Introduce una opcion: " opcion
  case $opcion in
      1)
        echo `ls`
        sleep 3
      ;;
      2)
        echo $PWD
        sleep 3
      ;;
      3)
        echo `ls -l`
        sleep 3
      ;;
      4)
      ;;
      *)
        echo "Has introducido una opcion incorrecta"
      ;;
  esac
done
men