@ECHO OFF

:BEGIN
CLS
TITLE RUN Angular UI App:4200

CD ../../apps-ui/book-catalog-ui
CALL ng serve

:END
pause