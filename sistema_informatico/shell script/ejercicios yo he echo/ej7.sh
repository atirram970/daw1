#!/bin/bash

numero=$1

if [[ $# -eq 1 ]]; then
  if [[ $numero -gt 100 ]]; then
    echo "El numero es mayor a 100"
  fi
else
  echo "No se ha pasado ningún número por parámetro"
fi
