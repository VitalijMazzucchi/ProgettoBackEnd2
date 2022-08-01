package com.epicode.publication;

public class Magazine extends PublicationAbstract {

	private Periodicity periodicity;

	public Magazine(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicity periodicity) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.periodicity = periodicity;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicity + ", toString()=" + super.toString() + "]";
	}
	

 
}
