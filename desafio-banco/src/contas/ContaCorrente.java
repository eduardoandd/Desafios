package contas;

public class ContaCorrente extends Conta {

    
    public void imprimirExtrato() {
        System.out.println("------- CONTA CORRENTE --------");
        gerarExtrato();
    }

    
}
