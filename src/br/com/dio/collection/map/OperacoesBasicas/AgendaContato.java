package br.com.dio.collection.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    private final Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap =new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato();
        agenda.adicionarContato("Numero", 156789);
        agenda.adicionarContato("Numero 2", 156090);
        agenda.adicionarContato("Numero 3", 152030);
        agenda.adicionarContato("Numero 4", 151617);
        agenda.exibirContato();
        System.out.println("Contato por nome");
        System.out.println(agenda.pesquisarPorNome("Numero"));
        agenda.removerContato("Numero 2");
        agenda.exibirContato();
    }
}
