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

CD ../../apps-infra/admin-dash

CALL java -jar -Dspring.profiles.active=%env% -Dserver.port=%port% -XX:+UseSerialGC -Xss512k target\admin-dash-0.1.jar

:END
pause