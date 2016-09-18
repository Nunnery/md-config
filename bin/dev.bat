@ECHO OFF
call mvn clean install
java -jar target\md-config.jar server config\configuration-development.yml