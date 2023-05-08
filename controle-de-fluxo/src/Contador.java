import java.util.Scanner;

public class Contador{
    
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    try {
        contar(n1,n2);

    } catch (ParametrosInvalidosException e) {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
  }

  static void contar(int n1, int n2) throws ParametrosInvalidosException{
    //n1 = 30;
    
    if(n1 > n2){
        throw new ParametrosInvalidosException();
    }
    else{
        for(int i =0; i <=(n2-n1); i++){
            System.out.println("Interação número: " +i);
        }
     }
  }


}