package iphone.smarthphone;

import iphone.internet.NavegadorInternet;
import iphone.musica.ReprodutorMusical;
import iphone.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet,  AparelhoTelefonico {

    public void tocar() {
        System.out.println("tocando via iphone...");
    }    
    public void pausar() {
        System.out.println("pausando via iphone...");
    }
    public void selecionaMusica() {
        System.out.println("selecionando via iphone...");
    }

    public void exibirPagina() {
        System.out.println("exibindo página via iphone");    
    }
    public void adicionarNovaAba() {
        System.out.println("adicionando aba via iphone");    
    }
    public void atualizarPagina() {
        System.out.println("atualizando pagina via iphone");    
    }


    public void iniciarCorreioVoz() {
        System.out.println("correio de voz pelo iphone");
    }

    public void atender(boolean atendeu) {
       if(atendeu){
            
            System.out.println("alo pelo iphone");
       }
       else{
         iniciarCorreioVoz();
       }
    }

    public void ligar() {
        System.out.println("ligar");
    }
}
