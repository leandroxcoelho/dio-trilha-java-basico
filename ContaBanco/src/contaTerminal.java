import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor digite o número da Conta com 4 digitos (Ex.: 1021).");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência com 3 números e o digito (Ex.: 067-8).");
        agencia = sc.nextLine();

        System.out.println("Por favor digite o nome do cliente.");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor insira o saldo.");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}