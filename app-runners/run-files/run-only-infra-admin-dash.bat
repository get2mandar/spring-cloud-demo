@ECHO OFF
:BEGIN
CLS
CALL run-select-env.bat

COLOR 5F

SET port=9090
if %env%==prod (
	SET port=8290
)

SET envprint=DEV
if %env%==prod (
	SET envprint=PROD
)

TITLE %envprint%-%port% admin-dashboard

SET YYYY_MM_DD=%date:~6,4%-%date:~3,2%-%date:~0,2%
SET LOG_FILE=%GH_SCDEMO_APPLOGS%\run-logs\admin-dashboard-%port%-%YYYY_MM_DD%.log

ECHO Find Logs Here: %LOG_FILE%

> %LOG_FILE% (
CD ../../apps-infra/admin-dash

CALL java -jar -Dspring.profiles.active=%env% -Dserver.port=%port% -XX:+UseSerialGC -Xss512k target\admin-dash-0.1.jar

:END
pause
)