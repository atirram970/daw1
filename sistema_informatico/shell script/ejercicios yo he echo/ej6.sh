#!/bin/bash

num1=$1
num2=$2

if [[ $# -ne 2 ]]; then
  echo "Se deben de introducir 2 numeros por parámetros, Ejemplo de uso $0 1 2"
  return 1
else
  suma=$(($1+$2))
  echo "La suma de $1 y $2 es: $suma"
fi
