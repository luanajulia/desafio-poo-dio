package br.com.dio.desafio.dominio;

public class Cachorros extends Agendamento{
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    @Override
    public double caclcularValor() {
        return valor_agendamento;
    }

    @Override
    public String toString() {
        return "Cachorros{" +
                "nome_cliente='" + getNome_cliente() + '\'' +
                ", nome_cachorro='" + getNome_cachorro() + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
