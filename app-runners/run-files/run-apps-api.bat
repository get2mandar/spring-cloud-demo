@ECHO OFF
:BEGIN
CLS
CALL run-select-env.bat

TITLE RUN-API-SERVICE %env%

ECHO book-data-service %env%
ECHO Starting Book Data Service
start cmd /c "CALL run-api-book-data-service.bat"
timeout /T 10 /NOBREAK>nul

ECHO book-added-info-service %env%
ECHO Starting Book Added Info Service
start cmd /c "CALL run-api-book-added-info-service.bat"
::timeout /T 10 /NOBREAK>nul


:: ECHO RUN INFRA edge-gateway %env%
:: start cmd /c "CALL run-infra-edge-gateway.bat"
:: timeout /T 10 /NOBREAK>nul

:: ECHO RUN INFRA hystrix-dashboard %env%
:: start cmd /c "CALL run-infra-hystrix-dashboard.bat"
:: timeout /T 10 /NOBREAK>nul


:END