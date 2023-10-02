#!/bin/bash

mkdir temp
cp -rp target/dependency-jars temp/
cp -r target/*.jar* temp/
mkdir -p temp/QAPortalClienteAPPSerenity
cp -rp src temp/QAPortalClienteAPPSerenity
cp pom.xml temp/QAPortalClienteAPPSerenity
cp serenity.properties temp/QAPortalClienteAPPSerenity
cd temp
zip -r test_package.zip *
cp test_package.zip ../target