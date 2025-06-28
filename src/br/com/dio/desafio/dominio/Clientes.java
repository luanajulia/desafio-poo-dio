package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Clientes {
    private String nome;
    private LocalDate data_consulta;
    public String cachorro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(LocalDate data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getCachorro() {
        return cachorro;
    }

    public void setCachorro(String cachorro) {
        this.cachorro = cachorro;
    }



    @Override
    public String toString() {
        return "Clientes{" +
                "nome='" + nome + '\'' +
                ", data_consulta=" + data_consulta +
                ", cachorro='" + cachorro + '\'' +
                '}';
    }
}
