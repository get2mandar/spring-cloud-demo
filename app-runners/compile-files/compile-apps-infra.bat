@ECHO OFF
:BEGIN
CLS
CALL compile-options.bat

TITLE COMPILE APPS INFRA _ %OPTMSG%

ECHO START

ECHO config-server
CD ../../apps-infra/config-server
CALL %command%


ECHO ------------
ECHO eureka-server
CD ../eureka-server
CALL %command%



ECHO DONE

:END
pause