@ECHO OFF
:BEGIN
CLS

:: Read All Variables
SET ServiceName=%~1
SET Port=%~2
SET AppType=%~3
SET color=%~4

COLOR %color%

IF %env% EQU dev GOTO DEVPRT
IF %env% EQU prod GOTO PRODPRT

:DEVPRT
SET PRTMSG=DEV-%Port%
GOTO RUNAPP

:PRODPRT
SET PRTMSG=PROD-%Port%
GOTO RUNAPP

:RUNAPP
TITLE %PRTMSG% %ServiceName%

SET YYYY_MM_DD=%date:~6,4%-%date:~3,2%-%date:~0,2%
SET LOG_FILE=%GH_SCDEMO_APPLOGS%\run-logs\%ServiceName%-%Port%-%YYYY_MM_DD%.log

ECHO Find Logs Here: %LOG_FILE%

> %LOG_FILE% (
CD ../../%AppType%/%ServiceName%

CALL java -jar -Dspring.profiles.active=%env% -Dserver.port=%Port% -XX:+UseSerialGC -Xss512k target\%ServiceName%-0.1.jar


:END
pause
)