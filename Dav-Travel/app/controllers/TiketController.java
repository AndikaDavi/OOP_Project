package controllers;


import java.util.*;
import java.util.Set;

import models.Tiket;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;


public class TiketController extends Controller {
	
	public static Result index() {
		List<Tiket> tickets=Tiket.find.all();
		return ok(views.html.ticket.index.render(tickets));
		//return TODO;
	}
	
	public static Result create() {
		Form<Tiket>ticketForm = Form.form(Tiket.class);
		return ok(views.html.ticket.form.render(ticketForm));
		//return TODO;
	}
	
	public static Result save() {
		Form<Tiket> tiketForm = Form.form(Tiket.class).bindFromRequest();
		Tiket tiket= tiketForm.get();
		tiket.save();
		return redirect(routes.TiketController.index());
		//return TODO;
	}
	
	public static Result edit(Integer id) {
		Tiket tiket=Tiket.find.byId(id);
		if(tiket==null) {
			return notFound("Book Not Found");
		}
		Form<Tiket> tiketForm = Form.form(Tiket.class).fill(tiket);
		return ok(views.html.ticket.edit.render(tiketForm));
		
		
		//return TODO;
	}
	
	public static Result update() {
		Form<Tiket> tiketForm = Form.form(Tiket.class).bindFromRequest();
		Tiket tiket=tiketForm.get();
		Tiket oldTiket = Tiket.find.byId(tiket.id);
		if(oldTiket==null) {
			return notFound("ticket Not Found");
		}
		
		return redirect(routes.TiketController.index());
		
	}
	
	public static Result destroy(Integer id) {
		Tiket tiket = Tiket.find.byId(id);
		if(tiket==null) {
			return notFound("ticket Not Found");
		}
		tiket.delete();

		
		return redirect(routes.TiketController.index());
		//return TODO;
	}
	
	public static Result show(Integer id) {
		Tiket tiket = Tiket.find.byId(id);
		if(tiket==null) {
			return notFound("ticket Not Found");
		}
		
	
		
		return TODO;
	}
	

}
