public class ExemploForArray {

    public static void main(String[] args) {

        String alunos[] = { "Marcos", "Julia", "Fernando", "Raquel", "Clara" };

        for (int x = 0; x < alunos.length; x++) {

            System.out.println("Aluno do Indice: " + x + " é " + alunos[x]);

        }

        // Senario 2

        // ExemploFor.java
        String clientes[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Forma abreviada
        for (String cliente : clientes) {
            System.out.println(cliente);
        }

    }
}
