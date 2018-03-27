package models;

import play.data.validation.Constraints.Required;

public class Booking {
	@Required
    public String TanggalBooking;
    
    @Required
    public String JumlahBooking;

}
