package br.com.dio.desafio.dominio;

public abstract class Agendamento {

    protected static  final double valor_agendamento = 10;

    private String nome_cliente;
    private String nome_cachorro;

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getNome_cachorro() {
        return nome_cachorro;
    }

    public void setNome_cachorro(String nome_cachorro) {
        this.nome_cachorro = nome_cachorro;
    }

    public abstract double caclcularValor();

}
