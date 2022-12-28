@ECHO OFF
:BEGIN
CLS
CALL compile-options.bat

TITLE COMPILE APPS INFRA _ %OPTMSG%
ECHO START


ECHO ------------
ECHO config-server
ECHO ------------
CD ../../apps-infra/config-server
CALL %command%



ECHO ------------
ECHO eureka-server
ECHO ------------
CD ../eureka-server
CALL %command%



ECHO ------------
ECHO edge-gateway
ECHO ------------
CD ../edge-gateway
CALL %command%



ECHO ------------
ECHO admin-dashboard
ECHO ------------
CD ../admin-dash
CALL %command%


ECHO DONE
:END
pause