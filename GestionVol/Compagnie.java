package GestionVol;

import java.util.ArrayList;
import java.util.Date;

public class Compagnie {

    private String nom;
	private ArrayList<Vol> vols = new ArrayList<Vol>();

    public Compagnie( String str ) {
        this.nom = str;
    }

    public String getName() {
        return this.nom;
    }
    
    public void setName( String name ) {
        this.nom = name;
    }
    
    public ArrayList<Vol> getVol(){
		return this.vols;
	}

	public void addVol( Vol vol ) {
        vol.setCompagnieWithoutBidirectional( this );
        this.vols.add( vol );
	}

    public void removeVol( Vol vol ) {
        vol.setCompagnieWithoutBidirectional( null );
        this.vols.remove( vol );
    }

    public void setVol( ArrayList<Vol> vols ) {
        for (Vol v : this.vols ){
            v.setCompagnieWithoutBidirectional(null);
        } this.vols = vols ;
        if ( this.vols != null ){
            for ( Vol v : this.vols ){
                v.setCompagnieWithoutBidirectional(this);
            }
        }
    }

    protected void addVolWithoutBidirectional( Vol vol ) {
        this.vols.add( vol );
	}

    protected void removeVolWithoutBidirectional( Vol vol ) {
        this.vols.remove( vol );
    }

    protected void setVolWithoutBidirectional( ArrayList<Vol> vols ) {
        this.vols = vols ;
    }

	@Override
	public String toString(){
        String compagnie = "";
        compagnie += "\n\tCompagnie\n";
        compagnie += "\n Nom : " + this.nom + "\n\n";
        compagnie += this.vols.toString();
		return compagnie;
	}
}
