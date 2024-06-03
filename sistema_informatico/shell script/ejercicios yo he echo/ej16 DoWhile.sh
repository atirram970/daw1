#!/bin/bash

num=$1
i=0

while [ i<=10 ]; do
  echo "$num * $i = $[$num*$i]"
  i=$i+1
done
