
import Telefone.Iphone;

public class User {

    public static void main(String[] args) {

        System.out.println("Abrindo App de Musica:");

        Iphone iphone = new Iphone();
        System.out.println(" ");

        iphone.SelecionarMusica("SICKO MODE");
        iphone.Tocar();
        iphone.Puasar();

        System.out.println(" ");
        System.out.println("Abrindo Telefone: ");
        System.out.println(" ");

        iphone.Atender();
        iphone.Ligar("Steve Jobs");
        iphone.iniciarCorreioVoz();

        System.out.println(" ");
        System.out.println("Abrindo Safari: ");
        System.out.println(" ");

        iphone.AdicionarNovaAba();
        iphone.AtualizarPagina();
        iphone.ExibirPagina("YouTube.com");
        System.out.println(" ");

    }

}
