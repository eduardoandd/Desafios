package iphone.smarthphone;

import iphone.internet.NavegadorInternet;
import iphone.musica.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet {

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
}
