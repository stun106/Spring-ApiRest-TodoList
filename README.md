# API TodoList

Esta é uma API simples de TodoList desenvolvida com o Spring Boot. Ela consiste em dois controladores: `UserController` para gerenciar usuários e `TaskControllers` para gerenciar tarefas. Este README fornece uma visão geral do projeto e suas funcionalidades.

## Sumário

- [Endpoints](#endpoints)
- [Começando](#começando)

## Endpoints

### Controlador de Usuários

- `POST /users/create`: Crie um novo usuário.

### Controlador de Tarefas

- `POST /tasks/`: Crie uma nova tarefa.
- `GET /tasks/`: Obtenha uma lista de tarefas.
- `PUT /tasks/{id}`: Atualize uma tarefa por ID.

## Começando

Para começar com este projeto, siga estas etapas:

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-nome-de-usuario/todo-list-api.git

2. Compile e execute o projeto:
   
   ```bash
   cd todo-list-api
   ./mvnw spring-boot:run
