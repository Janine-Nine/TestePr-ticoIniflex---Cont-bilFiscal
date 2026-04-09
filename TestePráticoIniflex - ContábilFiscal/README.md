# 🚀 Teste Prático - Iniflex (Java + Spring Boot + API REST)

## 📌 Sobre o Projeto

Este projeto foi desenvolvido como parte de um teste técnico para a vaga de **Desenvolvedor de Software Júnior**.

A aplicação simula o gerenciamento de funcionários de uma indústria, aplicando regras de negócio como:

* aumento salarial
* agrupamento por função
* cálculos financeiros
* manipulação de datas

Além disso, o projeto foi estruturado seguindo boas práticas de mercado, com separação de responsabilidades e uso de arquitetura em camadas.

---

## 🧠 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Herança (`Pessoa` → `Funcionario`)
* Collections (`List`, `Map`)
* Stream API (Java moderno)
* BigDecimal (precisão financeira)
* API REST
* Arquitetura em camadas (Controller, Service, Model)
* Separação Backend + Frontend

---

## ⚙️ Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Maven
* REST API
* HTML, CSS, JavaScript (Frontend simples)
* VSCode

---

## 🧱 Estrutura do Projeto

```
teste-iniflex-api/
│
├── backend/
│   ├── controller/
│   ├── service/
│   ├── model/
│   ├── dto/
│   └── IniflexApplication.java
│
├── frontend/
│   ├── index.html
│   ├── style.css
│   └── script.js
│
├── application.properties
└── README.md
```

---

## 📊 Funcionalidades Implementadas

### ✔ Requisitos do Teste

* Inserção de funcionários (dados fixos)
* Remoção do funcionário "João"
* Impressão formatada (data e salário)
* Aplicação de aumento de 10%
* Agrupamento por função (Map)
* Listagem de funcionários por função
* Filtro de aniversariantes (Outubro e Dezembro)
* Identificação do funcionário mais velho
* Ordenação alfabética
* Soma total dos salários
* Cálculo de salários mínimos (base R$1212.00)

---

## 🌐 API REST

### ▶️ Base URL

```
http://localhost:8080/funcionarios
```

### 📡 Endpoints

| Método | Endpoint                         | Descrição                   |
| ------ | -------------------------------- | --------------------------- |
| GET    | `/funcionarios`                  | Lista todos os funcionários |
| POST   | `/funcionarios/remover-joao`     | Remove João                 |
| POST   | `/funcionarios/aumento`          | Aplica aumento de 10%       |
| GET    | `/funcionarios/agrupados`        | Agrupa por função           |
| GET    | `/funcionarios/aniversariantes`  | Filtra por mês              |
| GET    | `/funcionarios/mais-velho`       | Retorna mais velho          |
| GET    | `/funcionarios/total-salarios`   | Soma salários               |
| GET    | `/funcionarios/salarios-minimos` | Calcula equivalência        |

---

## 🖥️ Frontend

O projeto possui um frontend simples que consome a API e exibe:

* Lista de funcionários
* Atualização em tempo real após ações
* Integração via `fetch` (JavaScript puro)

---

## ▶️ Como Executar o Projeto

### 🔧 Backend (Spring Boot)

```bash
mvn spring-boot:run
```

Ou rodar a classe:

```
IniflexApplication.java
```

---

### 🌐 Frontend

1. Abra o arquivo:

```
frontend/index.html
```

2. Certifique-se que a API está rodando

---

## 🧪 Versão Console (Diferencial)

O projeto também possui uma versão executável via terminal:

```
Principal.java
```

Ela executa todos os requisitos do teste sem uso de framework, demonstrando domínio de lógica e Java puro.

---

## 💡 Diferenciais do Projeto

* Código limpo e organizado
* Uso correto de BigDecimal (evitando erros financeiros)
* Uso de Stream API (Java moderno)
* Arquitetura separada (nível profissional)
* API REST funcional
* Frontend integrado
* Versão console adicional

---

## 🚀 Possíveis Melhorias

* Integração com banco de dados (MySQL)
* Uso de JPA/Hibernate
* Validações com Bean Validation
* Testes automatizados (JUnit)
* Documentação com Swagger

---

## 👩‍💻 Desenvolvido por

Janine Cunha 🚀
Desenvolvedora Full Stack

---

## 📌 Observação

Este projeto foi desenvolvido com foco em demonstrar conhecimento técnico, organização de código e boas práticas exigidas no mercado de tecnologia.
