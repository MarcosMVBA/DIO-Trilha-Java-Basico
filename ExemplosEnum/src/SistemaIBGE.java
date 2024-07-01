public class SistemaIBGE {
    public static void main(String[] args) {
        
       for(EstadoBrasileiro e: EstadoBrasileiro.values()){

        System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getNomeMaiusculo());

       }

       System.out.println("  ");
        //Fazendo com uma opção em especifico

       EstadoBrasileiro mSelecionado = EstadoBrasileiro.SAO_PAULO;

       System.out.println(mSelecionado.getNome());
       System.out.println(mSelecionado.getSigla());
       System.out.println(mSelecionado.getNomeMaiusculo());
       System.out.println(mSelecionado.getDDD());
    }

}
