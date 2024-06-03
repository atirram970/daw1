#!/bin/bash

#SCRIPT LEE FICHERO
#oldIFS=$IFS

read -p "¿Que fichero quiere leer?: " fichero

if [[ ! -f $fichero ]]; then
  echo "Perdona, esto no es un fichero"
else
  while IFS=: read -r line
  do
    user=$(echo $line | cut -d":" -f1)
    pass=$(echo $line | cut -d":" -f2)
    uid=$(echo $line | cut -d":" -f3)
    gid=$(echo $line | cut -d":" -f4)
    if [[ $uid -gt 1000 ]]; then
      echo "Usuario = $user"
      echo "Pass = $pass"
      echo "uid = $uid"
      echo "gid = $gid"
      sleep 1
    fi
  done < /etc/passwd
fi

#IFS=$oldIFS
