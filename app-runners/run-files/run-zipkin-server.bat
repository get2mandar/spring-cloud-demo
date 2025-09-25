@ECHO OFF

:BEGIN
CLS
TITLE RUN Zipkin-Server PORT:9411

SET YYYY_MM_DD=%date:~6,4%-%date:~3,2%-%date:~0,2%
SET LOG_FILE=C:\WORKDATA\StudySpace\SCDemo\AppLogs\run-logs\zipkin-server-%YYYY_MM_DD%.log

ECHO Find Logs Here: %LOG_FILE%

> %LOG_FILE% (
CALL java -jar %ZIPKIN_JAR_FILE%

:END
pause
)