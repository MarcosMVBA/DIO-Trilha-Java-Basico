public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("Tv ligada ? " + smartTv.ligada);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(25);
        System.out.println("Mudando de canal par o canal: " + smartTv.canal);
        System.out.println(" ");
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println(" ");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println(" ");

        System.out.println("Volume atual: " + smartTv.volume);

    }

}