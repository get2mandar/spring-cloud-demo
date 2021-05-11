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


:: RUN book-added-info-service
SET port=9071
if %env%==prod (
	SET port=8271
)
CALL run-multi-instance.bat book-added-info-service %port% %apptype% %color%


:: RUN book-catalog-service
SET port=9061
if %env%==prod (
	SET port=8261
)
start cmd /c "CALL run-service.bat book-catalog-service %port% %apptype% %color%"


:END