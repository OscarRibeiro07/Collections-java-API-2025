package br.com.dio.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList =new ArrayList<>();
    }

    public void adicionaTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t:  tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefaParaRemover);
    }



    public int obterNumeroTotalTarefas(){

        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de tarefas é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionaTarefa("Fazer um bolo");
        listaTarefa.adicionaTarefa("Tarefa 2");
        listaTarefa.adicionaTarefa("Tarefa 4");
        listaTarefa.adicionaTarefa("Tarefa 3");
        listaTarefa.adicionaTarefa("Tarefa 3");
        System.out.println("O numero total de tarefas é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removeTarefa("Tarefa 3");
        System.out.println("O numero total de tarefas é " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("Imprimindo descrição de tarefas " );
        listaTarefa.obterDescricoesTarefas();
        

    }

}
