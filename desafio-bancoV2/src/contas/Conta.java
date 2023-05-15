package contas;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import agencia.Cliente;

public abstract class Conta implements IConta {

    protected double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected List<Conta> contas;

    public Conta(Cliente cliente) {
        this.saldo = saldo;
        this.agencia = 001;
        this.numero = gerarNumeroAgencia();
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo-=valor;
    }

    public void deposita(double valor) {
        saldo+=valor;
    }

    public void transferir(double valor, IConta contaDestino) {
        sacar(valor);
        contaDestino.deposita(valor);
    }

    private int gerarNumeroAgencia(){
        return ThreadLocalRandom.current().nextInt(1329329,5474843);
    }

    protected void gerarExtrato(){
        System.out.println(String.format("Nome %s", this.cliente.getNome()));
        System.out.println(String.format("Agência %d", this.agencia));
        System.out.println(String.format("Número %d", this.numero));
        System.out.println(String.format("Saldo %.2f", this.saldo));
    }
}
