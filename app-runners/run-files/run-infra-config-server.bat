@ECHO OFF
:BEGIN
CLS
COLOR 5F

TITLE RUN config-server 8888 native

CD ../../apps-infra/config-server

CALL java -jar -XX:+UseSerialGC -Xss512k target\config-server-0.1.jar


:END
pause