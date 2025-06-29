package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Clientes extends Agendamento{
    private LocalDate data_consulta;
    private int valor;
    private String consulta;

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public LocalDate getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(LocalDate data_consulta) {
        this.data_consulta = data_consulta;
    }

    @Override
    public double caclcularValor() {
        return valor_agendamento + getValor();
    }


    @Override
    public String toString() {
        return "Clientes{" +
                "data_consulta=" + data_consulta +
                ", valor=" + valor +
                ", consulta='" + consulta + '\'' +
                '}';
    }
}
