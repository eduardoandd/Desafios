import java.util.concurrent.ThreadLocalRandom;

public class PraticandoWhile {
    

    public static void main(String[] args) {
        double mesada = 50.00;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            
        }
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}
