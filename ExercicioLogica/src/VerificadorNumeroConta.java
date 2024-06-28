import java.util.Scanner;

class IllegalArgumentException extends Exception {

}

public class VerificadorNumeroConta extends Exception {

    public static void main(String[] args) throws VerificadorNumeroConta {
        Scanner scanner = new Scanner(System.in);

        try {

            verificarNumeroConta(scanner.nextLine());

            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {

            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } finally {

            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {

        if (numeroConta.length() != 8) {

            throw new IllegalArgumentException();

        }
    }
}
