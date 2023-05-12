package iphone.telefone;

public class Telefone implements AparelhoTelefonico {


    public void iniciarCorreioVoz() {
       System.out.println("iniciando correio de voz");
    }

    public void atender(boolean atendeu) {
        atendeu = false;
       if(atendeu = false){
            iniciarCorreioVoz();
       }
       else{
        System.out.println("alo");
       }
    }
    
    public void ligar() {
       System.out.println("LIGANDO...");
    }
    
}
