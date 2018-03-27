package models;
import play.data.validation.Constraints.Required;


public class Tiket {
		
		@Required
	    public String JenisTiket;
	    
		@Required
	    public String BiayaTiket;
	    
	    @Required
	    public String IDTiket;

}
