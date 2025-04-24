#!/bin/bash

# Create bin directories if they don't exist
mkdir -p bin
mkdir -p Abstraction/bin
mkdir -p Inheritance/bin
mkdir -p Packages/bin
mkdir -p x/bin

# Compile root directory Java files
javac -d bin *.java

# Compile Abstraction directory
cd Abstraction
javac -d bin *.java
cd ..

# Compile Inheritance directory
cd Inheritance
javac -d bin *.java
cd ..

# Compile Packages directory
cd Packages
javac -d bin *.java
cd ..

# Compile x directory
cd x
javac -d bin *.java
cd ..

echo "Compilation complete. Class files are in their respective bin directories." 