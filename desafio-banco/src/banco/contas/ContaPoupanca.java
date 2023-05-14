package banco.contas;

import banco.Banco;

public class ContaPoupanca implements Banco {
    private double saldo = 2000;

    public void depositar(double valor) {
        System.out.println("DEPOSITANDO PELA CONTA POUPANÇA " +(saldo+valor));
    }

    public void sacar(double valor) {
        System.out.println("SACANDO PELA CONTA POUPANÇA " +(saldo-valor));
    }
}
