package edu.uniquindio.co.ejercicio11_agendaacademicafecha.Services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import edu.uniquindio.co.ejercicio11_agendaacademicafecha.Model.Activity;

public class AgendaAcademica {

    private TreeMap<LocalDate, List<Activity>> agenda = new TreeMap<>();

    // add activities to a date
    // If the date does not exist in the TreeMap, it creates a new entry with a Arraylist
    public void addActivities(LocalDate date , Activity act) {
        agenda.computeIfAbsent(date, f -> new ArrayList<>()).add(act);
        }
    
    //Get the closest activity by date
    public List<Activity> getNextActivity() {
        LocalDate today = LocalDate.now();
        LocalDate NextDate = agenda.ceilingKey(today); 

        if (NextDate != null) {
            return agenda.get(NextDate); //Gets the near date with activities
        }
        return Collections.emptyList(); //There are no upcoming activities
    }

    //Get a report of activities that are between two dates
    public Map <LocalDate, List<Activity>> reportBetweenDates(LocalDate inicio, LocalDate fin){
        return agenda.subMap(inicio,true,fin, true);
    }
}
