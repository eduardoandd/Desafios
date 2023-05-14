package Agencia;

import banco.Banco;
import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;

public class Cliente {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente();
        ContaPoupanca poupana = new ContaPoupanca();
        Banco banco = corrente;
        corrente.sacar(50);
        corrente.depositar(100);

        System.out.println("------------------");

        banco = poupana;
        poupana.sacar(200);
        poupana.depositar(250);

    }

}
