# 🏦 Banco Digital em Java - Orientação a Objetos

## Descrição

Este projeto implementa um **Banco Digital** utilizando os conceitos de **Programação Orientada a Objetos (OOP)** em Java.  

O sistema modela **contas bancárias** que permitem:  

- Depósitos  
- Saques  
- Transferências entre contas da mesma instituição  

Os principais conceitos de OOP aplicados são: **Abstração, Encapsulamento, Herança e Polimorfismo**.

---

## Estrutura do Projeto

O projeto contém as seguintes classes:

| Classe               | Descrição |
|----------------------|-----------|
| `Conta.java`         | Classe abstrata que representa uma conta bancária genérica, contendo atributos e métodos comuns a todas as contas. |
| `ContaCorrente.java` | Herda de `Conta` e representa uma conta corrente, podendo ter comportamentos específicos. |
| `ContaPoupanca.java` | Herda de `Conta` e representa uma conta poupança, podendo ter comportamentos específicos. |
| `Main.java`          | Classe principal que instancia contas, realiza operações e exibe saldos. |

---

## Conceitos de OOP Aplicados

- **Abstração:** `Conta` abstrai os comportamentos essenciais de uma conta bancária.  
- **Encapsulamento:** Atributos são protegidos, com acesso controlado via métodos (`getters`, `depositar`, `sacar`, `transferir`).  
- **Herança:** `ContaCorrente` e `ContaPoupanca` reutilizam funcionalidades da classe base `Conta`.  
- **Polimorfismo:** Objetos de diferentes tipos de contas podem ser tratados como instâncias da classe genérica `Conta`.

---

## Como Executar

### 1️⃣ Organizar os arquivos

Coloque todos os arquivos em uma mesma pasta:

BancoDigital/
├─ Conta.java
├─ ContaCorrente.java
├─ ContaPoupanca.java
└─ Main.java

yaml
Copiar
Editar

---

### 2️⃣ Compilar

Abra o terminal na pasta do projeto e execute:

``javac *.java``

### 3️⃣ Executar

java Main

O programa exibirá no console todas as operações realizadas e os saldos das contas.

### Observações
Projeto serve como exemplo de encapsulamento e polimorfismo em Java.

É possível estender com novas funcionalidades, como:

Juros para poupança

Limite para conta corrente

Interface gráfica para interação do usuário

O projeto serve como exemplo de encapsulamento e polimorfismo em Java.

É possível estender o projeto adicionando novas funcionalidades, como juros para poupança, limite para conta corrente, ou interface gráfica. 
