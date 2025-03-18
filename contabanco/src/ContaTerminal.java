import java.util.Scanner;

public class ContaTerminal {
 
    /**
     * @param args
     */
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Entrada com as dados da conta
    System.out.println("Digite sua Agencia");
    Integer Agencia = scanner.nextInt();

    System.out.println("Digite sua conta");
    String Conta = scanner.next();

    System.out.println("Digite seu Nome");
    String nome = scanner.next();

    System.out.println("Digite seu Saldo");
    final float Saldo = scanner.nextFloat();

    // Saida dos dados
        System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")+Agencia +", conta ".concat(Conta).concat(" e seu saldo é: ")+Saldo +" já está disponível para saque");
        }
}