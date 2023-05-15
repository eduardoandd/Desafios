package contas;

import agencia.Cliente;

public class ContaCorrente extends Conta {
        
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("Conta Corrente");
        gerarExtrato();
    }
    
}
