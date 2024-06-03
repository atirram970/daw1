#!/bin/bash

# Este programa suma todos los argumentos que le pasemos

suma=0

limite=$#

for ((i=1;i<=limite;i++));
do
	suma=$[$suma+$1]
	shift
done

#for num in $@;
#do
#	suma=$[$suma + $num]
#done


echo "La suma es $suma"


