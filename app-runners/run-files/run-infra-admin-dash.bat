@ECHO OFF
:BEGIN
CLS
COLOR 5F

TITLE RUN admin-dashboard 9090

CD ../../apps-infra/admin-dash

CALL java -jar -XX:+UseSerialGC -Xss512k target\admin-dash-0.1.jar

:END
pause