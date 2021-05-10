@ECHO OFF
:BEGIN
CLS
CALL compile-options.bat

TITLE COMPILE APPS API _ %OPTMSG%

ECHO START

ECHO book-data-service
CD ../../apps-api/book-data-service
CALL %command%



ECHO ------------
ECHO book-added-info-service
CD ../book-added-info-service
CALL %command%



ECHO ------------
ECHO book-catalog-service
CD ../book-catalog-service
CALL %command%



ECHO DONE

:END
pause