#!/bin/bash

#VARIABLES
numero_aleatorio=0
cara=0
cruz=0

read -p "Dame las veces que vas a tirar la moneda: " tiradas
for (( i = 0; i < $tiradas; i++ )); do
  numero_aleatorio=$((RANDOM % 2))
  if [[ numero_aleatorio -eq 0 ]]; then
    cara=$(($cara+1))
  else
    cruz=$(($cruz+1))
  fi
done

echo "En $tiradas veces que se ha lanzado la moneda han salido: "
echo "$cara Caras"
echo "$cruz Cruz"
