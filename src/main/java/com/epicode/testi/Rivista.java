package com.epicode.testi;

public class Rivista extends TestoAbstract {

	private Periodicita periodicita;

	public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", toString()=" + super.toString() + "]";
	}
	

 
}
