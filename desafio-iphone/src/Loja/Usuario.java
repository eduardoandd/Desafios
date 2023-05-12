package Loja;

import iphone.internet.NavegadorInternet;
import iphone.musica.ReprodutorMusical;
import iphone.smarthphone.Iphone;

public class Usuario {
    public static void main(String[] args) {

       Iphone iphone = new Iphone();
       ReprodutorMusical reprodutor =  iphone;
       reprodutor.tocar();
       reprodutor.pausar();
       reprodutor.selecionaMusica();

       System.out.println("--------------------------------------");

       NavegadorInternet navegador = iphone;
       navegador.adicionarNovaAba();
       navegador.atualizarPagina();
       navegador.exibirPagina();

       System.out.println("--------------------------------------");

       
       
    }
}
