import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "102345-6";
        conta1.titular = "Ana Souza";
        conta1.saldo = 3450;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numeroConta = "204578-9";
        conta2.titular = "Bruno Lima";
        conta2.saldo = 7820;

        System.out.println("\n--- Operações Conta 1 ---");
        conta1.consultarSaldo();

        System.out.print("Digite o valor para depositar na Conta 1: ");
        double deposito1 = sc.nextDouble();
        conta1.depositar(deposito1);

        System.out.print("Digite o valor para sacar da Conta 1: ");
        double saque1 = sc.nextDouble();
        conta1.sacar(saque1);

        conta1.consultarSaldo();

        System.out.println("\n--- Operações Conta 2 ---");
        conta2.consultarSaldo();

        System.out.print("Digite o valor para depositar na Conta 2: ");
        double deposito2 = sc.nextDouble();
        conta2.depositar(deposito2);

        System.out.print("Digite o valor para sacar da Conta 2: ");
        double saque2 = sc.nextDouble();
        conta2.sacar(saque2);

        conta2.consultarSaldo();

        sc.close();
    }
}
