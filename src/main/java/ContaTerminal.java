import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){
        Integer numeroConta;
        String agencia, nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPor favor, informe seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("\nPor favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("\nPor favor, digite o número da Agência: ");
        agencia = scanner.next();

        System.out.print("\nPor favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
    }
}