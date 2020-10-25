package Reservation;


import GestionVol.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Client {

    private String nom;

    private String payment;

    private String contact;    

    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public Client(){
    }

    public Client( String nom ){
        this.nom = nom;
    }
    
    public void setName( String nom ){
        this.nom = nom; 
    }

    public String getName() {
        return this.nom;
    }

    public void setContact( String contact ){
        this.contact = contact;
    }

    public String getContact(){
        return this.contact;
    }

    public void setPayment( String payment ){
        this.payment = payment;
    }

    public String getPayment(){
        return this.payment;
    }
    
    public Reservation reserver( Vol vol, Passager passager ){
        if (vol.getEtat()) {

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            Date date = new Date(System.currentTimeMillis());
            Reservation r = new Reservation(vol, date, this, passager);
            reservations.add(r);
            passager.setReservation(r);
            return r;
        }

        return null;
    }

  

    @Override
    public String toString(){
        String client = "";
        client += "\n\tClient\n";
        client += "\n Nom : " + this.nom;
        client += this.reservations.toString();
        return client;
    }
}
