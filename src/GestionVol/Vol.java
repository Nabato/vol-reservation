package GestionVol;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Duration;
import java.util.ArrayList;

public class Vol {

	private String numero;

	private Date dateDepart;
	private Date dateArrivee;

	private Aeroport aeroportDepart;
	private Aeroport aeroportArrivee;
	private ArrayList<Escale> escales;

	private boolean isOpen;
	    
	public Vol(){
	}

	protected Vol( Date dateDepart, Date dateArrivee, Aeroport aeroportDepart, Aeroport aeroportArrivee ){
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrivee = aeroportArrivee;
	}

	public void setDateDepart( Date dateD ){
		this.dateDepart = dateD;
	}

	public Date getDateDepart(){
		return this.dateDepart;
	}

  

    public void ouvrir(){
        this.isOpen = true;
    }

    public void fermer(){
        this.isOpen = false;
    }

    public void addEscale( Escale escale ) {
		this.escales.add( escale );
	}
/*
	@Override
	public String toString(){
        String vol = "";
        vol += "\n\tVol\n";
        vol += "\nNumero : " + this.numero + "\n";
        vol += "\nAéroport de départ : " + this.aeroportDepart.toString();
        vol += "\nDate de départ : " + this.dateDepart.toString() ;
        vol += "\n\nAéroport de d'arrivée : " + this.aeroportArrivee.toString();
        vol += "\nDate de d'arrivée : " + this.dateArrivee.toString() ;

        for (Escale e : escales) {
         vol += e.toString();
		}
        return vol;
	}
*/
}
