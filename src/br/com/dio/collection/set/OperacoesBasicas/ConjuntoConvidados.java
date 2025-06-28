package br.com.dio.collection.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private final Set<Convidado> setConvidados;

    public ConjuntoConvidados() {
        this.setConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convite){
        setConvidados.add(new Convidado(nome, convite));
    }
    public void removeConvidadoPorCodigo(int codigo){
        Convidado convidadoParaRemover = null;
       for (Convidado c : setConvidados){
           if (c.getConvite()==codigo){
              convidadoParaRemover =c;
              break;
           }

       }
       setConvidados.remove(convidadoParaRemover);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("Pedro", 124);
        convidados.adicionarConvidado("Thiago", 124);
        convidados.adicionarConvidado("Rafael", 125);
        convidados.adicionarConvidado("Julia", 127);

        System.out.println(convidados.setConvidados);

    }
}
