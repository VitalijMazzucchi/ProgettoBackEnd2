package com.epicode.publication;

public class Book extends PublicationAbstract {
private String author;
private String literaryGenre;
public Book(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String author, String genere) {
	super(isbn, titolo, annoPubblicazione, numeroPagine);
	this.author = author;
	this.literaryGenre = genere;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getLiteraryGenre() {
	return literaryGenre;
}
public void setLiteraryGenre(String literaryGenre) {
	this.literaryGenre =literaryGenre;
}
@Override
public String toString() {
	return "Libro [autore=" + author + ", genere=" + literaryGenre + ", toString()=" + super.toString() + "]";
}


}
