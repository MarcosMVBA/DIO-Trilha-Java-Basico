// @author Marcos;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // Como se declara uma variavel?
        // Tipo de variavel nome da variavel = valor atribuido;

        String texto = "String texto";

        int numeroInteiro = 1;
        short numeroInteiro2 = 33;
        long NumeroInteiroLongo = 1000000000;
        float numeroComPontuacao = 10.10f;
        double numeroComPontuacao2 = 3.14;
        boolean Logica = true;

        // As vriaveis são podem ser lteradas a qualquer momento. Vou pegar o int
        // numeroInteiro como Ex:

        numeroInteiro = 2;

        // Agora o numero Inteiro passa a valer dois.

        System.out.println(numeroInteiro);

        // Caso quiser que o valor determinado não seja alterado, basta colocar o
        // "final" antes da variavel em questão. O PI por exemplo, ele vale 3,14 é um
        // valor que não muda, ficaria da seguinte forma

        final float PI = 3.14f;

        System.out.println(PI);

    }
}
