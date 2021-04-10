@ECHO OFF
:BEGIN
CLS
CALL compile-options.bat

TITLE COMPILE INFRA APPS %OPTMSG%

ECHO START

ECHO config-server
CD ../../config-server
CALL %command%


ECHO ------------
ECHO eureka-server
CD ../eureka-server
CALL %command%



ECHO DONE

:END
pause