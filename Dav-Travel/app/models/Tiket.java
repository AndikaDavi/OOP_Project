package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.Model;
import play.db.ebean.*;

@Entity
public class Tiket extends Model {
	@Id
	//public Integer noid;
	public Integer harga;
	public String jumlah;
	public String kotatujuan;
	public Integer id;
	

	public static Finder<Integer, Tiket> find = new Finder<Integer, Tiket>(Integer.class,Tiket.class);

}
  