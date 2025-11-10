package Manipulacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculatTime {
    public static void main(String[] args) {
        
        LocalDate daqui10dias = LocalDate.now().plusDays(10);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate daqui2meses = LocalDate.now().plusMonths(2);

        String dataFormatada = daqui10dias.format(formatter);

        System.out.println(daqui2meses.format(formatter));
        System.out.println("Data daqui 10 dias: " + dataFormatada);
    }
}
