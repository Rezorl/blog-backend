
ECHO "Create postres colume"
CALL docker volume create postgres-data

ECHO "Run services"
CALL docker-compose up -d
pause
