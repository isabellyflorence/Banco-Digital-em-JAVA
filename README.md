Banco Digital em Java - Orientação a Objetos
Descrição

Este projeto é uma implementação de um Banco Digital utilizando os conceitos de Programação Orientada a Objetos (OOP) em Java.

O sistema modela contas bancárias que permitem realizar:

Depósitos

Saques

Transferências entre contas da mesma instituição

Foram aplicados os principais conceitos de OOP: abstração, encapsulamento, herança e polimorfismo.

Estrutura do Projeto

O projeto contém as seguintes classes:

Conta.java:
Classe abstrata que representa uma conta bancária genérica. Contém atributos e métodos comuns a todas as contas.

ContaCorrente.java:
Classe que herda de Conta e representa uma conta corrente. Pode ter comportamentos específicos da conta corrente.

ContaPoupanca.java:
Classe que herda de Conta e representa uma conta poupança. Pode ter comportamentos específicos da poupança.

Main.java:
Classe principal que instancia contas, realiza operações de depósito, saque e transferência, e exibe os saldos das contas.

Conceitos de OOP Aplicados

Abstração: Conta abstrai os comportamentos essenciais de uma conta bancária.

Encapsulamento: Atributos da classe são protegidos, com acesso controlado via métodos.

Herança: ContaCorrente e ContaPoupanca reutilizam funcionalidades da classe base Conta.

Polimorfismo: Objetos de contas diferentes podem ser tratados como instâncias da classe genérica Conta.

Como Executar
Passo 1: Organizar arquivos

Coloque os arquivos do projeto em uma mesma pasta:

BancoDigital/
├─ Conta.java
├─ ContaCorrente.java
├─ ContaPoupanca.java
└─ Main.java

Passo 2: Compilar

Abra o terminal na pasta do projeto e execute:

javac *.java

Passo 3: Executar

Depois de compilado, execute o programa:

java Main


O programa exibirá no console as operações realizadas e os saldos das contas.

Exemplo de Saída
Conta #101 - Titular: João Silva - Saldo: R$1000.0
Conta #202 - Titular: Maria Souza - Saldo: R$500.0
Depósito de R$200.0 realizado com sucesso!
Depósito de R$150.0 realizado com sucesso!
Saque de R$50.0 realizado com sucesso!
Saque de R$100.0 realizado com sucesso!
Saque de R$300.0 realizado com sucesso!
Depósito de R$300.0 realizado com sucesso!
Transferência de R$300.0 para Maria Souza realizada com sucesso!
Conta #101 - Titular: João Silva - Saldo: R$850.0
Conta #202 - Titular: Maria Souza - Saldo: R$850.0

Observações

O projeto serve como exemplo de encapsulamento e polimorfismo em Java.

É possível estender o projeto adicionando novas funcionalidades, como juros para poupança, limite para conta corrente, ou interface gráfica. 
