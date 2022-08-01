package com.epicode.publication;

public abstract class PublicationAbstract {
	private String isbn;
	private String title;
	private int yearOfPublication;
	private int numberpages
	;
	public PublicationAbstract(String isbn, String titolo, int yearOfPublication, int numberpages) {
		super();
		this.isbn = isbn;
		this.title = titolo;
		this.yearOfPublication = yearOfPublication;
		this.numberpages = numberpages;
	}
	

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getYearOfPublication() {
		return yearOfPublication;
	}


	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}


	public int getNumberpages() {
		return numberpages;
	}


	public void setNumberpages(int numberpages) {
		this.numberpages = numberpages;
	}


	@Override
	public String toString() {
		return "TestoAbstract [isbn=" + isbn + ", titolo=" + title + ", annoPubblicazione=" + yearOfPublication
				+ ", numeroPagine=" + numberpages + "]";
	}

	
	
}
