# Sistema Escolar

API REST desenvolvida em **Spring Boot** para gerenciamento de **Estudantes** e **Cursos**, com persistência em **MySQL** via **JPA/Hibernate**.

## Tecnologias

- Java 17
- Spring Boot 4.1.0
- Spring Data JPA
- Spring Web MVC
- MySQL Connector/J
- Maven

## Pré-requisitos

- JDK 17+
- Maven 3.9+ (ou use o wrapper `./mvnw` incluído no projeto)
- MySQL Server em execução

## Configuração do banco de dados

Crie o banco `sistemaescolar` no MySQL:

```sql
CREATE DATABASE sistemaescolar;
```

As credenciais de conexão ficam em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sistemaescolar
spring.datasource.username=root
spring.datasource.password=Mariodemario
```

> Ajuste usuário e senha conforme o seu ambiente antes de rodar o projeto. As tabelas são criadas/atualizadas automaticamente (`spring.jpa.hibernate.ddl-auto=update`).

## Como executar

```bash
# usando o wrapper do Maven
./mvnw spring-boot:run

# ou, se tiver o Maven instalado
mvn spring-boot:run
```

A aplicação sobe na porta **9090**:
`http://localhost:9090`

## Estrutura do projeto

```
src/main/java/com/mario/se
├── controller     # Controllers REST (Estudante, Curso)
├── dao            # Camada de acesso a dados (DAO)
├── model           # Entidades JPA (Estudante, Curso)
├── repository      # Repositórios Spring Data
├── service          # Regras de negócio
└── SistemaEscolarApplication.java   # Classe principal
```

## Endpoints da API

### Estudante — `/estudante`

| Método | Rota              | Descrição                  |
|--------|-------------------|-----------------------------|
| GET    | `/estudante`      | Lista todos os estudantes  |
| POST   | `/estudante`      | Cria um novo estudante      |
| PUT    | `/estudante/{id}` | Atualiza um estudante       |
| DELETE | `/estudante/{id}` | Remove um estudante         |

Exemplo de corpo (POST/PUT):
```json
{
  "nome": "Maria Silva",
  "email": "maria.silva@email.com",
  "curso": { "id": 1 }
}
```

### Curso — `/curso`

| Método | Rota           | Descrição                     |
|--------|----------------|--------------------------------|
| GET    | `/curso`       | Lista todos os cursos         |
| POST   | `/curso`       | Cria um novo curso             |
| POST   | `/curso/todos` | Cria vários cursos de uma vez |

Exemplo de corpo (POST):
```json
{
  "nome": "Engenharia de Software",
  "carga": 3600
}
```

## Modelo de dados

- **Estudante**: `nome`, `email` (único), relacionamento `ManyToOne` com `Curso`.
- **Curso**: `nome`, `carga` (carga horária), relacionamento `OneToMany` com `Estudante`.

## Licença

Projeto de estudo/uso pessoal — sem licença definida.
