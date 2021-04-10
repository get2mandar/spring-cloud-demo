@ECHO OFF
:BEGIN
CLS
CALL run-select-env.bat

TITLE RUN-INFRA %env%

ECHO config-server %env%
ECHO Wait 15 Seconds for Config Server to StartUp
start cmd /c "CALL run-infra-config-server.bat"
timeout /T 10 /NOBREAK>nul

ECHO eureka-server %env%
ECHO Wait 10 Seconds for Eureka Discovery Server to StartUp
start cmd /c "CALL run-infra-eureka-server.bat"
::timeout /T 10 /NOBREAK>nul

:: ECHO RUN INFRA ebms-zuul-api-gateway %env%
:: start cmd /c "CALL RUN-INFRA-ebms-zuul-api-gateway.bat"


:: ECHO RUN INFRA ebms-gateway-edge-server %env%
:: start cmd /c "CALL RUN-INFRA-ebms-gateway-edge-server.bat"
:: timeout /T 10 /NOBREAK>nul


:: ECHO RUN INFRA ebms-hystrix-dashboard %env%
:: start cmd /c "CALL RUN-INFRA-ebms-hystrix-dashboard.bat"
:: timeout /T 10 /NOBREAK>nul


:: ECHO RUN INFRA ebms-apidocs-service %env%
:: start cmd /c "CALL RUN-INFRA-ebms-apidocs-service.bat"


:END