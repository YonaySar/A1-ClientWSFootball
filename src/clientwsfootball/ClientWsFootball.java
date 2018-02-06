/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwsfootball;

import eu.dataaccess.footballpool.ArrayOfString;
import eu.dataaccess.footballpool.ArrayOftCountryInfo;

/**
 *
 * @author entrar
 */
public class ClientWsFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   //     System.out.println("El total de tarjetas es: "+yellowCardsTotal());

     //   System.out.println("Los defensas de españa son: "+allDefenders("Spain").getString());
        String CountryName;
        for(int i = 0; i<countryNames(true).getTCountryInfo().size();i++){
           CountryName = countryNames(true).getTCountryInfo().get(i).getSName();
            
             System.out.println("El pais: " +CountryName+ "tiene los siguientes defensas: " + allDefenders(CountryName).getString());
        }
        
       
           
    }

    private static int yellowCardsTotal() {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.yellowCardsTotal();
    }

    private static ArrayOfString allDefenders(java.lang.String sCountryName) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.allDefenders(sCountryName);
    }

    private static ArrayOftCountryInfo countryNames(boolean bWithCompetitors) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.countryNames(bWithCompetitors);
    }
    
}
