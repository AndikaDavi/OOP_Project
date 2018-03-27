package models;

import play.data.validation.Constraints.Required;

public class Traveller {
	@Required
    public String NamaPelanggan;
    
    @Required
    public String NomorHP;
    
    @Required
    public String AlamatEmail;


}

