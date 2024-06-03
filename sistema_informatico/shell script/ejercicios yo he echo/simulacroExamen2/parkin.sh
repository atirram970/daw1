#!/bin/bash

#PROGRAMA PRE-EJECUCION
if [[ -f parking.txt ]]; then
  echo ""
else
  touch parking.txt
fi

#CUERPO PRINCIPAL DEL SCRIPT
while [[ $matricula_entregada != "" ]]; do
  if [[ -z $matricula_entregada ]]; then
    read -p "Dame una matricula (formato 9999LLL): " matricula_entregada
    read -p "Está entrando o saliendo?: (entra - sale): " accion
    echo "$matricula_entregada:$accion:`date +"%H:%M:%S"`" >> parking.txt
  fi
done
