package agencia;

import contas.ContaCorrente;
import contas.ContaPoupanca;

public class AgenciaBancaria {
    public static void main(String[] args) {

        Cliente eduardo = new Cliente();
        eduardo.setNome("eduardo");
        eduardo.setIdade(21);

        ContaPoupanca cp = new ContaPoupanca(eduardo);
        ContaCorrente cc = new ContaCorrente(eduardo);

        cc.deposita(1000);
        cc.sacar(200);
        cc.transferir(200, cp);
        cc.imprimirExtrato();

        System.out.println("\n");
        
        cp.imprimirExtrato();

        

    }

    
}
