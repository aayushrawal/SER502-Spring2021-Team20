#!/bin/sh

ROOT_PATH="$PWD"

LIB_PATH="$ROOT_PATH/lib"

echo alias yasl=\'java -jar $LIB_PATH/SER502-Spring2021-Team20.jar\' >> ~/.bashrc
echo export yasl >> ~/.bashrc

echo
echo "Install Complete."
echo
