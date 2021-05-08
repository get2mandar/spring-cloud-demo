@ECHO OFF
:BEGIN
CLS

IF "%env%" EQU "" GOTO SELECTENV
IF "%env%" NEQ "" GOTO ENDENV

:SELECTENV
ECHO Select Environment
ECHO 1. Development (dev)
ECHO 2. Production (prod)
ECHO.

CHOICE /C 12 /M "Select Environment:"

:: Below is the ERRORLEVEL in decreasing order
IF ERRORLEVEL 2 GOTO PROD_ENV
IF ERRORLEVEL 1 GOTO DEV_ENV

:PROD_ENV
SET env=prod
GOTO ENDENV

:DEV_ENV
SET env=dev
GOTO ENDENV

:ENDENV
CLS
ECHO Environment Selected  :%env%:
ECHO.