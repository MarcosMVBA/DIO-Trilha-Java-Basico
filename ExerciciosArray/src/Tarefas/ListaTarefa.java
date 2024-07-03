package Tarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaLista;

    //Metodo Construtor
    public ListaTarefa() {
        this.tarefaLista = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao){
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> TarefasParaRemover = new ArrayList<>();

        for(Tarefa f : tarefaLista){

            if(f.getDescricao().equalsIgnoreCase(descricao)){

                TarefasParaRemover.add(f);

            }
        }
            tarefaLista.removeAll(TarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){

        return tarefaLista.size();
    }

    public void obterDescricoesTarefas(){

        System.out.println(tarefaLista);
    }

   public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa1");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa1");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

   }
}
