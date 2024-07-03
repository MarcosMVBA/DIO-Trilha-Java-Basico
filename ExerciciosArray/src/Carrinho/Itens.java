package Carrinho;

public class Itens {
    //atributo
    
  //atributos
  private String nome;
  private double preco;
  private int quant;

//Construtor
//Eu coloco como parametro em meu construtor o nome do produto preço e quantidade
  public Itens(String nome, double preco, int quant) {
      this.nome = nome;
      this.preco = preco;
      this.quant = quant;
  }

  public String getNome() {
      return nome;
  }

  public double getPreco() {
      return preco;
  }

  public int getQuant() {
      return quant;
  }

  @Override
  public String toString() {
      return "{" +
              "nome='" + nome + '\'' +
              ", preco=" + preco +
              ", quant=" + quant +
              '}';
  }
}