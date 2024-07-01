public enum EstadoBrasileiro {

    //Criando o Enum EstadoBrasileiro para ser utilizado em toda aplicação. 

    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 21),
    PIAUI("PI", "Piauí", 86),
    MARANHAO("MA",  "Maranhão", 98);

    private String nome;
    private String sigla;
    private int DDD;

    private EstadoBrasileiro(String sigla, String nome, int DDD){

        this.sigla = sigla;
        this.nome = nome;
        this.DDD = DDD;
        
    }

    public String getSigla(){

        return sigla;
    }

    public String getNome(){

        return nome;
    }

    public String getNomeMaiusculo(){

        return nome.toUpperCase();
    }

    public int getDDD(){

        return DDD;

    }
}

