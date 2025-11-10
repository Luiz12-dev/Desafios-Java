package Manipulacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DesafioTime {
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = hoje.format(formatter);

        System.out.println("Data de hoje: " + dataFormatada);


        //Identificamos a data, Formatamos ela, e criamso uma nova variavel com a data formatada para exibir no console.

        
    }
    
}
