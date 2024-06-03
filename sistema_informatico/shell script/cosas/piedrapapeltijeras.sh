#!/bin/bash


function humanovshumano() {
clear
echo "PIEDRA PAPEL TIJERAS (HUMAN VS HUMAN)"
echo "-------------------------------------"
read -p "¿Cuantas partidas quieres jugar?" numpart
marcadorj1=0
marcadorj2=0
for (( i=1; i<=$numpart; i++ )); do
	echo "NUMERO DE PARTIDA: $i de $numpart"	
	echo "MARCADOR: Jugador1: $marcadorj1 ----- Jugador2: $marcadorj2"
	read -p "Jugador 1, introduce (PI)edra, (PA)pel ó (TI)jeras: " j1
	clear
	echo "PIEDRA PAPEL TIJERAS (HUMAN VS HUMAN)"
	echo "-------------------------------------"	
	read -p "Jugador 2, introduce (PI)edra, (PA)pel ó (TI)jeras: " j2
	
	jugada="$j1$j2"
	clear
	echo "PIEDRA PAPEL TIJERAS (HUMAN VS HUMAN)"
	echo "-------------------------------------"
	case "$jugada" in
	"TIPI") echo "HA GANADO EL JUGADOR 2!"
		marcadorj2=$[$marcadorj2+1]
	;;
	"PITI") echo "HA GANADO EL JUGADOR 1!"
		marcadorj1=$[$marcadorj1+1]
	;;
	"PIPA") echo "HA GANADO EL JUGADOR 2!"
		marcadorj2=$[$marcadorj2+1]

	;;
	"PAPI") echo "HA GANADO EL JUGADOR 1!"
		marcadorj1=$[$marcadorj1+1]
	;;
	"PATI") echo "HA GANADO EL JUGADOR 2!"
		marcadorj2=$[$marcadorj2+1]
	;;
	"TIPA") echo "HA GANADO EL JUGADOR 1!"
		marcadorj1=$[$marcadorj1+1]
	;;
	*) echo "EMPATE!"
	;;
	esac	
done
clear
echo "PIEDRA PAPEL TIJERAS (HUMAN VS HUMAN)"
echo "-------------------------------------"
echo "MARCADOR FINAL"
echo "--------------"
echo "Jugador1: $marcadorj1 ----- Jugador2: $marcadorj2"

} 


function vspc(){
clear
echo "PIEDRA PAPEL TIJERAS (HUMAN VS PC)"
echo "-------------------------------------"
read -p "¿Cuantas partidas quieres jugar?" numpart
marcadorj1=0
marcadorj2=0
for (( i=1; i<=$numpart; i++ )); do
	echo "NUMERO DE PARTIDA: $i de $numpart"	
	echo "MARCADOR: Humano: $marcadorj1 ----- IA: $marcadorj2"
	read -p "Jugador Humano, introduce (PI)edra, (PA)pel ó (TI)jeras: " j1
	numj2=$[$RANDOM%3]
	case "$numj2" in
	"0") j2="PI"
	;;
	"1") j2="PA"
	;;
	"2") j2="TI"
	;;
	esac
	
	jugada="$j1$j2"
	clear
	echo "PIEDRA PAPEL TIJERAS (HUMAN VS HUMAN)"
	echo "-------------------------------------"
	case "$jugada" in
	"TIPI") echo "HA GANADO LA IA"
		marcadorj2=$[$marcadorj2+1]
	;;
	"PITI") echo "HA GANADO EL JUGADOR!"
		marcadorj1=$[$marcadorj1+1]
	;;
	"PIPA") echo "HA GANADO LA IA!"
		marcadorj2=$[$marcadorj2+1]

	;;
	"PAPI") echo "HA GANADO EL JUGADOR!"
		marcadorj1=$[$marcadorj1+1]
	;;
	"PATI") echo "HA GANADO LA IA!"
		marcadorj2=$[$marcadorj2+1]
	;;
	"TIPA") echo "HA GANADO EL JUGADOR!"
		marcadorj1=$[$marcadorj1+1]
	;;
	*) echo "EMPATE!"
	;;
	esac	
done
sleep 3
clear
echo "PIEDRA PAPEL TIJERAS (HUMAN VS HUMAN)"
echo "-------------------------------------"
echo "MARCADOR FINAL"
echo "--------------"
echo "Humano: $marcadorj1 <-----> IA: $marcadorj2"






}

# read -p "¿Modo de juego (1)HUMAN vs HUMAN ó (2) vs PC)? " resp
until [ "$resp" = "1" -o "$resp" = "2" ]; do
	read -p "¿Modo de juego (1)HUMAN vs HUMAN ó (2) vs PC)? " resp
done

case "$resp" in 
"1") humanovshumano
;;
"2") vspc
;;
esac
