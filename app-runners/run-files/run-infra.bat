@ECHO OFF
:BEGIN
CLS
CALL run-select-env.bat

TITLE RUN-INFRA %env%

ECHO config-server %env%
ECHO Wait 10 Seconds for Config Server to StartUp
start cmd /c "CALL run-infra-config-server.bat"
timeout /T 10 /NOBREAK>nul

ECHO eureka-server %env%
ECHO Wait 10 Seconds for Eureka Discovery Server to StartUp
start cmd /c "CALL run-infra-eureka-server.bat"
::timeout /T 10 /NOBREAK>nul


:: ECHO RUN INFRA edge-gateway %env%
:: start cmd /c "CALL run-infra-edge-gateway.bat"
:: timeout /T 10 /NOBREAK>nul

:: ECHO RUN INFRA hystrix-dashboard %env%
:: start cmd /c "CALL run-infra-hystrix-dashboard.bat"
:: timeout /T 10 /NOBREAK>nul


:END