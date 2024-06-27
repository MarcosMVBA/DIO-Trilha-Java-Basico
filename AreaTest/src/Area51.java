public class Area51 {
    public static void main(String[] args){

        // Irei utilizar os exemplos em métodos;

        Metodofor();
        MetodoForArray();
        MetodoFotEach();
       

    }

    
    


    private static void MetodoFotEach() {
        
        // ExemploFor.java
       String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada
        for(String aluno : alunos) {
            
          System.out.println(alunos);
        }
    
    
    

    }

    private static void MetodoForArray() {
    
        String alunos[] = {"Marcos", "Monique", "Rafael"};

        for(int x=0; x<alunos.length; x++){

            System.out.println(alunos[x]);


        }

    }

    private static void Metodofor() {

        // estrutura do controle de fluxo for

        // for (bloco de inicialização; expressão booleana de validação; bloco de
        // atualização)

        // comando que será executado até que a
        // expressão de validação torne-se falsa

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {

            System.out.println("Contando carneirinhos " + carneirinhos);

            System.out.println(" ");

        }


    }
}
