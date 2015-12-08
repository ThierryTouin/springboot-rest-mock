springboot-rest-secure-mock
===========================

# Lancer le serveur a la racine du projet Eclipse
`cd /mnt/data/Developpement/java/workspace/springboot-rest-secure-mock-root`

`mvn spring-boot:run`

# Mettre à jour git 

`git commit .`

`git push -u origin master`

# Swagger UI

`http://localhost:9998/swagger-ui.html`

# Metrics

`http://localhost:9998/metrics`


# Service REST
`http://localhost:9998/rest/test`
`http://localhost:9998/rest/order/1`


# Service CATS (Spring rest data)

=> S'authentification avec un navigateur, pour recuperer le cookies session et le mettre dans les appels curl.

`http://localhost:9998/cats`

`curl -i -X POST -d '{"name":"Tata","colour":"red"}' -H 'Cookie: JSESSIONID=f06sl7o8n5szpiuahdb6yh8z' -H 'Content-Type: application/json' http://localhost:9998/cats`

`curl -i -X POST -d '{"name":"Tutu","colour":"green"}' -H 'Cookie: JSESSIONID=f06sl7o8n5szpiuahdb6yh8z' -H 'Content-Type: application/json' http://localhost:9998/cats`

`curl -i -X POST -d '{"name":"Barbapapa","colour":"yellow"}' -H 'Cookie: JSESSIONID=f06sl7o8n5szpiuahdb6yh8z' -H 'Content-Type: application/json' http://localhost:9998/cats`

Pour recuperer, tous les elements : `http://localhost:9998/cats`

Pour recuperer un elements : `http://localhost:9998/cats/1`




# SECURISE
Pour activer ou desactiver la securite, faire une recherche dans le code de "SPRING_SECURITY"

`curl -v --user user1:user1 -H "Accept: application/json" http://localhost:8080/rest/test`




