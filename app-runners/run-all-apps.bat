@ECHO OFF
:BEGIN
CLS
CD run-files
CALL run-select-env.bat


TITLE RUN-ALL-APPS %env%

ECHO Run Infra Services
start cmd /c "CALL run-apps-infra.bat"
timeout /T 20 /NOBREAK>nul


ECHO Run API Services
start cmd /c "CALL run-apps-api.bat"


:END