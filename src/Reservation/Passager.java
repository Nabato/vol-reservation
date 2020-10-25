package Reservation;


import java.util.ArrayList;

public class Passager {
    
    private String nom;
    private ArrayList<Reservation> reservations;

    public Passager(String str) {
        this.nom = str;
        this.reservations = new ArrayList<Reservation>();
    }

    public void setReservation( Reservation res ){
        this.reservations.add(res);
    }

    @Override 
    public String toString() {
        String passager = "";
        passager += "\n\tPassager\n";
        passager += "\n Nom : " + this.nom + "\n";
        passager += "\n Reservation : " + this.reservations.toString();
        return passager;
    }

    
}
