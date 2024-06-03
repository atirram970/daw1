#!/bin/bash

#VARIABLES
numero=$1

if [[ $# -ne 1 ]]; then
  echo "Debes de pasar un parámetro por terminal"
  echo "Ejemplo de uso: $0 5"
else
  if [[ $numero -gt 9 || $numero -lt 0 ]]; then
    echo "El número debe de ser mayor a 0 y menor a 9"
  else
    for numero in $(seq $numero -1 0); do
      clear
      case $numero in
        0)
            echo "  000  "
            echo " 0   0 "
            echo "0     0"
            echo "0     0"
            echo "0     0"
            echo " 0   0 "
            echo "  000  "
            ;;
        1)
            echo "   1   "
            echo "  11   "
            echo "   1   "
            echo "   1   "
            echo "   1   "
            echo "   1   "
            echo "  111  "
            ;;
        2)
            echo "  222  "
            echo " 2   2 "
            echo "    2  "
            echo "   2   "
            echo "  2    "
            echo " 2     "
            echo " 22222 "
            ;;
        3)
            echo "  333  "
            echo " 3   3 "
            echo "    3  "
            echo "  333  "
            echo "    3  "
            echo " 3   3 "
            echo "  333  "
            ;;
        4)
            echo "   4   "
            echo "  44   "
            echo " 4 4   "
            echo "4  4   "
            echo "444444 "
            echo "   4   "
            echo "   4   "
            ;;
        5)
            echo " 55555 "
            echo " 5     "
            echo " 5555  "
            echo "     5 "
            echo "     5 "
            echo " 5   5 "
            echo "  555  "
            ;;
        6)
            echo "  666  "
            echo " 6     "
            echo " 6666  "
            echo " 6   6 "
            echo " 6   6 "
            echo " 6   6 "
            echo "  666  "
            ;;
        7)
            echo " 77777 "
            echo "     7 "
            echo "    7  "
            echo "   7   "
            echo "  7    "
            echo " 7     "
            echo " 7     "
            ;;
        8)
            echo "  888  "
            echo " 8   8 "
            echo " 8   8 "
            echo "  888  "
            echo " 8   8 "
            echo " 8   8 "
            echo "  888  "
            ;;
        9)
            echo "  999  "
            echo " 9   9 "
            echo " 9   9 "
            echo "  9999 "
            echo "     9 "
            echo "     9 "
            echo "  999  "
            ;;
      esac
      num=$((num-1))
      echo ""
      sleep 1
    done
  fi
fi
