@ECHO OFF
:BEGIN
CLS
COLOR 5F

TITLE 8888 config-server git-default

CD ../../apps-infra/config-server

CALL java -jar -XX:+UseSerialGC -Xss512k target\config-server-0.1.jar --spring.cloud.config.server.git.uri=%GH_SCDEMO_URI% --spring.cloud.config.server.git.username=%GH_USER% --spring.cloud.config.server.git.password=%GHP_RONLY_TOKEN%  --spring.cloud.config.server.git.basedir=%GH_SCDEMO_BASEDIR%

:END
pause