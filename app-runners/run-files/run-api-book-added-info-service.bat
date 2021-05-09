@ECHO OFF
:BEGIN
CLS
COLOR 1F

TITLE RUN book-added-info-service
CALL run-select-env.bat

IF %env% EQU dev GOTO DEVPRT
IF %env% EQU prod GOTO PRODPRT

:DEVPRT
SET PRTMSG=DEV-9071
GOTO RUNAPP

:PRODPRT
SET PRTMSG=PROD-8271
GOTO RUNAPP

:RUNAPP
TITLE RUN book-data-service %PRTMSG%

CD ../../apps-api/book-added-info-service

CALL java -jar -Dspring.profiles.active=%env% -XX:+UseSerialGC -Xss512k target\book-added-info-service-0.1.jar


:END
pause