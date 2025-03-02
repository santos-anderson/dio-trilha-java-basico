import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Digite o Numero da Conta: ");
        numero = sc.nextInt();


        sc.nextLine();

        System.out.print("Digite o agencia da Conta: ");
        agencia = sc.nextLine();

        System.out.print("Digite o nome do Cliente: ");
        nomeCliente = sc.nextLine();


        System.out.print("Digite o saldo do Cliente: ");
        String saldoStr = sc.nextLine();
        saldoStr = saldoStr.replace(",", ".");
        saldo = Double.parseDouble(saldoStr);

        sc.close();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

