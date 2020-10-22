import GestionVol.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Start {

    public static void main( String args[] ) {
		
		Compagnie ARF = new Compagnie("Air France");

       	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		String strD = "21/10/2020 13:00";	
		String strA = "21/10/2020 19:30";

		Date dd, da;

		try {
			dd = format.parse( strD );
			da = format.parse( strA );
		} catch ( Exception e) {
			throw new IllegalArgumentException("");
		}

		Aeroport MRS = new Aeroport("Marseille");
		Aeroport SXB = new Aeroport("Strasbourg");

		ARF.addVol( dd, da, MRS, SXB );
 
       
    }

}
