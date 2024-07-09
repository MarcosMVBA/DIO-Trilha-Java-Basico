package ElementosBanco;
public class Conta {

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected String nome;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Sacar(double valor) {

        saldo -= valor;

    }

    public void depositar(double valor) {

        saldo += valor;
        

    }

    public void transferir(double valor, Conta contaDestino) {

        this.Sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirConta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirConta'");
    }

}
