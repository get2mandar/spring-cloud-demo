@ECHO OFF
:BEGIN
CLS
CALL compile-options.bat

TITLE COMPILE APPS API _ %OPTMSG%
ECHO START


ECHO ------------
ECHO book-data-service
ECHO ------------
CD ../../apps-api/book-data-service
CALL %command%



ECHO ------------
ECHO book-added-info-service
ECHO ------------
CD ../book-added-info-service
CALL %command%



ECHO ------------
ECHO book-catalog-service
ECHO ------------
CD ../book-catalog-service
CALL %command%


ECHO DONE
:END
pause