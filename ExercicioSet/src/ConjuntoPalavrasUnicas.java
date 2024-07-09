import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private String palavra;
    


    public ConjuntoPalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    private Set<String> unicaPalavra;

    public ConjuntoPalavrasUnicas() {
        this.unicaPalavra = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {

        unicaPalavra.add(new String(palavra));

    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;

        for (String e : unicaPalavra) {

            if (e == palavra) {

                palavraParaRemover = e;
                break;
            }

        }

        unicaPalavra.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {

        return unicaPalavra.contains(palavra);

    }

    public void exibirPalavrasUnicas() {

        System.out.println(unicaPalavra);
    }


    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}