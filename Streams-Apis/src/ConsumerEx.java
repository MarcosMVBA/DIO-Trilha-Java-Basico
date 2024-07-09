
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx{

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Consumer<Integer> imprimeNumeroPar = numero -> {
            if (numero % 2 == 0) {

                System.out.println(numero);
            }

        };

        numeros.forEach(t -> {
            // TODO Auto-generated method stub
            if (t % 2 == 0) {

                System.out.println(t);

            }
        }

        );

    }

}
