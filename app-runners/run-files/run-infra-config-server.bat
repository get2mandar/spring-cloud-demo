@ECHO OFF
:BEGIN
CLS
:: SELECTENV COLOR (Background Black 0 - Text BrightWhite F)
COLOR 0F

TITLE RUN config-server 8888 native

CD ../../config-server

ECHO START
CALL java -jar -XX:+UseSerialGC -Xss512k target\config-server-0.1.jar


:END
pause