import java.util.Scanner;

public class ContaTerminal { public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int usuario;
        String numeroAgencia ;
        String nomeCliente ;
        double saldo;
        System.out.println("Por favor, digite o seu nome completo: ");
        nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o número da sua agência: ");
        numeroAgencia = scan.nextLine();
        System.out.println("Por favor, digite o número de usuário! ");
        usuario = scan.nextInt();
        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scan.nextDouble(); // o scanner varíavel double não está funcionando na minha máquina mas creio que o código esteja correto
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +", conta " + usuario + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}
