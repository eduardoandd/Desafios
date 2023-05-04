import java.rmi.StubNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da agência");
        int number= scanner.nextInt();

        System.out.println("Digite o código da agência");
        String agency = scanner.next();

        System.out.println("Digite o seu nome:");
        String clientName = scanner.next();

        System.out.println("Informe um saldo ");
        double balance = scanner.nextDouble();

        System.out.println("Olá " +clientName+ ", Obrigado por criar uma conta em nosso banco, sua agência é " +agency+ " conta: " +number+ " O seu saldo é: " +balance);

    }

    

}
