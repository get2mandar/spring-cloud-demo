@ECHO OFF
:BEGIN
CLS
CALL run-select-env.bat

TITLE RUN-API %env%

SET apptype=apps-api
SET color=1F

:: RUN book-data-service
SET port=9081
if %env%==prod (
	SET port=8281
)
CALL run-multi-instance.bat book-data-service %port% %apptype% %color%


:END