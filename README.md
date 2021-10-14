# Code Blog

![java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![postgres](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Heroku](https://img.shields.io/badge/Heroku-430098?style=for-the-badge&logo=heroku&logoColor=white)

<img src="https://i.ibb.co/ByvmG4B/Captura-de-tela-de-2021-10-14-10-05-30.jpg" alt="exemplo imagem">

> Criado com proposito de documentar minhas experiencias com programação, o code blog foi feito tambem para fins de aprendizado sobre as tecnologias usadas no densevolvimento de aplicativos usando springboot

[Link do projeto no Heroku](https://daniel-code-blog.herokuapp.com/posts)

### Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

- [x] Criar posts
- [x] Ler posts
- [x] Deletar posts
- [x] Login com spring Security
- [ ] Delete aparece apenas para logados
- [ ] Ordenação de posts

## ⚙️ Tecnologias usadas

- [ Maven](https://maven.apache.org/guides/index.html)
- [Spring Boot](https://docs.spring.io/spring-boot/docs/2.5.5/)
- [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-jpa-and-spring-data)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-developing-web-applications)
- [Spring Security](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-security)
- [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
- [Bootstrap](https://getbootstrap.com/docs/5.1/getting-started/introduction/)

- [Postgres](https://www.postgresql.org/docs/)

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- [Java JDK](https://www.oracle.com/java/technologies/downloads/)
- [IntelliJ](https://www.jetbrains.com/pt-br/idea/download/#section=linux) (Opicional)

Configure as variaves de ambiente

```properties
DB_URL = <url do banco de dados>
DB_USER= <usuario>
DB_PASSWORD= <senha>
LG_USER = <usuario para postar>
LG_PASSWORD = <senha do usuario>
```

## 🚀 Iniciando o blog localmente

### Para iniciar o projeto, siga estas etapas:

Via IntelliJ:

```
Apenas importe o projeto e inicie pelo maven
```

Via CLI:

```sh
java -jar ./target/Code-Blog-0.0.1-SNAPSHOT.jar
```

## 🔧 Endpoints da aplicação:

### Para Ler todos, ou apenas um passando id.

```
http://localhost:8080/posts
http://localhost:8080/posts/{id}
```

### Para criar um novo post

```
http://localhost:8080/newpost
```

### Para deletar um post por id

```
http://localhost:8080/deletepost/{id}
```

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="github.com/danielnatham">
        <img src="https://avatars.githubusercontent.com/u/68167359?v=4" width="100px;" alt="Foto do Iuri Silva no GitHub"/
        <sub>
          <b>Daniel Nathan</b>
        </sub>
      </a>
    </td>

  </tr>
</table>

[⬆ Voltar ao topo](#nome-do-projeto
