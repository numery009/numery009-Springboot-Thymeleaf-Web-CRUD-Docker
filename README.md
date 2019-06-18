# Spring-Boot-Thymeleaf-Web-CRUD-Docker

This is a project of
1) SpringBoot Web
2) Thymeleaf
3) Docker

# URL
localhost:8080


# Run this project

1) Install the Docker CE.
2) Create a directory "Docker-Database" on the path /home/Docker-Database.
3) DownLoad the docker-compose.yaml file in any directory.
4) Open a terminal and go to the directory where docker-compose.yaml has saved.
5) Run the command "docker-compose up -d".
6) Inspect mysql container which ip running-- docker inspect {mysqlcontainerid} | grep IP
7) Add the IP of that mysql container to my springboot web app--
    "spring.datasource.url: jdbc:mysql://172.20.0.2:3306/employee_directory? useSSL=
    false&serverTimezone =UTC&useLegacyDatetimeCode=false"
8) run mvn clean, mvn install and build the SpringBoot Web image and push in docker-hub.
9) Run the command "docker-compose up -d" again.
6) Hit all the URL localhost:8080 in the browser.
