# RENDU devops examen

## Tester la version
```
docker-compose build
docker-compose up
```
Le projet fonctionne correctement lors du build et du up

## Lancer les commandes suivantes
Avoir jenkins de lancer
```
docker container run -p 8085:8080 -v jenkins_home:/var/jenkins_home --name jenkins --rm jenkins/jenkins:lts
```
(On part du principe que l'utilisateur  à déjà paramétré jenkins et qu'il a déjà installer docker dans le conteneur jenkins.)

se rendre sur l'url
http://localhost:8085
On arrive sur l'interface jenkins

- Créer un job que l'on nommera "builder_image"
- Dans la configuration descendre jusqu'à la partie build
- Se servir du script dans le fichier Jobjenkins.groovy
- Sauvegarder
- lancer le build



Source:
https://wiki.jenkins.io/display/JENKINS/Docker+Compose+Build+Step+Plugin
https://jenkinsci.github.io/job-dsl-plugin/#method/javaposse.jobdsl.dsl.helpers.step.DockerBuildAndPublishContext.registryCredentials
