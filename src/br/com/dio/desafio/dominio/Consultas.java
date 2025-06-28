package br.com.dio.desafio.dominio;

public class Consultas {
    private String Nome;
    private String Descricao;
    private int Valor;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    @Override
    public String toString() {
        return "Consultas{" +
                "Nome='" + Nome + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", Valor=" + Valor +
                '}';
    }
}
