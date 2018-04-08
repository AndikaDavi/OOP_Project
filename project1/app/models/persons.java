package models;

public class persons {
	public String nama;
	public int noiden;
	public void person() {
		nama = "Andika Davi Y";
		noiden = 70;
	}
	
	public String getnama() {
		return nama;
	}
	
	public int getnoiden() {
		return noiden;
	}

	public void setnama(String name) {
		nama = name;
	}
	
	public void setnoiden(int nom) {
		noiden = nom;
	}
}
