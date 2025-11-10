package Manipulacao;


import java.time.LocalTime;

public class GerenciadorAgendamento {
    
   /*  public boolean verificarHorarioValid(int horaInicio, int minInicio, int duracaoMinutos){
        LocalTime horaInicioTime = LocalTime.of(horaInicio, minInicio);

        if(horaInicioTime.isBefore(LocalTime.of(8, 0))){
            return false;
        }

        if(horaInicioTime.isAfter(LocalTime.of(17,0).plusMinutes(duracaoMinutos))){
            return false;
        }

       
        return true;
    }
        
    */


    public boolean verificarHorarioValid(int horaInicio, int minInicio, int duracaoMinutos){
        LocalTime horaInicioTime = LocalTime.of(horaInicio, minInicio);
        LocalTime limiteInicio = LocalTime.of(8,0);
        LocalTime limiteFim = LocalTime.of(17,0);

        if(horaInicioTime.isBefore(limiteInicio)){
            System.out.println("Horario de inicio antes do permitido");
            return false;
        }
        
        LocalTime horaTermino = horaInicioTime.plusMinutes(duracaoMinutos);

        if(horaInicioTime.isAfter(limiteFim) || horaInicioTime.equals(horaTermino)){
            System.out.println("Horario de inicio depois do permitido");
            return false;
        }

        if(horaTermino.isAfter(limiteFim)){
            System.out.println("Horario de termino depois do permitido");
            return false;
        }

        System.out.println("Horario valido");
        return true;


    }

}
