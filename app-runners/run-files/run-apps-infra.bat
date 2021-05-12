@ECHO OFF
:BEGIN
CLS
CALL run-select-env.bat

TITLE RUN-INFRA %env%

SET apptype=apps-infra
SET color=5F

:: RUN config-server
start cmd /c "CALL run-infra-config-server.bat"
timeout /T 10 /NOBREAK>nul


:: RUN eureka-server
SET port=9761
if %env%==prod (
	SET port=8761
)
start cmd /c "CALL run-service.bat eureka-server %port% %apptype% %color%"
timeout /T 10 /NOBREAK>nul


:END