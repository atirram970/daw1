#!/bin/bash

#SCRIPT LEE FICHERO
oldIFS=$IFS

while IFS=: read -r user pass uid gid full home shell
do
  echo "Usuario = $user"
  echo "Pass = $pass"
  echo "UID = $uid"
  echo "GUID = $gid"
  sleep 1
done < /etc/passwd

IFS=$oldIFS
