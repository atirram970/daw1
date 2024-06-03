#!/bin/bash

#FUNCIONES
function menu_principal() {
  clear
  echo "||==================================================||"
  echo "||                  MENU PRINCIPAL                  ||"
  echo "||==================================================||"
  echo ""
  echo "1.Operaciones Básicas"
  echo "2.Operaciones avanzadas"
  echo "0.Salir"
  read -p "Elige una opción: " opc_principal
}

function menu_op_basicas() {
  clear
  echo "||============================================================||"
  echo "||                  MENU OPERACIONES BÁSICAS                  ||"
  echo "||============================================================||"
  echo ""
  echo "1.Sumar (+)"
  echo "2.Restar  (-)"
  echo "3.Multiplicar (x)"
  echo "4.Dividir (/)"
  echo "0.Salir"
  read -p "Elige una opción: " opc_basicas
}

function menu_op_avanzadas() {
  clear
  echo "||=============================================================||"
  echo "||                  MENU OPERACIONES AVANZADAS                 ||"
  echo "||=============================================================||"
  echo ""
  echo "1.Modulo (%)"
  echo "2.Potencia (^)"
  echo "3.Raiz Cuadrada (√)"
  echo "0.Salir"
  read -p "Elige una opción: " opc_avanzadas
}

function eleccion_escritura() {
  opc_lectura=""
  while [[ $opc_lectura -ne 1 && $opc_lectura -ne 2  ]]; do
    clear
    echo "¿POR DONDE VAS A INTRODUCIR LOS NÚMEROS?"
    echo "========================================"
    echo "1.Por teclado"
    echo "2.Por archivo"
    read -p "Elige una opción: " opc_lectura
    if [[ $opc_lectura -eq 1 ]]; then
      echo "Has elegido introducir los números por teclado"
    elif [[ $opc_lectura -eq 2 ]]; then
      echo "Has elegido introducir los números por un archivo"
    else
      echo "Error, has introducido una opción incorrecta"
    fi
  done
}

function suma() {
  clear
  echo "SUMA"
  echo "===="

  if [[ $opc_lectura -eq 1 ]]; then
    read -p "Dame el primer número: " num1
    read -p "Dame el segundo número: " num2
    resultado=$(echo "scale=2; $num1+$num2" | bc)
    echo "La suma de $num1 + $num2 es: $resultado"
  elif [[ $opc_lectura -eq 2 ]]; then
    ls
    read -p "Dame el nombre del archivo junto su extensión Ejemplo (nombre.txt): " fichero
    if [[ -f $fichero ]]; then
      while IFS= read -r line; do
        num1=$(echo "$line" | awk '{print $1}')
        num2=$(echo "$line" | awk '{print $2}')
        resultado=$(echo "scale=2; $num1+$num2" | bc)
        echo "La suma de $num1 + $num2 es: $resultado"
      done < "$fichero"
    else
      echo "$fichero no es un archivo"
    fi
  fi

  sleep 3
}

function resta() {
  clear
  echo "RESTA"
  echo "====="

  if [[ $opc_lectura -eq 1 ]]; then
    read -p "Dame el primer número: " num1
    read -p "Dame el segundo número: " num2
    resultado=$(echo "scale=2; $num1-$num2" | bc)
    echo "La resta de $num1 - $num2 es: $resultado"
  elif [[ $opc_lectura -eq 2 ]]; then
    ls
    read -p "Dame el nombre del archivo junto su extensión Ejemplo (nombre.txt): " fichero
    if [[ -f $fichero ]]; then
      while IFS= read -r line; do
        num1=$(echo "$line" | awk '{print $1}')
        num2=$(echo "$line" | awk '{print $2}')
        resultado=$(echo "scale=2; $num1-$num2" | bc)
        echo "La resta de $num1 - $num2 es: $resultado"
      done < "$fichero"
    fi
  fi

  sleep 3
}

function multiplicacion() {
  clear
  echo "MULTIPLICACIÓN"
  echo "=============="

  if [[ $opc_lectura -eq 1 ]]; then
    read -p "Dame el primer número: " num1
    read -p "Dame el segundo número: " num2
    resultado=$(echo "scale=2; $num1*$num2" | bc)
    echo "La multiplicación de $num1 * $num2 es: $resultado"
  elif [[ $opc_lectura -eq 2 ]]; then
    ls
    read -p "Dame el nombre del archivo junto su extensión Ejemplo (nombre.txt): " fichero
    if [[ -f $fichero ]]; then
      while IFS= read -r line; do
        num1=$(echo "$line" | awk '{print $1}')
        num2=$(echo "$line" | awk '{print $2}')
        resultado=$(echo "scale=2; $num1^$num2" | bc)
        echo "La multiplicación de $num1 * $num2 es: $resultado"
      done < "$fichero"
    fi
  fi

  sleep 3
}

function division() {
  clear
  echo "DIVISIÓN"
  echo "========"

  if [[ $opc_lectura -eq 1 ]]; then
    read -p "Dame el primer número: " num1
    read -p "Dame el segundo número: " num2
    resultado=$(echo "scale=2; $num1/$num2" | bc)
    echo "scale=2; La division de $num1 / $num2 es: $resultado"
  elif [[ $opc_lectura -eq 2 ]]; then
    ls
    read -p "Dame el nombre del archivo junto su extensión Ejemplo (nombre.txt): " fichero
    if [[ -f $fichero ]]; then
      while IFS= read -r line; do
        num1=$(echo "$line" | awk '{print $1}')
        num2=$(echo "$line" | awk '{print $2}')
        resultado=$(echo "scale=2; $num1/$num2" | bc)
        echo "La division de $num1 / $num2 es: $resultado"
      done < "$fichero"
    fi
  fi

  sleep 3
}

function modulo() {
  clear
  echo "MÓDULO"
  echo "======"

  if [[ $opc_lectura -eq 1 ]]; then
    read -p "Dame el primer número: " num1
    read -p "Dame el segundo número: " num2
    resultado=$(echo "scale=2; $num1%$num2" | bc)
    echo "El resto de dividir $num1 % $num2 es: $resultado"
  elif [[ $opc_lectura -eq 2 ]]; then
    ls
    read -p "Dame el nombre del archivo junto su extensión Ejemplo (nombre.txt): " fichero
    if [[ -f $fichero ]]; then
      while IFS= read -r line; do
        num1=$(echo "$line" | awk '{print $1}')
        num2=$(echo "$line" | awk '{print $2}')
        resultado=$(echo "scale=2; $num1%$num2" | bc)
        echo "El resto de dividir $num1 % $num2 es: $resultado"
      done < "$fichero"
    fi
  fi

  sleep 3
}

function potencia() {
  clear
  echo "POTENCIA"
  echo "========"

  if [[ $opc_lectura -eq 1 ]]; then
    read -p "Dame el primer número: " num1
    read -p "Dame el segundo número: " num2
    resultado=$(echo "scale=2; $num1^$num2" | bc)
    echo "El elevado obtenido de  $num1 ^ $num2 es: $resultado"
  elif [[ $opc_lectura -eq 2 ]]; then
    ls
    read -p "Dame el nombre del archivo junto su extensión Ejemplo (nombre.txt): " fichero
    if [[ -f $fichero ]]; then
      while IFS= read -r line; do
        num1=$(echo "$line" | awk '{print $1}')
        num2=$(echo "$line" | awk '{print $2}')
        resultado=$(echo "scale=2; $num1^$num2" | bc)
        echo "El elevado obtenido de $num1 ^ $num2 es: $resultado"
      done < "$fichero"
    fi
  fi

  sleep 3
}

function raiz() {
  clear
  echo "RAÍZ"
  echo "===="

  if [[ $opc_lectura -eq 1 ]]; then
    read -p "Dame el número: " num1
    resultado=$(echo "scale=2; sqrt($num1)" | bc)
    echo "La raíz de $num1 es: $resultado"
  elif [[ $opc_lectura -eq 2 ]]; then
    ls
    read -p "Dame el nombre del archivo junto su extensión Ejemplo (nombre.txt): " fichero
    if [[ -f $fichero ]]; then
      while IFS= read -r line; do
        num1=$(echo "$line" | awk '{print $1}')
        resultado=$(echo "scale=2; sqrt($num1)" | bc)
        echo "La raíz de $num1 es: $resultado"
      done < "$fichero"
    fi
  fi

  sleep 3
}

#VARIABLES
opc_principal=""
opc_basicas=""
opc_avanzadas=""
opc_lectura=""
fichero=""
n_lineas=""
num1=""
num2=""
resultado=""

#CUERPO PRINCIPAL DEL SCRIPT

menu_principal
while [[ $opc_principal -ne 0 ]]; do
  #MENU PRINCIPAL
  case $opc_principal in
      1)
        #MENU DE LAS OPCIONES BÁSICAS
        menu_op_basicas
        while [[ $opc_basicas -ne 0 ]]; do
          case $opc_basicas in
              1)
                eleccion_escritura
                suma
                menu_op_basicas
                break
              ;;
              2)
                eleccion_escritura
                resta
                menu_op_basicas
                break
              ;;
              3)
                eleccion_escritura
                multiplicacion
                menu_op_basicas
                break
              ;;
              4)
                eleccion_escritura
                division
                menu_op_basicas
                break
              ;;
              0)
                echo "Has elegido Salir"
                menu_principal
              ;;
              *)
                echo "Has elegido una opción incorrecta, elige un número del 0 al 4"
                break
              ;;
          esac
        done
      ;;
      2)
        #MENU DE LAS OPCIONES AVANZADAS
        menu_op_avanzadas
        while [[ $opc_avanzadas -ne 0 ]]; do
          case $opc_avanzadas in
              1)
                eleccion_escritura
                modulo
                menu_op_avanzadas
                break
              ;;
              2)
                eleccion_escritura
                potencia
                menu_op_avanzadas
                break
              ;;
              3)
                eleccion_escritura
                raiz
                menu_op_avanzadas
                break
              ;;
              0)
                echo "Has elegido salir, volviendo al menu principal"
                menu_principal
              ;;
              *)
                echo "Has elegido una opción incorrecta, elige un número del 0 al 3"
                break
              ;;
          esac
        done

        ;;
        0)
          echo "Has elegido salir..."
          sleep 1
          echo "Hasta luego"
          sleep 3
          exit 0
        ;;
        *)
          echo "Has elegido una opción incorrecta, elige un número del 0 al 2"
          break
        ;;
  esac
done
