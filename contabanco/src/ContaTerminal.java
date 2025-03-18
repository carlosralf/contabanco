import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
// Entrada com as dados da conta
    System.out.println("Enter username");
    String nome = scanner.next();

// Saida dos dados
    System.out.println("Meu nome é " +nome);
    
}
