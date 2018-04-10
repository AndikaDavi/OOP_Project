package models;

public class account {
	private String nama;
	private int balance;
	
	public account(int startingBalance){
		nama = "Unassigned";
		balance = startingBalance;
	}
	
	public account(String nama, int startingBalance) {
		this.nama = nama;
		balance = startingBalance;
	}
	
	public void add(int val) {
		balance += val;
	}
	
	public void deduct(int val) {
		balance -= val;
	}
	
	public String getBalance() {
		return "Rp "+balance+",00";
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setBalance(int val) {
		balance = val;
	}
	
	public void setNama( String val) {
		nama = val;
	}
}
