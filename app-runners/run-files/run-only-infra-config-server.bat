@ECHO OFF
:BEGIN
CLS
COLOR 5F

TITLE 8888 config-server git-default

SET YYYY_MM_DD=%date:~6,4%-%date:~3,2%-%date:~0,2%
SET LOG_FILE=C:\WORKDATA\StudySpace\SCDemo\AppLogs\run-logs\config-server-%YYYY_MM_DD%.log

ECHO Find Logs Here: %LOG_FILE%

> %LOG_FILE% (
CD ../../apps-infra/config-server

CALL java -jar -XX:+UseSerialGC -Xss512k target\config-server-0.1.jar --spring.cloud.config.server.git.uri=%GH_SCDEMO_URI% --spring.cloud.config.server.git.username=%GH_USER% --spring.cloud.config.server.git.password=%GHP_RONLY_TOKEN%  --spring.cloud.config.server.git.basedir=%GH_SCDEMO_BASEDIR%

:END
pause
)