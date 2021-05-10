@ECHO OFF
:BEGIN
CLS

:: Read All Variables
SET ServiceName=%~1
SET Port=%~2
SET AppType=%~3
SET color=%~4

COLOR %color%


TITLE RUN %ServiceName%
::CALL run-select-env.bat

IF %env% EQU dev GOTO DEVPRT
IF %env% EQU prod GOTO PRODPRT

:DEVPRT
SET PRTMSG=DEV-%Port%
GOTO RUNAPP

:PRODPRT
SET PRTMSG=PROD-%Port%
GOTO RUNAPP

:RUNAPP
TITLE RUN %ServiceName% %PRTMSG%

CD ../../%AppType%/%ServiceName%

CALL java -jar -Dspring.profiles.active=%env% -XX:+UseSerialGC -Xss512k target\%ServiceName%-0.1.jar


:END
pause