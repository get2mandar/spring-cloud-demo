@ECHO OFF
:BEGIN
CLS
CD compile-files
CALL compile-options.bat


TITLE COMPILE-ALL-APPS %env%

CLS

ECHO Compile Infra Services
start cmd /c "CALL compile-apps-infra.bat"
timeout /T 20 /NOBREAK>nul


ECHO Compile API Services
start cmd /c "CALL compile-apps-api.bat"


:END