package edu.uniquindio.co.ejercicio11_agendaacademicafecha;

//Se programo en ingles para estudiarlo 
import java.time.LocalDate;
import edu.uniquindio.co.ejercicio11_agendaacademicafecha.Model.Activity;
import edu.uniquindio.co.ejercicio11_agendaacademicafecha.Services.AgendaAcademica;

public class Main {
    public static void main(String[] args) {

        AgendaAcademica agenda = new AgendaAcademica();

        Activity act1 = new Activity("Tarea Sucesiones", "Resolver ejercicios de integrales","Calculo integral",false, LocalDate.of(2025, 9, 16));
        Activity act2 = new Activity("Examen Física", "Estudiar capítulos 3 y 4","Fisica",false, LocalDate.of(2025, 9, 18));
        Activity act3 = new Activity("Proyecto Programación", "Elaborar un sistema de reproduccion de musica", "Estructura de datos", true, LocalDate.of(2025, 9, 20));
        Activity act4 = new Activity("unidad1 Mooc", "Terminar unidad 1 de curso seminario", "Seminario Investigacion", true, LocalDate.of(2025, 9, 12));


        agenda.addActivities(act1.getFechaEntrega(), act1);
        agenda.addActivities(act2.getFechaEntrega(), act2);
        agenda.addActivities(act3.getFechaEntrega(), act3);
        agenda.addActivities(act4.getFechaEntrega(), act4);

        System.out.println("Next Activity in ur calendary: ");
        agenda.getNextActivity().forEach(System.out::println);

        System.out.println("Report from 11-09-2025 to 18-09-2025:");
        agenda.reportBetweenDates(LocalDate.of(2025, 9, 11), LocalDate.of(2025, 9, 18))
            .forEach((date, activities) -> {
                activities.forEach(System.out::println);
      });
    }
}
