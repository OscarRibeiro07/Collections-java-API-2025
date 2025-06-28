package br.com.dio.collection.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Eventos > eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public  void adicionaEvento(LocalDate dataEvento, String nome, String atracao){
        eventosMap.put(dataEvento, new Eventos(nome, atracao));
    }

    public void exibeAgenda(){
        TreeMap<LocalDate, Eventos> agendaEventosMap = new TreeMap<>(eventosMap);
        System.out.println(agendaEventosMap);

    }

    public static void main(String[] args) {


        AgendaEventos agenda=new AgendaEventos();
        agenda.adicionaEvento(LocalDate.of(2025,7,21),"Java","Publica");
        agenda.adicionaEvento(LocalDate.of(2025,7,22),"Java","Publica");
        agenda.adicionaEvento(LocalDate.of(2025,7,20),"Java","Publica");
        System.out.println(agenda.eventosMap);
    }
}
