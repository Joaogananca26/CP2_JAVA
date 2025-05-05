# CP2_JAVA
Este repositório é direcionado ao CheckPoint 2 da matéria Java Advanced na FIAP

# 🧸 API de Cadastro de Brinquedos

Este projeto consiste no desenvolvimento de uma API RESTful para o cadastro e consulta de brinquedos destinados a crianças de até 14 anos. A aplicação foi construída utilizando o framework **Spring Boot** com **Maven**, linguagem **Java** e banco de dados **Oracle SQL Developer**.

---

## 📌 Objetivo

Permitir a **inserção (Create)** e **consulta (Read)** de brinquedos utilizando requisições HTTP via **Postman**, com persistência dos dados em um banco Oracle e retorno das informações em formato **JSON**.

---

## 🛠️ Tecnologias Utilizadas

- Java
- Spring Wed
- Spring Boot DevTools
- Validation
- Spring Data JPA
- Oracle SQL Developer
- Postman

---

## 🗃️ Estrutura da Tabela no Oracle


| Campo         | Tipo de Dado         | Descrição                        |
|---------------|----------------------|----------------------------------|
| ID            | NUMBER               | Identificador único              |
| NOME          | VARCHAR2(100)        | Nome do brinquedo                |
| TIPO          | VARCHAR2(50)         | Tipo do brinquedo                |
| CLASSIFICACAO | VARCHAR2(10)         | Classificação etária             |
| TAMANHO       | VARCHAR2(20)         | Tamanho (Pequeno, Médio, Grande) |
| PRECO         | NUMBER(10,2)         | Preço do brinquedo               |

---

## ⚙️ Configuração de Conexão - `application.properties`

spring.datasource.url=jdbc:oracle:thin:@//oracle.fiap.com.br:1521/ORCL

spring.datasource.username=RM554728

spring.datasource.password=fiap25

spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver

spring.jpa.database-platform=org.hibernate.dialect.OracleDialect

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true

## Testes com Postman

### Inserção via POST:

Utilize o método POST no endpoint /brinquedos com o JSON de exemplo acima para cadastrar um novo brinquedo.

Verifique a resposta para confirmar o sucesso da operação.

### Consulta via GET:

Utilize o método GET no endpoint /brinquedos para listar todos os brinquedos cadastrados.

Verifique se o brinquedo recém-cadastrado aparece na lista.

## configuração final do Spring **Initializr**
![image](https://github.com/user-attachments/assets/c1603417-ab43-4953-ac79-d9c5192c4815)

