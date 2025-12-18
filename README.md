<div align="center">

<h1 align="center">💸 DivideAí API 💸</h1>

<p align="center">
  <strong>Uma API RESTful para simplificar a divisão de despesas em grupo.</strong>
  <br />
  <br />
  <img src="https://img.shields.io/badge/Java-21+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21+">
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Boot 3.x">
  <img src="https://img.shields.io/badge/PostgreSQL-16-316192?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL 16">
  <img src="https://img.shields.io/badge/Maven-4-red?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
</p>
</div>

---

## 🎯 Sobre o Projeto

**DivideAí API** é uma solução backend completa desenvolvida com as tecnologias mais modernas do ecossistema Java e Spring. O objetivo é resolver o problema universal de gerenciar e dividir despesas em grupo, seja entre amigos, em uma viagem ou nas contas de casa.

O diferencial da aplicação é sua lógica de negócios que, além de registrar gastos, processa o **Balanço Financeiro**, calculando automaticamente as transações necessárias para que todos paguem sua parte justa.

---
## 🛠️ Tecnologias e Conceitos Aplicados

Esta API foi construída utilizando um conjunto de ferramentas e conceitos de ponta, focando em boas práticas e código limpo:

* **Linguagem:** `Java 21+`
* **Framework Principal:** `Spring Boot 3`
* **Persistência de Dados:** `Spring Data JPA` / `Hibernate`
* **Banco de Dados:** `PostgreSQL`
* **Documentação da API:** `SpringDoc OpenAPI (Swagger)`
* **Gerenciador de Dependências:** `Maven`
* **Arquitetura:** `API RESTful` em `Arquitetura de 3 Camadas` (Controller, Service, Repository)
* **Princípios:** `Injeção de Dependências`, `Inversão de Controle (IoC)`, `SOLID`, `DTO Pattern`

---

## 🚀 Como Executar o Projeto

Para executar este projeto localmente, siga os passos abaixo:

1.  **Clone o repositório:**
    ```sh
    git clone [https://github.com/gustavorodriDEV/divideai-api.git](https://github.com/gustavorodriDEV/divideai-api.git)
    ```

2.  **Configure o Banco de Dados:**
    * Crie um banco de dados no seu PostgreSQL (ex: `rachadinha_db` ou `divideai_db`).
    * Verifique o arquivo `src/main/resources/application.properties`.
    * Certifique-se de que as propriedades `spring.datasource.url`, `spring.datasource.username` e `spring.datasource.password` correspondem às suas credenciais locais.

3.  **Execute a Aplicação:**
    * Abra o projeto na sua IDE (IntelliJ IDEA).
    * Execute a classe principal `DivideAiApiApplication.java`.
    * *Ou, pelo terminal, na raiz do projeto, execute:*
        ```sh
        mvn spring-boot:run
        ```
4.  **Acesse a API:**
    * A aplicação estará rodando em `http://localhost:8080`.
    * A documentação interativa **Swagger UI** estará disponível em `http://localhost:8080/swagger-ui.html` para testar todos os endpoints.

---

## 📚 Endpoints da API

A URL base para todos os endpoints é `/api`.

### 1. Grupos (`/grupos`)

| Verbo HTTP | Endpoint               | Descrição                              |
| :--------- | :--------------------- | :------------------------------------- |
| `POST`     | `/grupos`              | Cria um novo grupo.                    |
| `GET`      | `/grupos`              | Lista todos os grupos existentes.      |
| `GET`      | `/grupos/{id}`         | Busca um grupo específico pelo seu ID. |
| `PUT`      | `/grupos/{id}`         | Atualiza um grupo existente.           |
| `DELETE`   | `/grupos/{id}`         | Deleta um grupo específico.            |

### 2. Participantes (`/participantes`)

| Verbo HTTP | Endpoint                                           | Descrição                                            |
| :--------- | :------------------------------------------------- | :--------------------------------------------------- |
| `GET`      | `/participantes`                                   | Lista todos os participantes cadastrados no sistema. |
| `POST`     | `/grupos/{idGrupo}/participantes`                  | Cria um novo participante vinculado a um grupo.      |
| `GET`      | `/grupos/{idGrupo}/participantes`                  | Lista participantes de um grupo específico.          |
| `GET`      | `/grupos/{idGrupo}/participantes/{idParticipante}` | Busca detalhes de um participante.                   |
| `PUT`      | `/grupos/{idGrupo}/participantes/{idParticipante}` | Atualiza dados de um participante.                   |
| `DELETE`   | `/grupos/{idGrupo}/participantes/{idParticipante}` | Remove um participante do grupo.                     |

### 3. Despesas (`/despesas`)

| Verbo HTTP | Endpoint                                     | Descrição                                  |
| :--------- | :------------------------------------------- | :----------------------------------------- |
| `POST`     | `/grupos/{idGrupo}/despesas`                 | Adiciona uma nova despesa ao grupo.        |
| `GET`      | `/grupos/{idGrupo}/despesas`                 | Lista todas as despesas do grupo.          |
| `GET`      | `/grupos/{idGrupo}/despesas/{idDespesa}`     | Busca detalhes de uma despesa específica.  |
| `PUT`      | `/grupos/{idGrupo}/despesas/{idDespesa}`     | Atualiza valor ou descrição de uma despesa.|
| `DELETE`   | `/grupos/{idGrupo}/despesas/{idDespesa}`     | Remove uma despesa lançada.                |

### 4. Balanço (`/balanco`)

| Verbo HTTP | Endpoint                        | Descrição |
| :--------- | :------------------------------ | :-------- |
| `GET`      | `/grupos/{idGrupo}/balanco`     | **Calcula a divisão de contas.** Retorna quem deve pagar quem para quitar as dívidas do grupo. |

---
<div align="center">
  Desenvolvido por <strong>Gustavo Rodrigues</strong>.
</div>