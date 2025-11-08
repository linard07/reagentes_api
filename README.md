# Reagentes API

**Disciplina:** Domain Driven Design - Java  
**Turma:** 2ESPH  
**Professor:** Eduardo dos Santos Ramos

## Integrantes
- Guilherme Linard - RM 555768
- Lucas Vasquez - RM 555159
- Lucas Rodrigues - RM 556323
- Laura Souza - RM 556320
- Ali Andrea - RM 558052

## Execução (local)
Requisitos: Java 17+ e Maven

1. `mvn clean package`
2. `mvn spring-boot:run`
3. A API estará em `http://localhost:8080`

## Endpoints principais
- `POST /api/reagentes` — criar reagente (201)
- `GET /api/reagentes` — listar todos (200)
- `GET /api/reagentes/{id}` — buscar por id (200/404)
- `PUT /api/reagentes/{id}` — atualizar (200/404)
- `DELETE /api/reagentes/{id}` — deletar (204)


## Versão Final
Projeto funcional com Spring Boot + Maven  
Executado com sucesso em ambiente local (porta 8080)  