# springboot-rest-secure-mock

Lancer le serveur a la racine du projet Eclipse :
=================================================
cd /mnt/data/Developpement/java/workspace/springboot-rest-secure-mock-root

mvn spring-boot:run

SERVICE REST :
============== 
http://localhost:8080/rest/test

SECURISE
========
Pour activer ou désactiver la sécurité, faire une recherche dans le code de "SPRING_SECURITY"

curl -v --user user1:user1 -H "Accept: application/json" http://localhost:8080/rest/test
