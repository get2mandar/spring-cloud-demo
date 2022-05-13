@ECHO OFF
:BEGIN
CLS

IF "%OPTMSG%" EQU "" GOTO SELECTOPT
IF "%OPTMSG%" NEQ "" GOTO ENDENV

:SELECTOPT
ECHO Select Compile Options
ECHO 1. Compile - No Tests
ECHO 2. Compile - With UnitTests
ECHO.

CHOICE /C 12 /M "Select Compile Option:"

:: Below is the ERRORLEVEL in decreasing order
IF ERRORLEVEL 2 GOTO UNITTEST
IF ERRORLEVEL 1 GOTO NOTEST

:UNITTEST
SET OPTMSG=With UnitTests
SET command=mvn clean package
GOTO ENDENV

:NOTEST
SET OPTMSG=NO UnitTests
SET command=mvn -e clean package -DskipTests
GOTO ENDENV

:ENDENV