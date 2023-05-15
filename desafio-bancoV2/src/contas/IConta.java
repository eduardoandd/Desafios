package contas;


public interface IConta {
    void sacar(double valor);
    void deposita(double valor);
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
}
