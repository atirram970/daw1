#!/bin/bash

num1=$1
num2=$2

if [[ $# -ne 2 ]]; then
  echo "Error, debes de pasar 2 numeros como argumentos"
  echo "USO: ./ej11.sh <parametro1> <parametro2 0>"
else
  if [[ $num1 -eq $num2 ]]; then
    echo "$1 y $2 son el mismo numero"
  elif [[ $num1 -gt $num2 ]]; then
    echo "$num1 es mayor a $num2"
  elif [[ $num1 -lt $num2 ]]; then
    echo "$num1 es menor a $num2"
  fi
fi
