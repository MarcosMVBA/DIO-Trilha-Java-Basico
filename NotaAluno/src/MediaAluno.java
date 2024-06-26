//@autor Marcos Almeida

public class MediaAluno {

    public static void main(String[] args) {

        int nota1, nota2, nota3, nota4, media;

        nota1 = 5;
        nota2 = 5;
        nota3 = 5;
        nota4 = 5;
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {

            System.out.println("Sua média é: " + media + ", APROVADO!!");
        } else if (media <= 4) {

            System.out.println("Sua média é: " + media + ", Reprovado");
        } else {
            System.out.println("Sua média é: " + media + ", Recuperação");
        }

    }
}
