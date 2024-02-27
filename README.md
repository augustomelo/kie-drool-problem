# Steps to reproduce

```bash
./gradlew clean assemble

docker-buildx build . -t demo:latest
docker run -it --rm -p 8080:8080 --name demo demo:latest

curl -X GET http://localhost:8080/problem


```
