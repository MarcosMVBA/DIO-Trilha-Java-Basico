package lanchonete;

import lanchonete.Atendimento.Atendente;
import lanchonete.Atendimento.Cozinha.Cozinheiro;
import lanchonete.area.Cliente;

public class Estabelecimento {
	public static void main(String[] args) {

		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação
		


		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		
		//ações que não precisam estarem disponíveis para toda a aplicação
		
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		
		
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		
		
		//já pensou os clientes ouvindo que o gás acabou ?
		
		
		
	}
}