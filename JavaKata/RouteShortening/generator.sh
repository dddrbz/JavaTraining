#!/bin/bash

for ((i = 0; i < 1000; ++i))
do
  echo -e "TOP 42" >> index.txt
  echo -e "LEFT 450" >> index.txt
  echo -e "TOP 150" >> index.txt
  echo -e "BOTTOM 150" >> index.txt
  echo -e "RIGHT 450" >> index.txt
  echo -e "LEFT 42" >> index.txt
done