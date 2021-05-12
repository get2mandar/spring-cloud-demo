@ECHO OFF
:BEGIN
CLS

:: Read All Variables
SET ServiceName=%~1
SET /A Port=%~2
SET AppType=%~3
SET color=%~4

COLOR %color%
GOTO INPUT_MAX


:INPUT_MAX
CLS
ECHO %ServiceName%
SET /P MAX=Enter Instance Number to Run [1,2,3]:
SET /A MAX_NUM=%MAX%

IF %MAX_NUM% EQU %MAX% (
	IF %MAX% LEQ 0 GOTO INPUT_MAX
	IF %MAX% GTR 3 GOTO INPUT_MAX
) ELSE (
	GOTO INPUT_MAX
)

setlocal enableDelayedExpansion
FOR /L %%G IN (1,1,%MAX%) DO (
	start cmd /c "CALL run-service.bat %ServiceName% !Port! %apptype% %color%"
	SET /A Port+=1
	timeout /T 5 /NOBREAK>nul
)
endlocal


:END