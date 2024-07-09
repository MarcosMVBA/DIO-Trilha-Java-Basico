package ElementosBanco;
public class ContaPoupanca extends Conta {

    public ContaPoupanca() {

        super.agencia = 25;
        super.conta = 33;
        super.saldo = 0d;
        
    }

    public void imprimirConta() {

        System.out.println("=== Conta Poupança ===");

        System.out.println(String.format("NOME: %s", super.nome));
        System.out.println(String.format("AGENCIA: %d", super.agencia));
        System.out.println(String.format("CONTA: %d", super.conta));
        System.out.println(String.format("SALDO %.2f", super.saldo));

    }

}
