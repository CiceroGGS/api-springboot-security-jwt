# API com Spring Boot, Spring Security e JWT

## 📖 Sobre o Projeto
Esta é uma API RESTful desenvolvida com **Spring Boot** para demonstrar um sistema de autenticação e autorização robusto utilizando **Spring Security** e **JSON Web Tokens (JWT)**.

O projeto inclui funcionalidades essenciais como cadastro de usuários, login com geração de token e proteção de rotas baseada em papéis de usuário (roles). A persistência de dados é feita através do **Spring Data JPA** com um banco de dados **PostgreSQL**.

## ✨ Funcionalidades Principais
- **🔐 Autenticação Segura**: Geração de token JWT no login para autenticar as requisições.
- **🛡️ Autorização por Papéis (Roles)**: Controle de acesso a endpoints específicos baseado nos papéis do usuário (ADMIN, USER).
- **👤 Gestão de Usuários**: Endpoints para registrar novos usuários.
- **🔑 Validação de Token**: Filtro de segurança que valida o token JWT a cada requisição em rotas protegidas.
- **🐘 Banco de Dados PostgreSQL**: Configurado para persistir os dados dos usuários.
- **📄 Documentação com Swagger**: Interface para visualizar e testar os endpoints da API de forma interativa.

## 🛠️ Tecnologias Utilizadas
- Java 17
- Spring Boot 3
- Spring Security
- Spring Data JPA
- JSON Web Token (JWT)
- PostgreSQL
- Maven
- Lombok
- Springdoc OpenAPI (Swagger)

## ⚙️ Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina:
- **JDK 17** ou superior
- **Maven 3.8** ou superior
- **Docker** (Recomendado para rodar o PostgreSQL)
- Uma **IDE** de sua preferência (Ex: IntelliJ IDEA, VS Code)

## 🚀 Como Executar o Projeto
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/CiceroGGS/api-springboot-security-jwt.git
   cd api springboot-security-jwt
Configure o Banco de Dados (PostgreSQL):
A maneira mais fácil é usar o Docker:

docker-compose up -d
Este comando irá iniciar um container PostgreSQL com as configurações definidas no arquivo docker-compose.yml.

Alternativamente, se você tiver o PostgreSQL instalado localmente, crie um banco de dados e atualize as credenciais no arquivo src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
Instale as dependências e execute a aplicação:

mvn clean install
mvn spring-boot:run
A API estará disponível em http://localhost:8080.

📄 Documentação e Teste dos Endpoints
A API possui uma documentação interativa com Swagger UI. Após iniciar a aplicação, acesse:

URL da Documentação: http://localhost:8080/swagger-ui.html
Lá você poderá visualizar todos os endpoints, seus detalhes e testá-los diretamente pelo navegador.

Principais Endpoints
Autenticação
POST /auth/login: Autentica um usuário e retorna um token JWT.
POST /auth/register: Registra um novo usuário no sistema.
Exemplo de Rota Protegida
GET /products: Retorna uma lista de produtos. Acessível apenas para usuários autenticados.


## Projeto em andamento...
