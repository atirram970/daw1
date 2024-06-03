#!/bin/bash

id=$(id -u)

if [ $id -eq 0 ]; then
  echo "Eres Root"
else
  echo "No eres Root"
fi
