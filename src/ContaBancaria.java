import java.util.Scanner;

public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;


    public void consultarSaldo() {
        System.out.println("Conta: " + numeroConta + " | Titular: " + titular + " | Saldo atual: R$" + saldo);
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }


    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }
}
