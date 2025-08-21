// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando contas
        Conta conta1 = new ContaCorrente(101, "João Silva", 1000.0);
        Conta conta2 = new ContaPoupanca(202, "Maria Souza", 500.0);

        // Exibir saldo inicial
        conta1.exibirSaldo();
        conta2.exibirSaldo();

        // Depósito
        conta1.depositar(200);
        conta2.depositar(150);

        // Saque
        conta1.sacar(50);
        conta2.sacar(100);

        // Transferência
        conta1.transferir(300, conta2);

        // Exibir saldo final
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
