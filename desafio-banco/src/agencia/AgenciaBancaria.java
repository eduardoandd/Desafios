package agencia;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class AgenciaBancaria  {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(50, cp);
        
        cp.depositar(2323823.3282);

        
        cc.imprimirExtrato();
        System.out.println("\n");
        cp.imprimirExtrato();
    }
}
