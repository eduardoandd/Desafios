package contas;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 0001;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = gerarNumeroAgencia();
    }

    
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    private int gerarNumeroAgencia(){
        return ThreadLocalRandom.current().nextInt(1329329,5474843);
    }

    protected void gerarExtrato(){
        System.out.println(String.format("Agência %d", this.agencia));
        System.out.println(String.format("Número %d", this.numero));
        System.out.println(String.format("Saldo %.2f", this.saldo));
    }
    
}
