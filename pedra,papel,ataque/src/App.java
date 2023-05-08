import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String jogador1,jogador2;

        jogador1= sc.next();
        jogador2= sc.next();

        if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("Pedra")){
            System.out.println("Jogador 1 venceu");

           
        }

        if(jogador1.equalsIgnoreCase("Pedra") && jogador2.equalsIgnoreCase("ataque")){
            System.out.println("Jogador 2 venceu");
        }
        else if(jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")){
            System.out.println("jogador 1 ganhou");
        }
        else if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")){
            System.out.println("jogador 1 ganhou");
        }
        else if(jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")){
            System.out.println("ambos ganharam");
        }
        else if(jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")){
            System.out.println("ambos perderam");
        }
        else if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")){
            System.out.println("ataque");
        }

    }
}
