#!/bin/bash

read -p "Dame el primer numero: " num1
read -p "Dame el segundo numero: " num2
resultado=$(($num1+$num2))

echo "La suma entre $num1 y $num2 da: $resultado"
