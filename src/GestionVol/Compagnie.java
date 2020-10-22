package GestionVol;

import java.util.ArrayList;
import java.util.Date;

public class Compagnie {

    private String nom;
	private ArrayList<Vol> vols = new ArrayList<Vol>();


    public Compagnie( String str ) {
        this.nom = str;
    }

	public void addVol( Date dateDepart, Date dateArrivee, Aeroport aeroportDepart, Aeroport aeroportArrivee ){
		Vol vol = new Vol(dateDepart, dateArrivee, aeroportDepart, aeroportArrivee);
		vols.add( vol );
	}

	public ArrayList<Vol> getVol(){
		return this.vols;
	}

	@Override
	public String toString(){
		return this.nom + ", " + this.vols.toString();
	}

}
