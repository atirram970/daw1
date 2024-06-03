#!/bin/bash

read -p "Dame tu peso: " pedirPeso
read -p "Dame tu altura: " pedirAltura

echo "Mis datos"
peso=$(echo "scale=2; $peso" | bc)
altura=$(echo "scale=2; $altura" | bc)

echo "Peso: "$peso
echo "Altura: "$altura
