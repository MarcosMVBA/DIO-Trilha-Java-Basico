package Escola;

public class Aluno {

    private String nome;
    private int idade;
    private  String Genero;

    // Uma estrutura Get é a seguinte: tipo de acesso, tipo de variavel, metodo acessor
    // Ex: public String getNome(){Retorna alguma coisa;}



    public String getNome() {
        return nome;
    }

    //Uma estrutura Set é quase a mesma coisa, a diferença é que você irá setar um valor
    //Ex: public void setNome(String nome){this.nome = nome;}
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero(){

            return  Genero;
    }

    public void setGenero(String Genero){
        this.Genero = Genero;

    }
    
    // arquivo Aluno.java
}