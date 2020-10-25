package GestionVol;

import java.util.ArrayList;

public class Aeroport {

    private String nom;

    public ArrayList<Ville> villes = new ArrayList();

    public Aeroport( String str ) {
        this.nom = str;
    }

    public void setNom( String nom ){
        this.nom = nom;
    }

    public String getNom() {
      return this.nom;
   }
   
    public void addVille( Ville ville ) {
        ville.setAeroportWithoutBidirectional( this );
        this.villes.add( ville );
	}

    public void removeVille( Ville ville ) {
        ville.setAeroportWithoutBidirectional( null );
        this.villes.remove( ville );
    }

    public void setVilles( ArrayList<Ville> villes ) {
        for (Ville v : this.villes ){
            v.setAeroportWithoutBidirectional(null);
        } this.villes = villes ;
        if ( this.villes != null ){
            for ( Ville v : this.villes ){
                v.setAeroportWithoutBidirectional(this);
            }
        }
    }

    protected void addVilleWithoutBidirectional( Ville ville ) {
        this.villes.add( ville );
	}

    protected void removeVilleWithoutBidirectional( Ville ville ) {
        this.villes.remove( ville );
    }

    protected void setVilleWithoutBidirectional( ArrayList<Ville> villes ) {
        this.villes = villes ;
    }

    public ArrayList<Ville> getVilles(){
        return this.villes;
    }
	

	@Override
    public String toString(){
        String aeroport = "";
        aeroport += this.nom + "\n\n";
        aeroport += " Villes : " + this.villes.toString();
		return aeroport;
	}
}
