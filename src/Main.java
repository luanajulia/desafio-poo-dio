import br.com.dio.desafio.dominio.Cachorros;
import br.com.dio.desafio.dominio.Clientes;
import br.com.dio.desafio.dominio.Consultas;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        /// Possiveis Consultas
        Consultas medica = new Consultas();
        medica.setNome("Veterinaria");
        medica.setDescricao("Consulta de Medica Veterinaria");
        medica.setValor(50);

        Consultas tosa = new Consultas();
        tosa.setNome("Tosa");
        tosa.setDescricao("Tosa completa");
        tosa.setValor(20);

        Consultas banho = new Consultas();
        banho.setNome("Banho");
        banho.setDescricao("Banho, Secagem e Penteado");
        banho.setValor(30);

        /// Clientes
        Clientes client1 = new Clientes();
        client1.setNome("Jenny Han");
        client1.setCachorro("Bob");
        client1.setData_consulta(LocalDate.now());

        Clientes client2 = new Clientes();
        client2.setNome("Stuart Vieira");
        client2.setCachorro("Rex");
        client2.setData_consulta(LocalDate.now());

        Clientes client3 = new Clientes();
        client3.setNome("George Goncalves");
        client3.setCachorro("Mel");
        client3.setData_consulta(LocalDate.now());
    }
}