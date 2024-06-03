#!/bin/bash
#ejemplo de case
read -p "Dime una fruta" fruta
case $fruta in
    "manzana"|"Manzana")
      echo "La manzana está mu buena. Las hay rojas y verdes"
    ;;
    "banana"|"Banana")
      echo "La banana es amarilla"
    ;;
    "kiwi"|"Kiwi")
      echo "En Nueva Zelanda es famosa por los kiwis"
    ;;
    *)
      echo "No se que fruta es"
    ;;
esac
