package com.epicode.biblioteca;






import com.epicode.testi.TestoAbstract;

public interface Catalogo {
		void addTesto(TestoAbstract t);
		void removeFromIsbn(String isbn);
		void searchIsbn(String isbn);
		void searchYear(int year);
		void searchAuthor(String author);
		void saveFile();
		void uploadFile();

		}
