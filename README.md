<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" alt="Project logo"></a>
</p>

<h3 align="center">Api Rest com Spring Boot</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/pulls)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center"> Detalhes do Projeto.
    <br> 
</p>

## 📝 Índice

- [Sobre](#about)
- [Começando](#getting_started)
- [Uso](#usage)
- [Ferramentas usadas](#built_using)
- [Autor](#authors)


## 🧐 Sobre <a name = "about"></a>

Api Rest em Spring Boot realizada na mentoria da Avanade.

## 🏁 Começando <a name = "getting_started"></a>

Essas instruções fornecerão uma cópia do projeto instalado e funcionando em sua máquina local para fins de desenvolvimento e teste.

### Pré requisitos

```
   Java 11
   Maven
   Terminal bash
```
Realizar o clone do projeto e entrar na pasta dio_estoque_spring_boot


```
   git clone https://github.com/alex-dev2015/dio_estoque_spring_boot.git
   cd dio_estoque_spring_boot
```

Ao realizar o build do projeto o maven irá baixar as dependências, dependendo do seu editor de desenvolvimento, elas serão instaladas automaticamente.

Startar o servidor

```
   mvn spring-boot:run   
```


## 🎈 Uso <a name="usage"></a>


## Métodos
Requisições para a API devem seguir os padrões:
| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Utilizado para atualizar um registro. |
| `DELETE` | Utilizado para deletar um registro. |


# Grupo de Recursos


# Produtos [api/v1/produtos]

### Listar Produtos(Read) [GET /api/v1/produtos]


+ Response 200 (application/json)
  Todos os Produtos
  
  + Body
    ```json
    [
      {
          "codigo": 1,
          "descricao": "descricao1",
          "validade": "2021-05-12T11:01:23.931  +00:00",
          "ean": "123344",
          "inativo": true
      },
      {
          "codigo": 2,
          "descricao": "descricao2",
          "validade": "2021-05-12T11:01:23.931+00:00",
          "ean": "543210",
          "inativo": true
      }
    ]
    ```  


### Novo(create) [POST]
+ Attibutes (application/json)
  + Response 201 (application/json)
  
  + Body
    ```json
    [
      {
          "codigo": 1,
          "descricao": "descricao1",
          "validade": "2021-05-12T11:01:23.931  +00:00",
          "ean": "123344",
          "inativo": true
      },
    ]      
    ``` 
 

 ### Editar Produtos(Read) [PUT /api/v1/produtos]


+ Response 201 (application/json)
  Alteração de Produto
  
  + Body
    ```json
    [
      {
          "codigo": 1,
          "descricao": "descricao alterada",
          "validade": "2021-05-12T11:01:23.931  +00:00",
          "ean": "123344",
          "inativo": true
      },
    ]
    ```  

### Excluir produto por id(Delete) [DELETE api/v1/produtos/{id}]

+ Parameters
    + id (required, number, `1`) ... Código do Produto
    
+ Response 202 (parameter)
  Exclusão do Produto por ID.
  
    
    ```json
      {
          "Produto deletado com sucesso!"
      }
    ```    

   
## ⛏️ Ferramentas usadas <a name = "built_using"></a>

- [Visual Studio Code](https://code.visualstudio.com/) - IDE de Desenvolvimento
- [Spring Boot](https://spring.io/) - Framework
- [Insomnia](https://insomnia.rest/download) - Plataforma de consumo de API'S

## ✍️ Autor <a name = "authors"></a>

- [Página Pessoal](https://alexsousa.eti.br) - Alex Sousa
