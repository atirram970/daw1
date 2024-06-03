#!/bin/bash

num=5
while [[ $num -gt 0 ]]; do
if [[ $num -gt 1 ]]; then
  echo -n $num","
else
  echo -n $num
fi
  num=$(($num-1))
done

echo -e "\n"
