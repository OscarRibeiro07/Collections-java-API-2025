package br.com.dio.collection.map.OperacoesBasicas;

public class Contato {

    private String nome;
    private  Integer telefone;

    public Contato(String nome, Integer telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
}
