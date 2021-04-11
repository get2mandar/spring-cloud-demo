@ECHO OFF
:BEGIN
CLS
TITLE RUN book-data-service
CALL run-select-env.bat

IF %env% EQU dev GOTO DEVPRT
IF %env% EQU prod GOTO PRODPRT

:DEVPRT
SET PRTMSG=DEV-9081
GOTO RUNAPP

:PRODPRT
SET PRTMSG=PROD-8281
GOTO RUNAPP

:RUNAPP
TITLE RUN book-data-service %PRTMSG%

CD ../../book-data-service

ECHO START
CALL java -jar -Dspring.profiles.active=%env% -XX:+UseSerialGC -Xss512k target\book-data-service-0.1.jar


:END
pause