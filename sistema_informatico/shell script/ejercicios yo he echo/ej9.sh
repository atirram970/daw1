#!/bin/bash

if [[ $# -lt 1 ]]; then
  echo "Error, no se han pasado parámetros"
else
  echo "Los parámetros que se han pasado son: " $*
fi
