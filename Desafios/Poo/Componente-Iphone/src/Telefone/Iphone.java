package Telefone;
import Aplicativos.AparelhoTelefonico;
import Aplicativos.NavegadorIternet;
import Aplicativos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorIternet, ReprodutorMusical {

    @Override
    public void Atender() {
        System.out.println("Atendendo chamada");        
    }

    @Override
    public String Ligar(String numero) {

        System.out.println("Ligando para: " + numero);
        return numero;
       
    }

    @Override
    public void iniciarCorreioVoz() {
        
        System.out.println("Escutando o Correio de Voz...");
        
    }

    @Override
    public void AdicionarNovaAba() {

        System.out.println("Adicionando nova Aba");
     
    }

    @Override
    public void AtualizarPagina() {

        System.out.println("Atuzalizando Pagina...");
       
        
    }

    @Override
    public String ExibirPagina(String url) {
        System.out.println("Exibindo Pagina: " + url);
        return url;
      
    }

    @Override
    public void Puasar() {
      System.out.println("Pausando Musica");
    }

    @Override
    public String SelecionarMusica(String Musica) {
      System.out.println("Selecionando a Musica: " + Musica);
    return Musica;

    }

    @Override
    public void Tocar() {  

        System.out.println("Tocando Musica");
    
    }


    
}
