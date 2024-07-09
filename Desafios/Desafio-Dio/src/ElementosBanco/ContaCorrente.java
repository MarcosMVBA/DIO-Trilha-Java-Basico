package ElementosBanco;
public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaCorrente() {

        super.agencia = 1;
        super.conta = SEQUENCIAL++;
        super.saldo = 100d;

    }

    public void imprimirConta() {
        System.out.println("=== Conta Corrente ===");

        System.out.println(String.format("NOME: %s", super.nome));
        System.out.println(String.format("AGENCIA: %d", super.agencia));
        System.out.println(String.format("CONTA: %d", super.conta));
        System.out.println(String.format("SALDO: %.2f", super.saldo));

    }

}
