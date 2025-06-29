package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Diaria extends Clientes {
    private String nome;
    private Set<Agendamento> consultasAgendadas = new LinkedHashSet<>();
    private Set<Agendamento> consultasRealizadas = new LinkedHashSet<>();

    public void agendarConsulta(Consultas consultas){
        this.consultasAgendadas.addAll(consultas.getAgendaCliente());
        consultas.getAgendaCliente().add(this);
    }

    public void realizarConsulta() {
        Optional<Agendamento> agendamento = this.consultasAgendadas.stream().findFirst();
        if(agendamento.isPresent()){
            this.consultasRealizadas.add(agendamento.get());
            this.consultasAgendadas.remove(agendamento.get());
        } else {
            System.err.println("Voce nao tem agendamento para nenhuma consulta");
        }
    }

    public double calcularTotalValor() {
        return this.consultasRealizadas
                .stream()
                .mapToDouble(Agendamento::caclcularValor)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Agendamento> getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void setConsultasAgendadas(Set<Agendamento> consultasAgendadas) {
        this.consultasAgendadas = consultasAgendadas;
    }

    public Set<Agendamento> getConsultasRealizadas() {
        return consultasRealizadas;
    }

    public void setConsultasRealizadas(Set<Agendamento> consultasRealizadas) {
        this.consultasRealizadas = consultasRealizadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diaria diaria = (Diaria) o;
        return Objects.equals(nome, diaria.nome) && Objects.equals(consultasAgendadas, diaria.consultasAgendadas) && Objects.equals(consultasRealizadas, diaria.consultasRealizadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, consultasAgendadas, consultasRealizadas);
    }
}
