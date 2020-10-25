import GestionVol.*;
import Reservation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Start {

    public static void main( String args[] ) {
		
		Compagnie ARF = new Compagnie("Air France");
        String numeroVol = "ARF001";

       	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		String volD = "21/10/2020 10:00";	
		String volA = "21/10/2020 21:30";

        String escalA = "21/10/2020 13:30";
        String escalD = "21/10/2020 14:30";

		Date dd, da, ed, ea;

		try {
			dd = format.parse( volD );
			da = format.parse( volA );
            ed = format.parse( escalD );
            ea = format.parse( escalA );
		} catch ( Exception e) {
			throw new IllegalArgumentException("");
		}

        Ville paris = new Ville("Paris");
        Ville doubai = new Ville("Doubai");
        Ville narita = new Ville("Narita");

		Aeroport NRT = new Aeroport("Narita International Airport");
		Aeroport DXB = new Aeroport("Dubai International Airport");
        Aeroport ADP = new Aeroport("Aéroport de Paris");

        ADP.addVille(paris);
        NRT.addVille(narita);
        DXB.addVille(doubai);       
    
		Vol vol1 = new Vol( numeroVol, dd, da, ADP, NRT );
  
		Escale escale = new Escale(DXB, ed, ea);

        vol1.addEscale( escale );

        ARF.addVol( vol1 );
        
		//System.out.println(ARF.toString());

        Client client1 = new Client("Camille");
        Client client2 = new Client("Nathanael");
        

        Passager passager1 = new Passager("Camille");
        Passager passager2 = new Passager("Nathanael");
        Passager passager3 = new Passager("Antoine");
        
        client1.reserver( vol1, passager1 );
        client2.reserver( vol1, passager2 );
        client2.reserver( vol1, passager3 );

        System.out.println( passager3.toString());
       // System.out.println( reservation.toString());
    }

}
