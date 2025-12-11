# Beer Stock API 🍺

API REST desenvolvida em Spring Boot para gerenciamento de estoque de cervejas, permitindo criar, listar, atualizar e deletar registros, além de calcular automaticamente o valor total baseado na quantidade e preço.

## Funcionalidades
- Cadastrar cerveja ```POST```
- Listar todas as cervejas ```GET /beer```
- Listar cerveja por ID ```GET /beer/{id}```
- Atualizar cerveja ```PUT /beer/{id}```
- Deletar cerveja ```DELETE /beer/{id}```
- Calcular o valor total ```price × quantity)``` no JSON

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL Driver
- DTO + Mapper
- Maven

## Estrutura JSON
Entrada (POST / PUT)
```
    {
        "name": "Cerveja Heineken",
        "description": "Heineken Long Neck",
        "quantity": 3,
        "price": 60
    }
```
Retorno
```
    {
        "id": 1,
        "name": "Cerveja Heineken",
        "description": "Heineken Long Neck",
        "price": 60,
        "quantity": 3,
        "totalValue": 180.00
    }
```

## Estrutura do Projeto
```
    src/
    └── main/
    └── java/com/example/beerstock
    ├── controller
    ├── service
    ├── repository
    ├── entity
    ├── dto
    └── mapper
```

## Exemplos de Endpoints

### Criar
- POST — /beer

### Listar
- GET — /beer

### Listar por ID
- GET — /beer/{id}

### Atualizar
- PUT — /beer/{id}

### Deletar
- DELETE — /beer/{id}

### Observações
- O valor totalValue é calculado automaticamente (price × quantity).
- A API utiliza DTOs e Mapper para manter o código limpo e separado da entidade.

## Autor
Projeto desenvolvido por Gabriel Conceição.