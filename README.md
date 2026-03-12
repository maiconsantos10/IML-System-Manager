# IML System Manager

Sistema administrativo desenvolvido em **Java** com **Java Swing** para gerenciamento de atividades de um Instituto Médico Legal (IML).

O projeto tem como objetivo praticar conceitos fundamentais de desenvolvimento **backend com Java**, incluindo:

* Programação Orientada a Objetos
* Estruturação de sistemas
* Interfaces gráficas com Java Swing
* Manipulação de dados em memória
* Persistência de dados com banco de dados (fase futura)

Este projeto também faz parte do meu processo de aprendizado e evolução como desenvolvedor Java.

---

# 📚 Objetivo do Projeto

Criar um sistema administrativo capaz de gerenciar informações relacionadas a:

* Registro de corpos recebidos pelo IML
* Controle de casos
* Médicos responsáveis pelas análises
* Status das autópsias
* Registro e consulta de dados

O sistema começa utilizando **estruturas em memória (ArrayList)** e posteriormente evolui para **persistência em banco de dados utilizando JDBC e H2 Database**.

---

# 🧠 Conceitos Aplicados

Durante o desenvolvimento serão utilizados diversos conceitos importantes da linguagem Java:

* Classes e Objetos
* Encapsulamento
* Herança
* Organização em pacotes
* Separação de responsabilidades
* Arquitetura em camadas
* Interfaces gráficas com Swing
* JDBC
* SQL

---

# 🏗 Estrutura do Projeto

```
IML_System_Manager
│
├── src
│
├── entities
│     Funcionario.java
│     Medico.java
│     Corpo.java
│     Caso.java
│
├── service
│     CasoService.java
│
├── ui
│     MainFrame.java
│     CadastroCorpoFrame.java
│
├── main
│     Main.java
│
└── database (fase futura)
```

Cada pacote possui uma responsabilidade específica dentro do sistema.

---

# 🧩 Entidades do Sistema

### Funcionário

Representa qualquer funcionário do instituto.

Atributos iniciais:

* id
* nome
* cargo

---

### Médico Legista

Especialização de funcionário responsável pelas análises.

Atributos:

* nome
* CRM
* especialidade

---

### Corpo

Representa um corpo recebido pelo instituto.

Atributos:

* id
* nome
* causa da morte
* status

Status possíveis:

* RECEBIDO
* EM_ANALISE
* FINALIZADO
* LIBERADO

---

### Caso

Representa um caso investigativo relacionado a um corpo.

Atributos:

* número do caso
* corpo associado
* médico responsável
* status do caso

---

# 🖥 Interface Gráfica

O sistema utiliza **Java Swing** para criar uma interface gráfica simples e funcional.

Interface inicial:

```
Sistema IML

[ Registrar Corpo ]
[ Ver Casos ]
[ Médicos ]
```

As telas serão divididas em:

* Tela principal
* Tela de cadastro
* Tela de consulta de casos
* Tela de gerenciamento de médicos

---

# 🔄 Fluxo Inicial do Sistema

Fluxo da primeira versão do sistema:

1. Usuário abre o sistema
2. Acessa o menu principal
3. Registra um corpo
4. O sistema cria um objeto `Corpo`
5. Um `Caso` é associado
6. O caso é armazenado em memória usando `ArrayList`

---

# 💾 Persistência de Dados (Fase 2)

Após a implementação inicial do sistema, será adicionado suporte a banco de dados utilizando:

* JDBC
* H2 Database

Isso permitirá:

* salvar casos no banco
* consultar registros
* atualizar status
* manter histórico de dados

---

# 🚀 Evolução do Projeto

Roadmap planejado para o desenvolvimento:

### Versão 1

Sistema funcional com dados em memória.

Funcionalidades:

* cadastrar corpos
* listar casos
* alterar status

---

### Versão 2

Persistência em banco de dados.

Implementações:

* JDBC
* H2 Database
* criação de tabelas
* armazenamento permanente

---

### Versão 3

Melhorias na interface.

Possibilidades:

* tabelas com JTable
* filtros de busca
* melhorias visuais

---

# 🛠 Tecnologias Utilizadas

* Java
* Java Swing
* JDBC
* H2 Database (futuro)
* Eclipse IDE
* Git
* GitHub

---

# 📌 Objetivo Educacional

Este projeto faz parte de um processo de aprendizado prático, com foco em:

* desenvolvimento backend
* boas práticas de organização de código
* construção de projetos reais para portfólio

---

# 👨‍💻 Autor

Maicon Emanuel
Desenvolvedor em formação focado em **Java Backend**.

GitHub:
https://github.com/maiconsantos10
