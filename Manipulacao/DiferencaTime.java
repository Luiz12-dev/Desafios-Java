package Manipulacao;

import java.time.Duration;
import java.time.LocalTime;

public class DiferencaTime {
    public static void main(String[] args) {
        
        LocalTime horaInicio = LocalTime.of(10,0);

        LocalTime horaFim = LocalTime.of(14,0);

        Duration duracao = Duration.between(horaInicio, horaFim);
        System.out.println("Duração: " + duracao.toHours() + " horas");
    }
}
