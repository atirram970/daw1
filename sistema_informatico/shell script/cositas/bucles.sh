#!/bin/bash

#BUCLE FOR

#FOR NORMAL
for (( i = 0; i < 10; i++ )); do
  echo "hola"
done

#FOR PARA SECUENCIA
for $num in $(seq 10 0); do
  echo "hola"
done

#BUCLE WHILE
while [[ true ]]; do
  echo "hola"
done

#BUCLE DO-WHILE
