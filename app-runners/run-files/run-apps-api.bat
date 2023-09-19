@ECHO OFF
:BEGIN
CLS
CALL run-select-env.bat

TITLE RUN-API %env%

SET apptype=apps-api
SET color=1F

:: SET PORT book-data-service
SET book-data-port=9081
if %env%==prod (
	SET book-data-port=8281
)

:: SET PORT book-added-info-service
SET book-info-port=9071
if %env%==prod (
	SET book-info-port=8271
)

:: SET PORT book-catalog-service
SET catalog-port=9061
if %env%==prod (
	SET catalog-port=8261
)


::BACKUP OLD WAY OF CALLING SERVICE APPS
:: RUN book-data-service
::CALL run-multi-instance.bat book-data-service %book-data-port% %apptype% %color%
::
:: RUN book-added-info-service
::CALL run-multi-instance.bat book-added-info-service %book-info-port% %apptype% %color%
::
:: RUN book-catalog-service
::start cmd /c "CALL run-service.bat book-catalog-service %catalog-port% %apptype% %color%"


:: RUN book-data-service AND book-added-info-service AND book-catalog-service IN SAME WINDOW BUT MULTIPLE TABS
wt run-multi-instance.bat book-data-service %book-data-port% %apptype% %color%; run-multi-instance.bat book-added-info-service %book-info-port% %apptype% %color%; run-multi-instance.bat  book-catalog-service %catalog-port% %apptype% %color%


:END