#!/bin/bash

# Función para convertir horas:minutos:segundos a segundos
hms_to_seconds() {
    local hms=$1
    local IFS=':'
    read -r h m s <<< "$hms"
    echo $(( h * 3600 + m * 60 + s ))
}

# Función para convertir segundos a horas:minutos:segundos
seconds_to_hms() {
    local total_seconds=$1
    local h=$(( total_seconds / 3600 ))
    local m=$(( (total_seconds % 3600) / 60 ))
    local s=$(( total_seconds % 60 ))
    printf "%02d:%02d:%02d\n" $h $m $s
}

# Intervalos de tiempo a sumar (puedes cambiar estos valores)
time1="01:30:15"
time2="02:45:35"

# Convertir ambos tiempos a segundos
seconds1=$(hms_to_seconds $time1)
seconds2=$(hms_to_seconds $time2)

# Sumar los segundos
total_seconds=$(( seconds1 + seconds2 ))

# Convertir el total de segundos a horas:minutos:segundos
total_time=$(seconds_to_hms $total_seconds)

# Imprimir el resultado
echo "La suma de $time1 y $time2 es $total_time"
