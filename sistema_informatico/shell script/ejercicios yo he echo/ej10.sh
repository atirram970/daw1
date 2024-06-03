#!/bin/bash

num1=$1
num2=$2

if [[ $# -ne 2 ]]; then
  echo "Error, debes de pasar 2 numeros como argumentos"
else
  if [[ $num1 -eq $num2 ]]; then
    echo "$1 y $2 son el mismo numero"
  elif [[ $num1 -gt $num2 ]]; then
    echo "$num1 es el mayor numero"
  elif [[ $num1 -lt $num2 ]]; then
    echo "$num2 es el mayor numero"
  fi
fi
