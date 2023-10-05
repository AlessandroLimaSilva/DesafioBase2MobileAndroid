rem @echo off
rem @AlessandroLima 08/06/2023
rem Compilação do projeto mobile para ser executado na aws device farm
echo Iniciando a compilacao do projeto
echo Deletando a pasta target se existir.
call rmdir /s /q target
echo Deletando a pasta temp se existir.
call rmdir /s /q temp
echo Executando o Maven.
call mvn clean package -DskipTests=true
echo Execucao do Maven finalizada.
echo Iniciando Contrucao da estrutura de dados
mkdir temp
xcopy /s target\dependency-jars temp\
xcopy /s target\*.jar* temp\
mkdir temp\DesafioBase2MobileAndroid
mkdir temp\DesafioBase2MobileAndroid\src
xcopy /s src temp\DesafioBase2MobileAndroid\src
xcopy pom.xml temp\DesafioBase2MobileAndroid
xcopy serenity.properties temp\DesafioBase2MobileAndroid
cd temp
powershell -Command "Compress-Archive -Path * -DestinationPath test_package.zip"
copy test_package.zip ..\target
cd ..
echo Fim da construcao do projeto
echo arquivo disponivel em target/test_package.zip