// Conta.java
public abstract class Conta {
    protected int numero;
    protected String titular;
    protected double saldo;

    public Conta(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Encapsulamento: getters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método de depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: valor de depósito inválido.");
        }
    }

    // Método de saque
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: saldo insuficiente ou valor inválido.");
        }
    }

    // Método de transferência entre contas
    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para " + destino.getTitular() + " realizada com sucesso!");
        } else {
            System.out.println("Erro: transferência não realizada.");
        }
    }

    // Exibir saldo
    public void exibirSaldo() {
        System.out.println("Conta #" + numero + " - Titular: " + titular + " - Saldo: R$" + saldo);
    }
}
