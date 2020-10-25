package Reservation;

import java.util.Date;
import GestionVol.Vol;

public class Reservation {

    private enum Etat {
        EN_ATTENTE, ANNULEE, CONFIRMER
    }

    private String numero;
    private Date date;

    private Vol vol;

    private Client client;
    private Passager passager;


    private Etat etat;

    public Reservation( Vol vol, Date date, Client client, Passager passager ){
        this.vol = vol;
        this.date = date;

        this.client = client;
        this.passager = passager;

        etat = Etat.EN_ATTENTE;
    }







    public void confirmer() {
        switch( this.etat ) {
            case ANNULEE:
            default:            
                this.etat = Etat.CONFIRMER;
        }
    }

    public void annuler() {
         switch( this.etat ) {
            case CONFIRMER:
            default:            
                this.etat = Etat.ANNULEE;
        }
    }

    @Override
    public String toString() {
        String reservation = "";
        reservation += "\n\tReservation\n";
        reservation += "\n\n Date de depart : " + this.date.toString() + '\n';
        reservation += "\n Client : " + this.client + '\n';
        reservation += "\n Passager : " + this.passager + '\n';
        reservation += "\n Etat : " + this.etat;
        return reservation; 
    }
}
