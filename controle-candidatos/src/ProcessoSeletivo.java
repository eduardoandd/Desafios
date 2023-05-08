import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.sound.sampled.SourceDataLine;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

        //selecaoDeCandidatos();
    }

    static void entrandoEmContato(String candidato){

        boolean atendeu = false;
        int tentativasRealizadas =0;
        boolean continuaTentando = true;
        

        do{
            atendeu = atender();
            continuaTentando = !atendeu;

            if(continuaTentando)
                tentativasRealizadas++;
            else{
                System.out.println("Contato realizado com sucesso");
            }

        }while(continuaTentando && tentativasRealizadas < 3);{
            if(atendeu){
                System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO(A)" +candidato+ 
                " NA" +tentativasRealizadas+ " TENTATIVA REALIZADA");
            }
            else{
                System.out.println("NÃO CONSEGUIMOS CONTATO");
            }
        }
    
    }

    //Método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecaoDeCandidatos(){
        String [] candidatos = {"EDUARDO", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO"};

        int candidatosSelecionados = 0;
        double salarioBase = 2000;
        double salarioPretendido = 0;
        int candidatoAtual = 0;

        while( candidatosSelecionados < 5 && candidatoAtual < candidatos.length ){

            salarioPretendido = valorPretendido();
            String candidato = candidatos[candidatoAtual];

            System.out.println("O candidato(a) número " +candidatoAtual+ " é " +candidato+ 
            " e tem uma pretensão salarial de: " +salarioPretendido);
            
            if(salarioPretendido <= salarioBase){
             
               System.out.println("O candidato " +candidato+ " pode ser chamdo");
               candidatosSelecionados++;
            }
            else{
                System.out.println("Ligar para negociar com o candidato");
            }

           candidatoAtual++;

        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){

        //Scanner sc = new Scanner(System.in);
        double salarioBase= 2000;

        // System.out.println("Qual seu salário pretendido?");
        // salarioPretendido = sc.nextDouble();

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}