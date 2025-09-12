package edu.uniquindio.co.ejercicio15_rankingdeportistas.model;

import java.util.Objects;

public class Deportista {

   private final String name;
   private final String lastname;
   private final int score;

   public Deportista(String name, String lastname, int score) {
    this.name = name;
    this.lastname = lastname;
    this.score = score;
   }

     public String getName() {
    return name;
}
   public String getLastname() {
    return lastname;
   }

   public int getScore() {
    return score;
   }
   
    @Override
    public String toString() {
        return "Deportista: " +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", score=" + score 
                ;
    }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Deportista)) return false;
            Deportista that = (Deportista) o;
            return score == that.score && Objects.equals(name, that.name) && Objects.equals(lastname, that.lastname);
        }
    
        @Override
        public int hashCode() { 
            return Objects.hash(name, lastname, score);
        }
    
    }

