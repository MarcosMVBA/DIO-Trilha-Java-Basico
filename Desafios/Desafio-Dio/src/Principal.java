import ElementosBanco.Conta;
import ElementosBanco.ContaCorrente;
import ElementosBanco.ContaPoupanca;

/** 
 * <h3> Classe Principal</h3>
 * 
 * @autor Marcos Almeida
 * 
 * @version 1.0
 * 
 * @sice 09/07/2024
 *
 * <p>
 * 
 * <b>Note: </b> Os demais elementos(classe), estão no pacote "ElementosBanco"
 */


 // Programa simples de como fucina uma conta bancaria
public class Principal {

    public static void main(String[] args) {
        // cc Conta corrente
        Conta cc = new ContaCorrente();
        // cp Conta poupança
        Conta cp = new ContaPoupanca();

        cc.setNome("Marcos");

        cc.imprimirConta();

        cp.setNome("Almeida");
        cp.imprimirConta();

    }

}
