# Boas-vindas a API People Manager!
 - Uma API para gerenciamento de pessoas e seus endereços.
 - Rota para criação de pessoa e endereço
 - Rota para listar pessoas e endereços
 - Rota para consultar uma pessoa e um endereço pelo id
 - Rota para editar uma pessoa e um endereço pelo id
 - Rota para remover uma pessoa e um endereço pelo id

## Ferramentas e bibliotecas utilizadas

- ![Java Badge](https://img.shields.io/badge/-Java-black?style=flat-square&logo=java)
- ![Spring Badge](https://img.shields.io/badge/-Spring-black?style=flat-square&logo=spring)
- ![Springfox Badge](https://img.shields.io/badge/-Springfox-black?style=flat-square&logo=springfox)
- ![JPA Badge](https://img.shields.io/badge/-JPA-black?style=flat-square&logo=jpa)
- ![H2database Badge](https://img.shields.io/badge/-H2database-black?style=flat-square&logo=H2database)
- ![Lombok Badge](https://img.shields.io/badge/-Lombok-black?style=flat-square&logo=lombok)
- ![Modelmapper Badge](https://img.shields.io/badge/-Modelmapper-black?style=flat-square&logo=modelmapper)
- ![Swagger Badge](https://img.shields.io/badge/-Swagger-black?style=flat-square&logo=Swagger)

## Features

- [x] Criação de pessoas e endereços
- [x] Lista de pessoas e endereços
- [x] Consulta de uma pessoa e um endereço
- [x] Edição de pessoas e endereços
- [x] Remoção de pessoas e endereços
- [ ] Relacionar o campo addressId com o ID de endereço
- [ ] Cadastrar mais de um endereço por pessoa
- [ ] Poder informar qual endereço é o principal da pessoa
- [ ] Separar sequencia do ID de endereço e pessoa
- [ ] Documentar API com swagger
- [ ] Frontend para consumir os end-points
- [ ] Testes unitários
- [ ] Testes de integração

## Pré-requisitos para rodar a aplicação

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas: [![Git Badge](https://img.shields.io/badge/-Git-black?style=flat-square&logo=git)](https://git-scm.com) [![Java Badge](https://img.shields.io/badge/-Java-black?style=flat-square&logo=JAVA)](https://www.java.com/pt-BR/)

- Clone o repositório
~~~Java
git@github.com:DeividBorges93/CRUD-java.git
~~~

- Abra o arquivo pom.xml com sua IDE
~~~Java
cd CRUD-java
~~~

- Dentro da IDE entre na pasta java
~~~Java
caminho: CRUD-java/src/main/java
~~~

- Rode o arquivo:
~~~Java
PeopleManagerAplication.java
~~~

## End points People

- POST - Cadastro de pessoa
> http://localhost:8080/people
~~~Java
Corpo da requisição:

{
"name": "Deivid Borges",
"birthDate": "21/05/1993",
"addressId": "1"
}
~~~
~~~Java
Resposta da requisição:

{
  "id": 1,
  "name": "Deivid Borges",
  "birthDate": "21/05/1993",
  "addressId": "1"  
}
~~~

- POST - Cadastro de endereço
> http://localhost:8080/address
~~~Java
Corpo da requisição:

{
  "publicPlace": "R. Jacob Weingartner",
  "zipCode": "88131400",
  "number": "4619",
  "city": "Palhoça"
}
~~~
~~~Java
Resposta da requisição:

{
  "id": 1,
  "publicPlace": "R. Jacob Weingartner",
  "zipCode": "88131400",
  "number": "4619",
  "city": "Palhoça"
}
~~~

GET - Lista de pessoas
> http://localhost:8080/people
~~~Java
Resposta da requisição:

[
  {
  "id": 1,
  "name": "Deivid Borges",
  "birthDate": "21/05/1993",
  "addressId": "1"  
  },
  {
  "id": 2,
  "name": "Deivid Machado",
  "birthDate": "21/05/1993",
  "addressId": "1"    
  }
]
~~~

GET - Lista de endereços
> http://localhost:8080/address
~~~Java
Resposta da requisição:

[
  {
  "id": 1,
  "publicPlace": "R. Jacob Weingartner",
  "zipCode": "88131400",
  "number": "4619",
  "city": "Palhoça"
  }
]
~~~

- PUT - Edição de pessoa pelo id
> http://localhost:8080/people/1
~~~Java
Corpo da requisição:

{
"name": "Deivid Machado Borges",
}
~~~
~~~Java
Resposta da requisição:

{
  "id": 1,
  "name": "Deivid Machado Borges",
  "birthDate": "21/05/1993",
  "addressId": "1"  
}
~~~

- PUT - Cadastro de endereço
> http://localhost:8080/address/1
~~~Java
Corpo da requisição:

{
  "publicPlace": "Rua Jacob Weingartner",
  "zipCode": "88131-400",
  "city": "PH"
}
~~~
~~~Java
Resposta da requisição:

{
  "id": 1,
  "publicPlace": "Rua Jacob Weingartner",
  "zipCode": "88131-400",
  "number": "4619",
  "city": "PH"
}
~~~

- DELETE - Remoção de pessoa pelo ID
> http://localhost:8080/people/1

- DELETE - Remoção de endereço pelo ID
> http://localhost:8080/address/1


## Considerações do projeto

- Foi o primeiro contato com JAVA, de cara da de perceber que é uma linguagem bem complexa no sentido de tudo precisar de uma importação de algo, nesse ponto achei a IDE essencial.
- Porém é uma linguagem muito inteligente juntamente com a IDE e foi consideravelmente fácil fazer esse CRUD considerando que nunca tinha tido contato com JAVA. Claro também que não fiz tudo sozinho, foram longos vídeos tutoriais e 4 dias estudando a JAVA para depois aplicar os estudos ainda tendo que rever várias coisas.
- Tenho muito a aprender sobre java mas com certeza é uma linguagem muito boa de trabalhar.
