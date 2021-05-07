@ECHO OFF
:BEGIN
CLS
COLOR 5F

TITLE RUN eureka-server
CALL run-select-env.bat

IF %env% EQU dev GOTO DEVPRT
IF %env% EQU prod GOTO PRODPRT

:DEVPRT
SET PRTMSG=DEV-9761
GOTO RUNAPP

:PRODPRT
SET PRTMSG=PROD-8761
GOTO RUNAPP

:RUNAPP
TITLE RUN eureka-server %PRTMSG%

CD ../../eureka-server

ECHO START
CALL java -jar -Dspring.profiles.active=%env% -XX:+UseSerialGC -Xss512k target\eureka-server-0.1.jar


:END
pause