@ECHO OFF
:BEGIN
CLS
CALL run-select-env.bat

TITLE RUN-INFRA %env%

SET apptype=apps-infra
SET color=5F

:: RUN config-server (SEPARATE WINDOW)
start cmd /c "CALL run-only-infra-config-server.bat"

:: RUN zipkin-server (SEPARATE WINDOW)
start cmd /c "CALL run-zipkin-server.bat"


:: SET PORT eureka-server
SET eureka-port=9761
if %env%==prod (
	SET eureka-port=8761
)

:: SET PORT edge-gateway
SET gateway-port=9050
if %env%==prod (
	SET gateway-port=8250
)


:: CALL SERVICE APPS
:: RUN eureka-server
start cmd /c "CALL run-service.bat eureka-server %eureka-port% %apptype% %color%"
timeout /T 5 /NOBREAK>nul

:: RUN edge-gateway
start cmd /c "CALL run-service.bat edge-gateway %gateway-port% %apptype% %color%"
timeout /T 5 /NOBREAK>nul

:: RUN admin-dashboard
start cmd /c "CALL run-only-infra-admin-dash.bat"

:END