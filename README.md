# Concessionária - Back-end

API REST desenvolvida em Java com Spring Boot.

## Executar

1. Instale o Java e o Maven.
2. Configure o PostgreSQL conforme `src/main/resources/application.properties`.
3. No terminal, entre nesta pasta.
4. Execute `mvn spring-boot:run`.

A API será disponibilizada em `http://localhost:8080`.

## Endpoint de clientes

`http://localhost:8080/api/clientes`

O CORS está configurado para permitir o Front-end Angular em `http://localhost:4200`.
