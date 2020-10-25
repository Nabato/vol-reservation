package GestionVol;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Escale {

    private Aeroport aeroport;
    private Date depart;
    private Date arrivee;
    private Duration duree;

    public Escale (Aeroport aeroport, Date depart, Date arrivee) {
        this.aeroport = aeroport;
        this.arrivee = arrivee;
        this.depart = depart;
        this.duree = Duration.of(depart.getTime() - arrivee.getTime(), ChronoUnit.MILLIS);
    }

    
    @Override
    public String toString() {
        String escale = "";
        escale += "\n\n\tESCALE\n";
        escale += "\n Aeroport : " + this.aeroport + "\n";
        escale += "\n Date d'arrivee : " + this.arrivee.toString() + "\n";
        escale += "\n Date de depart : " + this.depart.toString() + "\n";
        escale += "\n Duree : " + this.duree.toString().substring(2) + "\n";
        return escale;
    }
}
