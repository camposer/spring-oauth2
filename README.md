# spring-oauth2

Ejemplo básico de Spring con OAuth2. Falta separar el fichero de springSercurity.xml

Para utilizar el servicio con cURL:

## Token password (2-legged)
$ curl -v -X POST -H "Authorization: Basic  MzUzYjMwMmM0NDU3NGY1NjUwNDU2ODdlNTM0ZTdkNmE6Mjg2OTI0Njk3ZTYxNWE2NzJhNjQ2YTQ5MzU0NTY0NmM=" 'http://localhost:8080/civitana-oauth/oauth/token?grant_type=password&username=admin&password=admin'

## Token client_credentials (2-legged)
$ curl -v -X POST -H "Authorization: Basic MzUzYjMwMmM0NDU3NGY1NjUwNDU2ODdlNTM0ZTdkNmE6Mjg2OTI0Njk3ZTYxNWE2NzJhNjQ2YTQ5MzU0NTY0NmM=" 'http://localhost:8080/civitana-oauth/oauth/token?grant_type=client_credentials'

## Accediendo al recurso securizado

$ TOKEN=(Valor devuelto por la llamada cURL anterior)

$ curl -H "Authorization: Bearer $TOKEN" http://localhost:8080/civitana-oauth/sec/hello

Nota: El "token" basic es el resultado del base64 de client-id:secret
