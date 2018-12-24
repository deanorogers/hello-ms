# hello-ms
## Simple Hello World REST service
### Docker commands
// run container in background mode  
$ docker run -d -p 8080:8080 spring-boot-server  

// connect to a running container instance  
$ docker exec -it {container ID} /bin/bash  

// determine IP address of running container  
docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' {CONTAINER_ID}  

// stop but not remove a running container    
$ docker container stop {container ID}  

// remove a container instance that's been stopped  
$ docker rm {container ID}  

// enable bash in alpine distro linux  
// add this to Dockerfile  
RUN apk add --no-cache bash  

### Git commands

// commit all modified  
git commit . -m "description of change"  
