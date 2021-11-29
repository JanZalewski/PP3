@echo off
pause
if exist *.class del *.class

echo *******************
echo Compilation...
javac Check1Set3.java
javac Point.java
javac Numbers.java
javac Ages.java
javac Counter.java
javac Food.java
javac InternetDevice.java

echo *******************
echo Checking classes...
java Check1Set3

echo *******************
pause
