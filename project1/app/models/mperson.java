package models;

import models.persons;

public class mperson {
	public static void main(String[] args) {
		persons person1, person2;
		person1 = new persons();
		person1.nama = "Ari Faldi";
		person1.noiden = 123456;
		person2 = new persons();
		person2.nama = "Acep Taryana";
		person2.noiden = 78910;
		System.out.println("Nama : " + person1.nama);
		System.out.println("Nomor Identitas : " + person1.noiden);
		System.out.println("Nama  :" + person2.nama);
		System.out.println("Nomor Identitas  :" + person2.noiden);
	}
}
