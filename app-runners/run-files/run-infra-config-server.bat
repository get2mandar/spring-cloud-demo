@ECHO OFF
:BEGIN
CLS
COLOR 0F

TITLE RUN config-server 8888 native

CD ../../config-server

ECHO START
CALL java -jar -XX:+UseSerialGC -Xss512k target\config-server-0.1.jar --spring.cloud.config.server.git.password=%GHP_RONLY_TOKEN%


:END
pause