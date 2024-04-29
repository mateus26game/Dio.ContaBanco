import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("-------------------------------------------------");

        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = entrada.nextLine();

        System.out.println("-------------------------------------------------");
        System.out.println("Por favor, digite o nome da Agência !");
        String nome = entrada.nextLine();
        System.out.println("-------------------------------------------------");

        System.out.println("Por favor, digite o número da Agência !");
        int Numero = entrada.nextInt();

        System.out.println("-------------------------------------------------");

        System.out.println("Por favor, digite o seu saldo !");
        double Saldo= entrada.nextDouble();

        System.out.println("-------------------------------------------------");


        System.out.println("Olá "+nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +nome+",\nconta "+ Numero +" e seu saldo "+Saldo +" já está disponível para saque");

    }
}