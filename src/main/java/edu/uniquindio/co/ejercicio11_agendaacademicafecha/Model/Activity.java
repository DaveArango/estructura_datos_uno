package edu.uniquindio.co.ejercicio11_agendaacademicafecha.Model;

import java.time.LocalDate;

public class Activity {
    private String name;
    private String description;
    private String subject;
    private boolean isVirtual;
    private LocalDate fechaEntrega;

    public Activity(String name, String description, String subject, 
    boolean isVirtual, LocalDate fechaEntrega) {
        this.name = name;
        this.description = description;
        this.subject = subject;
        this.isVirtual = isVirtual;
        this.fechaEntrega = fechaEntrega;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setVirtual(boolean isVirtual) {
        this.isVirtual = isVirtual;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public String getSubject() {
        return subject;
    }


    public boolean isVirtual() {
        return isVirtual;
    }

     public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }


    @Override
    public String toString() {
    return "Actividad {\n" +
           "  Nombre: '" + name + "',\n" +
           "  Descripción: '" + description + "',\n" +
           "  Materia: '" + subject + "',\n" +
           "  Fecha de entrega: " + fechaEntrega.format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ",\n" +
           "  Es virtual: " + (isVirtual ? "Sí" : "No") + "\n" +
           "}";
    }
    
}
