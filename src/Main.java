import br.com.dio.desafio.dominio.Cachorros;
import br.com.dio.desafio.dominio.Clientes;
import br.com.dio.desafio.dominio.Consultas;
import br.com.dio.desafio.dominio.Diaria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        /// Clientes
        Clientes client1 = new Clientes();
        client1.setNome_cliente("Jenny Han");
        client1.setNome_cachorro("Bob");
        client1.setConsulta("Tosa");
        client1.setValor(30);
        client1.setData_consulta(LocalDate.now());

        Clientes client2 = new Clientes();
        client2.setNome_cliente("Stuart Vieira");
        client2.setNome_cachorro("Rex");
        client2.setConsulta("Banho");
        client2.setValor(20);
        client2.setData_consulta(LocalDate.now());

        Clientes client3 = new Clientes();
        client3.setNome_cliente("George Goncalves");
        client3.setNome_cachorro("Mel");
        client3.setConsulta("Veterinario");
        client3.setValor(50);
        client3.setData_consulta(LocalDate.now());

        /// Cachorro
        Cachorros dog1 = new Cachorros();
        dog1.setNome_cliente("Jenny Han");
        dog1.setNome_cachorro("Bob");
        dog1.setRaca("Chihuahua");

        Cachorros dog2 = new Cachorros();
        dog2.setNome_cliente("Stuart Vieira");
        dog2.setNome_cachorro("Rex");
        dog2.setRaca("Golden");

        Cachorros dog3 = new Cachorros();
        dog3.setNome_cliente("George Goncalves");
        dog3.setNome_cachorro("Mel");
        dog3.setRaca("Puddle");


        ///  Agenda
        Consultas segunda = new Consultas();
        segunda.setNome("Segunda-Feira");
        segunda.setDescricao("Agenda da Segunda-Feira");
        segunda.getAgendaCliente().add(client1);
        segunda.getAgendaCliente().add(client2);

        Consultas terca = new Consultas();
        terca.setNome("Terca-Feira");
        terca.setDescricao("Agenda da Terca-Feira");
        terca.getAgendaCliente().add(client2);
        terca.getAgendaCliente().add(client3);

        Consultas quarta = new Consultas();
        quarta.setNome("Quarta-Feira");
        quarta.setDescricao("Agenda da Quarta-Feira");
        quarta.getAgendaCliente().add(client3);

        ///  Diaria
        System.out.println("---------------------------------------------");

        Diaria vetAlexandra = new Diaria();
        vetAlexandra.setNome("Alexandra Gomes");
        vetAlexandra.agendarConsulta(segunda);
        System.out.println("Consultas Agendadas para a veterinaria Alexandra" + vetAlexandra.getConsultasAgendadas());
        vetAlexandra.realizarConsulta();
        vetAlexandra.realizarConsulta();
        System.out.println("Consultas Realizadas pela veterinaria Alexandra" + vetAlexandra.getConsultasRealizadas());
        System.out.println("Valor de ganho no final do dia:" + vetAlexandra.calcularTotalValor());

        System.out.println("---------------------------------------------");

        Diaria vetVitor = new Diaria();
        vetVitor.setNome("Vitor Oliveira");
        vetVitor.agendarConsulta(terca);
        System.out.println("Consultas Agendadas para o veterinario Vitor" + vetVitor.getConsultasAgendadas());
        vetVitor.realizarConsulta();
        System.out.println("Consultas Realizadas pelo veterinaria Vitor" + vetVitor.getConsultasRealizadas());
        System.out.println("Valor de ganho no final do dia:" + vetVitor.calcularTotalValor());

        System.out.println("---------------------------------------------");

        Diaria vetLuke = new Diaria();
        vetLuke.setNome("Luke Sky");
        vetLuke.agendarConsulta(quarta);
        System.out.println("Consultas Agendadas para o veterinario Luke" + vetLuke.getConsultasAgendadas());
        vetLuke.realizarConsulta();
        System.out.println("Consultas Realizadas pelo veterinaria Luke" + vetLuke.getConsultasRealizadas());
        System.out.println("Valor de ganho no final do dia:" + vetLuke.calcularTotalValor());



    }
}