#!/bin/bash

mkdir temp
cp -rp target/dependency-jars temp/
cp -r target/*.jar* temp/
mkdir -p temp/DesafioBase2MobileAndroid
cp -rp src temp/DesafioBase2MobileAndroid
cp pom.xml temp/DesafioBase2MobileAndroid
cp serenity.properties temp/DesafioBase2MobileAndroid
cd temp
zip -r test_package.zip *
cp test_package.zip ../target