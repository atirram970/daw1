#!/bin/bash

for archivo in $(ls); do
  if [[ -f $archivo ]]; then
    echo "$archivo es un fichero"
  fi

  if [[ -d $archivo ]]; then
    echo "$archivo es un directorio"
  fi
done
