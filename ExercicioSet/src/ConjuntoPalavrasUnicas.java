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

    private Set <String> unicaPalavra;

    public ConjuntoPalavrasUnicas() {
        this.unicaPalavra = new HashSet<>();
    }
    
    public void adicionarPalavra(String palavra){

        unicaPalavra.add(new String(palavra));

    }
    
    public static void main(String[] args) {
        
         lista = new ConjuntoPalavrasUnicas();
    }
}
