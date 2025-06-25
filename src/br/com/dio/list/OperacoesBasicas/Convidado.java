package br.com.dio.list.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int convite;

    public Convidado(String nome, int convite) {
        this.nome = nome;
        this.convite = convite;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getConvite() == convidado.getConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", convite=" + convite +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getConvite() {
        return convite;
    }
}
