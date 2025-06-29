package br.com.dio.desafio.dominio;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Consultas {
    public String Nome;
    private String Descricao;
    private Set<Diaria> diariaAgendada = new HashSet<>();
    private Set<Clientes> agendaCliente = new HashSet<>();

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


    public Set<Clientes> getAgendaCliente() {
        return agendaCliente;
    }

    public void setAgendaCliente(Set<Clientes> agendaCliente) {
        this.agendaCliente = agendaCliente;
    }

    public Collection<? extends Agendamento> getDiariaAgendada() {
        return diariaAgendada;
    }

    public void setDiariaAgendada(Set<Diaria> diariaAgendada) {
        this.diariaAgendada = diariaAgendada;
    }



    @Override
    public int hashCode() {
        return Objects.hash(Nome, Descricao, diariaAgendada);
    }



}
