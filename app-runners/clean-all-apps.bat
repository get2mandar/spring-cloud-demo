@ECHO OFF
:BEGIN
CLS

TITLE CLEAN-ALL-APPS - MAVEN CLEAN

SET command=mvn clean

ECHO Clean Infra Services

CD ../apps-infra

ECHO ------------
ECHO config-server
ECHO ------------
CD config-server
CALL %command%


ECHO ------------
ECHO eureka-server
ECHO ------------
CD ../eureka-server
CALL %command%


ECHO ------------
ECHO edge-gateway
ECHO ------------
CD ../edge-gateway
CALL %command%


ECHO ------------
ECHO admin-dash
ECHO ------------
CD ../admin-dash
CALL %command%


ECHO .
timeout /T 5 /NOBREAK>nul
ECHO .

ECHO Clean API Services

CD ../../apps-api/

ECHO ------------
ECHO book-data-service
ECHO ------------
CD book-data-service
CALL %command%


ECHO ------------
ECHO book-added-info-service
ECHO ------------
CD ../book-added-info-service
CALL %command%


ECHO ------------
ECHO book-catalog-service
ECHO ------------
CD ../book-catalog-service
CALL %command%

:END
pause