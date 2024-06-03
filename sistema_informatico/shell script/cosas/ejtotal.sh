#!/bin/bash


oldIFS=$IFS

personaanterior=" "
while IFS=" " read persona tiempo
do
	horas=$(echo $tiempo | cut -f1 -d:)
	minutos=$(echo $tiempo | cut -f2 -d:)
	segundos=$(echo $tiempo | cut -f3 -d:)
	echo "Actual: $persona - $horas - $minutos - $segundos"
	personaanterior=$persona
done < datos.txt








IFS=$oldIFS	
	
