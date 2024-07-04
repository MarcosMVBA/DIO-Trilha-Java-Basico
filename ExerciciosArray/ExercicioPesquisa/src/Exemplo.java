/**
 * @autor Marcos Almeida
 *@version 1.0
 * @since 04/07/2024
 */


import java.util.List;
import java.util.ArrayList;;

public class Exemplo {


    //Atributo
    public String nome;

    //Fiz um construtor do meu atributo
    public Exemplo(String nome) {
        this.nome = nome;
    }
    //Lista do tipo String

    List<String> lista;

    //Fiz um construtor de listas
    public Exemplo() {

        this.lista = new ArrayList<>();
    }

    public void adicionarNome(String nome) {

        lista.add(new String(nome));

    }

    public void excluirNomes(String nome) {
        List<String> nomesExcluidos = new ArrayList<>();
        for (String e : lista) {
            if (e.equalsIgnoreCase(nome)) {

                nomesExcluidos.add(e);
            }

        }
        lista.removeAll(nomesExcluidos);
    }

    public void exibirNomes() {

        System.out.println(lista);
    }

    public void numeroTotalNomes() {

        System.out.println(lista.size());
    }

    public static void main(String[] args) {

        Exemplo nomes = new Exemplo();

        nomes.adicionarNome("Marcos");
        nomes.adicionarNome("Narcos");
        nomes.exibirNomes();
        nomes.numeroTotalNomes();
        nomes.excluirNomes("Narcos");
        nomes.numeroTotalNomes();
        nomes.exibirNomes();

    }

}
