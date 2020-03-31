# pokemon-type-api-msansen1  
trainer-api-msansen1 created by GitHub Classroom  

[![Generic badge](https://img.shields.io/badge/JAVA-11-GREEN.svg)](https://shields.io/)  
An api used as a microservice for the project [Pokemon GameUI](https://github.com/ALTEA-2019-2020/game-ui-msansen1)

[Demo Hosted on Heroku](https://trainer-type-msn.herokuapp.com/)  

using an addOn for postgresSQL  

# Configuration necessaire au lancement :  

|  Variable | Description  |
|:-:|:-:|
| DATABASE_HOST | Postgres Database servername |
| DATABASE_PORT | Postgres Database Port (Default 5432) |
| DATABASE_NAME | Postgres Database name |
| DATABASE_USERNAME | Postgres Database username |
| DATABASE_PASSWORD | Postgres Database password |
| SPRING_USERNAME | Basic Auth connection Username |
| SPRING_PASSWORD | Basic Auth Password |

# API disponibles  
[Swagger url](https://trainer-type-msn.herokuapp.com/swagger-ui.html)  
[JSON api-docs](https://trainer-type-msn.herokuapp.com/v2/api-docs)

## TrainerController:  
	{GET /trainers/{name}}: getTrainer(String)  
	{GET /trainers/}: getAllTrainers()  
	{POST /trainers/}: createTrainer(Trainer)  
	{PUT /trainers/}: updateTrainer(Trainer)  
	{DELETE /trainers/{name}}: deleteTrainer(String) 

# Projets liés:  
- [Git GameUI](https://github.com/ALTEA-2019-2020/game-ui-msansen1)
- [Git Pokemon Api](https://github.com/ALTEA-2019-2020/pokemon-type-api-msansen1)
- [Git Trainer Api](https://github.com/ALTEA-2019-2020/trainer-api-msansen1)
- [Git Battle Api](https://github.com/ALTEA-2019-2020/battle-api-msansen1) 