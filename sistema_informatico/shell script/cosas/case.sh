#!/bin/bash
# Ejemplo de case

read -p "Dime una fruta: " fruta

case "$fruta" in
	"manzana") echo "La manzana está muy buena. Las hay rojas y verdes"
	;;
	"banana") echo "La banana es amarilla."
	;;
	"kiwi") echo "En Nueva Zelanda es famosa por los kiwis"
	;;
	*) echo "No sé qué fruta es."
	;;
esac
