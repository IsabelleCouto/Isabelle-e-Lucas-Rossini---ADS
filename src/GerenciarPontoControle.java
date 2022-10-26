import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarPontoControle {
    public static void main(String[] args) throws InterruptedException {

        // ex 8
        Gerente gerente = new Gerente();
        gerente.setNome("Gerente Robson");
        gerente.setEmail("robson@gmail.com");
        gerente.setLogin("RobsonGerente");
        gerente.setSenha("12345");
        gerente.setDocumento("12345678910");
        gerente.setIdFunc(2);

        //ex 9
        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Secretaria Joana");
        secretaria.setEmail("joana@gmail.com");
        secretaria.setDocumento("2345678910");
        secretaria.setRamal("12");
        secretaria.setTelefone("190000000");
        secretaria.setIdFunc(9);

        // ex 10
        Operador operador = new Operador();
        operador.setNome("Operador José");
        operador.setEmail("jose@gmail.com");
        operador.setDocumento("12344");
        operador.setIdFunc(6);
        operador.setValorHora(50);

        //ex 11
        RegistroPonto registroPontoGerente = new RegistroPonto();
        registroPontoGerente.setIdRegPonto(1);
        registroPontoGerente.setFunc(gerente);
        registroPontoGerente.setDataRegistro(LocalDate.now());
        registroPontoGerente.setHoraEntrada(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();

        Thread.sleep(1000);

        //ex 12
        RegistroPonto registroPontoOperador = new RegistroPonto();
        registroPontoOperador.setIdRegPonto(2);
        registroPontoOperador.setFunc(operador);
        registroPontoOperador.setDataRegistro(LocalDate.now());
        registroPontoOperador.setHoraEntrada(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();

        Thread.sleep(1000);

        // ex 13
        RegistroPonto registroPontoSecretaria = new RegistroPonto();
        registroPontoSecretaria.setIdRegPonto(3);
        registroPontoSecretaria.setFunc(secretaria);
        registroPontoSecretaria.setDataRegistro(LocalDate.now());
        registroPontoSecretaria.setHoraEntrada(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();

        Thread.sleep(1000);

        // ex 14
        registroPontoGerente.setHoraSaida(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();

        Thread.sleep(1000);

        // ex 15
        registroPontoOperador.setHoraSaida(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();

        Thread.sleep(1000);

        // ex 16
        registroPontoSecretaria.setHoraSaida(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();

        Thread.sleep(1000);

    }
}