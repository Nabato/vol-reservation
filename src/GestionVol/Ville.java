package GestionVol;

public class Ville {

    private String nom;
    private Aeroport aeroport;

    public Ville (String str ){
        this.nom = str;
    }

    public void setVille( String nom ){
        this.nom = nom;
    }

    public String getVille(){
        return this.nom;
    }

    public Aeroport getAeroport(){
        return this.aeroport;
    }

    protected Aeroport getAeroportWithoutBidirectional(){
        return this.aeroport;
    }

    public void setAeroport( Aeroport aeroport ) {
        if ( aeroport != null ){
            this.aeroport.addVilleWithoutBidirectional(this);
        }
        if ( this.aeroport != null ) {
           this.aeroport.removeVilleWithoutBidirectional(this);
        }
        this.aeroport = aeroport;
    }

    protected void setAeroportWithoutBidirectional( Aeroport aeroport ) {
        this.aeroport = aeroport;
    }

    

	@Override
	public String toString(){
        String ville = "";
        ville += this.nom;
		return ville;
	}
}

/*
    Londre,
    Paris,
    Amsterdam,
    Francfort,
    Madrid,
    Barcelone,
    Istanbul,
    Moscu,
    Munich,
    Rome,
    Dublin,
    Zurich,
    Lisbone,
    Copenhague
*/
