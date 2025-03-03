import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    int numero;
    String Agencia;
    String NomeCliente;
    double saldo;
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, digite o número da Agência !");
    numero = sc.nextInt();
     System.out.print("Por favor, digite o nome da Agência !");
    Agencia = sc.nextLine();
    System.out.print("Nome do Cliente");
    NomeCliente = sc.nextLine();
    System.out.print("Saldo");
    saldo = sc.nextDouble();
   
   
   
   System.out.println("Olá " + NomeCliente +
   ", obrigado por criar uma conta em nosso banco,sua agência é " + Agencia +
   ", conta " + numero +" e seu saldo R$ " + saldo + " já esta disponivel para saque.");

   sc.close();
    }
}
