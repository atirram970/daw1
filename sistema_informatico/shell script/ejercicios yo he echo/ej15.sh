#!/bin/bash

num=$1

for (( i = 1; i <= 10; i++ ));
  echo "$num * $i = $[$num*$i]"
done
