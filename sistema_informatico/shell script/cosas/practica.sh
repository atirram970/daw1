#!/bin/bash

# Ejericio 1

x=15
echo -e "EJERCICIO 1\n"
echo "La variable x vale $x"
echo -e "\n"

# Ejercicio 2

echo -e "EJERCICIO 2\n"
apellido="Santos"
echo "La variable apellido vale $apellido"
echo -e "\n"

#Ejercicio 3

echo -e "EJERCICIO 3\n"

a=20
b=5
division=$[$a/$b]
echo "La division es igual $division"
echo -e "\n"

#Ejercicio 4
echo -e "EJERCICIO 4\n"
echo "El número de parámetros es $#"
echo "La lista de parámetros es $@"
echo "El primer parámetro es $1"
echo "El segundo parámetro es $2"
echo "El directorio de trabajo del usuario es $HOME"
echo "El directorio actual es $PWD"
echo -e "\n"


#Ejercicio 5
echo -e "EJERCICIO 5\n"
sleep 10
clear
echo "HOLA A TODOS"


#Ejercicio 6
sleep 5
clear
read -p "¿Cual es tu peso? " peso
read -p "¿Cual es tu estatura? " altura
echo "Mis Datos"
echo "Peso= $peso kg."
echo "Altura= $altura cm."

#Ejercicio 7

sleep 3
clear

echo -e "EJERCICIO 7\n"

if [ $# -ne 2 ]; then
	echo -e "ERROR: Número de parámetros erróneo\n"
	echo -e "USO: .\sumar.sh <parametro1> <parametro2>"
else
	echo "La suma es $[$1+$2]"
fi

#Ejercicio 8 y 9

sleep 3
clear
echo -e "EJERCICIO 8 y 9\n"
if [ $# -ne 1 ]; then
	echo -e "ERROR: Número de parámetros erróneo\n"
	echo -e "USO: .\mayor100.sh <parametro1>"
else
	if [ $1 -gt 100 ]; then
		echo "El número es mayor que 100."
	else
		echo "El número es menor que 100."
	fi
fi

#Ejercicio 10

sleep 3
clear
echo -e "EJERCICIO 10\n"
if [ $# -eq 0 ]; then
	echo -e "ERROR: No has pasado ningún parametro.\n"
else
	echo "Los parametros son los siguientes: $@"
fi

#Ejercicio 11

sleep 3
clear
echo -e "EJERCICIO 11\n"
if [ $# -ne 2 ]; then
	echo -e "ERROR: Número de parámetros erróneo\n"
	echo -e "USO: .\compara.sh <parametro1> <parametro2>"
else
	if [ $1 -gt $2 ]; then
		echo "El primer número es mayor que el segundo."
	elif [ $2 -gt $1 ]; then
		echo "El segundo número es mayor que el primero."
	else 
		echo "Los dos números son iguales."
	fi
fi



#Ejercicio 12

sleep 3
clear
echo -e "EJERCICIO 12\n"

read -p "Introduzca el primer número: " n1
read -p "Introduzca el segundo número: " n2


if [ $n1 -gt $n2 ]; then
	echo "El primer número es mayor que el segundo."
elif [ $n2 -gt $n1 ]; then
	echo "El segundo número es mayor que el primero."
else 
	echo "Los dos números son iguales."
fi

#Ejercicio 13

sleep 3
clear
echo -e "EJERCICIO 13\n"

for (( i=1; i<6; i++ ));
do
	for (( j=1; j<=i; j++)); 
	do
		echo -e "$i\c"
	done
	echo ""
done

#Ejercicio 14

sleep 3
clear
echo -e "EJERCICIO 14\n"

for (( i=1; i<6; i++ ));
do
	for (( j=1; j<=i; j++)); 	
	do
		echo -e "$j\c"
	done
	echo ""
done

#Ejercicio 16 y 17

sleep 3
clear
echo -e "EJERCICIO 16 y 17\n"


if [ $# -ne 1 ]; then
	echo -e "ERROR: Número de parámetros erróneo\n"
	echo -e "USO: .\tabla.sh <parametro1>"
else
	echo    "TABLA DEL $1"
	echo -e "------------\n"
	
	for (( i=0; i<=10; i++ ));
	do
		echo "$1 x $i = $[$1*$i]"
	done

fi

#Ejercicio 16 y 17 Con While

sleep 3
clear
echo -e "EJERCICIO 16 y 17 con while\n"


if [ $# -ne 1 ]; then
	echo -e "ERROR: Número de parámetros erróneo\n"
	echo -e "USO: .\tabla.sh <parametro1>"
else
	echo    "TABLA DEL $1"
	echo -e "------------\n"
	
	i=0
	while [ $i -le 10 ]; do
	
		echo "$1 x $i = $[$1*$i]"
		((i++))
		
	done

fi








