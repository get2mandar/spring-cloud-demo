@ECHO OFF
:BEGIN
CLS
CALL compile-options.bat

TITLE COMPILE SERVICE APPS %OPTMSG%

ECHO START

ECHO book-data-service
CD ../../book-data-service
CALL %command%


ECHO DONE

:END
pause