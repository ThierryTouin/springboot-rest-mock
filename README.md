springboot-rest-secure-mock
===========================

# Lancer le serveur a la racine du projet Eclipse
`cd /mnt/data/Developpement/java/workspace/springboot-rest-secure-mock-root`

`mvn spring-boot:run`

# Service REST
`http://localhost:8080/rest/test`
`http://localhost:9999/rest/order/1`


# Service CATS (Spring rest data)

=> S'authentification avec un navigateur, pour récupérer le cookies session et le mettre dans les appels curl.

`http://localhost:9999/cats`

`curl -i -X POST -d '{"name":"Tata","colour":"red"}' -H 'Cookie: JSESSIONID=f06sl7o8n5szpiuahdb6yh8z' -H 'Content-Type: application/json' http://localhost:9999/cats`

`curl -i -X POST -d '{"name":"Tutu","colour":"green"}' -H 'Cookie: JSESSIONID=f06sl7o8n5szpiuahdb6yh8z' -H 'Content-Type: application/json' http://localhost:9999/cats`

`curl -i -X POST -d '{"name":"Barbapapa","colour":"yellow"}' -H 'Cookie: JSESSIONID=f06sl7o8n5szpiuahdb6yh8z' -H 'Content-Type: application/json' http://localhost:9999/cats`

Pour récupérer, tous les éléments : `http://localhost:9999/cats`

Pour récupérer un élément : `http://localhost:9999/cats/1`




# SECURISE
Pour activer ou désactiver la sécurité, faire une recherche dans le code de "SPRING_SECURITY"

`curl -v --user user1:user1 -H "Accept: application/json" http://localhost:8080/rest/test`




