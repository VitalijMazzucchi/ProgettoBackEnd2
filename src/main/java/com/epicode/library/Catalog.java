package com.epicode.library;






import com.epicode.publication.PublicationAbstract;

public interface Catalog {
		void addPublication(PublicationAbstract t);
		void removeFromIsbn(String isbn);
		void searchIsbn(String isbn);
		void searchYear(int year);
		void searchAuthor(String author);
		void saveFile();
		void uploadFile();

		}
