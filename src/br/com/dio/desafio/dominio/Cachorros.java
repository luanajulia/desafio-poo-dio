package br.com.dio.desafio.dominio;

public class Cachorros {
    private String nome;
    private String raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorros{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
