FROM openjdk:21
ADD target/devops-integration.jar deneme
ENTRYPOINT ["java ","-jar","deneme"]
