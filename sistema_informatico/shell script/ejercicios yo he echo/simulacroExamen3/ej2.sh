#!/bin/bash

#FUNCIONES
function menu() {
  clear
  echo "||=================================||"
  echo "||          MENÚ PRINCIPAL         ||"
  echo "||=================================||"
  echo ""
  echo "1. Contra IA"
  echo "2. 2 Vs 2"
  echo "3. Salir"
  echo ""
  read -p "Elige una de las opciones: " opc
}

function 2VS2() {
  #limpieza variables
  contadorTotal=$contadorJugadas
  opc_usuario1_correcta="false"
  opc_usuario2_correcta="false"

  menuJ1

  clear

  #ELECCION USUARIO1
  while [[ $opc_usuario1_correcta != "true" ]]; do
    case $opc_usuario1 in
        "Papel"|"papel")
          jugador1=0
          opc_usuario1_correcta="true"
        ;;
        "Tijeras"|"tijeras")
          jugador1=1
          opc_usuario1_correcta="true"
        ;;
        "Piedra"|"piedra")
          jugador1=2
          opc_usuario1_correcta="true"
        ;;
        *)
          echo "Has elegido una opción incorrecta, Escribe \"Piedra\", \"Papel\" o \"Tijeras\""
          echo "Ya sea con una primera en Mayúsculas: \"Papel\" o todas en minúscula: \"papel\""
          read -p "Elige Piedra, Papel o Tijeras: " opc_usuario1
        ;;
    esac
done

menuJ2

#ELECCION USUARIO2
while [[ $opc_usuario2_correcta != "true" ]]; do
  case $opc_usuario2 in
      "Papel"|"papel")
        jugador2=0
        opc_usuario2_correcta="true"
      ;;
      "Tijeras"|"tijeras")
        jugador2=1
        opc_usuario2_correcta="true"
      ;;
      "Piedra"|"piedra")
        jugador2=2
        opc_usuario2_correcta="true"
      ;;
      *)
        echo "Has elegido una opción incorrecta, Escribe \"Piedra\", \"Papel\" o \"Tijeras\""
        echo "Ya sea con una primera en Mayúsculas: \"Papel\" o todas en minúscula: \"papel\""
        read -p "Elige Piedra, Papel o Tijeras: " opc_usuario2
      ;;
  esac
done

clear
echo "===================================="
echo "||  PIEDRA,   PAPEL,    Tijeras   ||"
echo "===================================="
echo ""

#COMPROBAR QUIEN HA GANADO
comprobarGanador
}

function contraIA() {
  #limpieza variables
  opc_usuario1_correcta="false"
  opc_usuario2_correcta="false"

  menuJ1

  clear

  #ELECCION USUARIO1
  while [[ $opc_usuario1_correcta != "true" ]]; do
    case $opc_usuario1 in
        "Papel"|"papel")
          jugador1=0
          opc_usuario1_correcta="true"
        ;;
        "Tijeras"|"tijeras")
          jugador1=1
          opc_usuario1_correcta="true"
        ;;
        "Piedra"|"piedra")
          jugador1=2
          opc_usuario1_correcta="true"
        ;;
        *)
          echo "Has elegido una opción incorrecta, Escribe \"Piedra\", \"Papel\" o \"Tijeras\""
          echo "Ya sea con una primera en Mayúsculas: \"Papel\" o todas en minúscula: \"papel\""
          read -p "Elige Piedra, Papel o Tijeras: " opc_usuario1
        ;;
    esac
done

#ELECCION IA
jugador2=$((RANDOM % 3))
case $jugador2 in
  0)
    opc_usuario2="Papel"
  ;;
  1)
    opc_usuario2="Tijeras"
  ;;
  2)
    opc_usuario2="Piedra"
  ;;
esac

clear
echo "===================================="
echo "||  PIEDRA,   PAPEL,    Tijeras   ||"
echo "===================================="
echo ""

#COMPROBAR QUIEN HA GANADO
comprobarGanador
}

function menuJ1() {
  clear
  echo "===================================="
  echo "||  PIEDRA,   PAPEL,    Tijeras   ||"
  echo "===================================="
  echo ""
  echo "Jugada $contadorJugadas de $contadorTotal"
  echo "USUARIO 1"
  echo "VICTORIAS: $cont_victorias_usuario1"
  read -p "Elige Piedra, Papel o Tijeras: " opc_usuario1
}

function menuJ2() {
  clear
  echo "===================================="
  echo "||  PIEDRA,   PAPEL,    Tijeras   ||"
  echo "===================================="
  echo ""
  echo "echo Jugada $contadorJugadas de $contadorTotal"
  echo "USUARIO 2"
  echo "VICTORIAS: $cont_victorias_usuario2"
  read -p "Elige Piedra, Papel o Tijeras: " opc_usuario2
}

function comprobarGanador() {
  resultado=$(( (jugador1 - jugador2 + 3) % 3 ))
  case $resultado in
      1)
        echo "$opc_usuario1 VS $opc_usuario2"
        sleep 2
        echo "El jugador 1 gana"
        cont_victorias_usuario1=$((cont_victorias_usuario1+1))
        sleep 3
      ;;
      2)
        echo "$opc_usuario1 VS $opc_usuario2"
        sleep 2
        echo "El jugador 2 gana"
        cont_victorias_usuario2=$((cont_victorias_usuario2+1))
        sleep 3
      ;;
      0)
        echo "$opc_usuario1 VS $opc_usuario2"
        sleep 2
        echo "Es un empate"
        sleep 3
      ;;
  esac
}

#VARIABLES
opc=""
opc_usuario1=""
opc_usuario2=""
salir="false"
contadorJugadas=0
cont_victorias_usuario1=0
cont_victorias_usuario2=0

#CUERPO PRINCIPAL DEL SCRIPT
read -p "Dame cuantas veces vas a jugar: " contadorJugadas
while [[ $contadorJugadas -gt 0 ]]; do
  menu
  case $opc in
      1)
        contraIA
        contadorJugadas=$((contadorJugadas-1))
      ;;
      2)
        2VS2
        contadorJugadas=$((contadorJugadas-1))
      ;;
      *)
        echo "Has elegido una opción incorrecta, elige un número del 1 al 3"
      ;;
  esac
done

clear

if [[ $cont_victorias_usuario1 -gt $cont_victorias_usuario2 ]]; then
  echo "El jugador 1 ha ganado, con $cont_victorias_usuario1 Victorias"
elif [[ $cont_victorias_usuario1 -eq $cont_victorias_usuario2 ]]; then
  echo "Ha habido un empate"
else
  echo "El jugador 2 ha ganado, con $cont_victorias_usuario2 Victorias"
fi
