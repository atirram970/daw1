#!/bin/bash


function juegohumanos() {
	clear
	echo "ACERTAR HUMAN vs HUMAN"
	echo "----------------------"
	echo ""
	read -p "Numero máximo a acertar: " NUM_MAX
	read -p "Número máximo de oportunidades: " OPO
	read -p "Jugador Nº 1, diga un numero entre 1 y $NUM_MAX: " n1
	clear
	echo "ACERTAR HUMAN vs HUMAN"
	echo "----------------------"
	for ((i=1 ; i<=$OPO ; i++)); do 
		read -p "Jugador 2, acierte un número entre 1 y $NUM_MAX: " n2
		if [ $n1 -eq $n2 ]; then
			echo "HAS ACERTADO !!!!"
			read
			break
		elif [ $n2 -lt $n1 ]; then
			echo "$n2 ES MENOR"
			read
		elif [ $n2 -gt $n1 ]; then
			echo "$n2 ES MAYOR"
			read
		fi	 
	done
	if [ $i -eq $[$OPO+1] ]; then
		echo "HAS PERDIDO, ERA EL $n1"
		read
	fi	

}

function juegohumanos() {
	clear
	echo "ACERTAR HUMAN vs HUMAN"
	echo "----------------------"
	echo ""
	read -p "Numero máximo a acertar: " NUM_MAX
	read -p "Número máximo de oportunidades: " OPO
	echo "El PC está pensado un numero entre 1 y $NUM_MAX"
	sleep 3
	n1=$[$RANDOM%$NUM_MAX+1]
	clear
	echo "ACERTAR HUMAN vs HUMAN"
	echo "----------------------"
	for ((i=1 ; i<=$OPO ; i++)); do 
		read -p "Jugador 2, acierte un número entre 1 y $NUM_MAX: " n2
		if [ $n1 -eq $n2 ]; then
			echo "HAS ACERTADO !!!!"
			read
			break
		elif [ $n2 -lt $n1 ]; then
			echo "$n2 ES MENOR"
			read
		elif [ $n2 -gt $n1 ]; then
			echo "$n2 ES MAYOR"
			read
		fi	 
	done
	if [ $i -eq $[$OPO+1] ]; then
		echo "HAS PERDIDO, ERA EL $n1"
		read
	fi	

}




#Programa principal

echo "JUEGO DE ACERTAR UN NÚMERO"
echo "--------------------------"
echo ""
read -p "Como vas a jugar? (1)HUMAN vs HUMAN (2)HUMAN vs PC --> " opc

if [ $opc="1" ]; then
	juegohumanos
else
	juegovspc
fi
