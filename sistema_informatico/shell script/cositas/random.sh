#!/bin/bash

#Para un rango de 0 a 9: 
echo $(( RANDOM % 10 ))
#Para un rango de 1 a 10: 
echo $(( RANDOM % 10 + 1 ))
#Para un rango de 50 a 100: 
echo $(( RANDOM % 51 + 50 ))
