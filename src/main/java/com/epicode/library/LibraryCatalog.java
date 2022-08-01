package com.epicode.library;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import java.util.Map;	

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.publication.Book;
import com.epicode.publication.PublicationAbstract;

public class LibraryCatalog implements Catalog {
 Logger log = LoggerFactory.getLogger(LibraryCatalog.class);
	private Map<String, PublicationAbstract> catalogo = new HashMap<>();
	
	@Override
	public void addPublication(PublicationAbstract t) {
		catalogo.put(t.getIsbn(), t);
	log.debug("File aggiutno con successo");
	log.trace("Metodo terminato");
        
	}

	@Override
	public void removeFromIsbn(String isbn) {
		catalogo.remove(isbn);
		log.debug("Elemento:"+ isbn +"rimosso");
		log.trace("Metodo terminato");
	}

	@Override
	public void searchIsbn(String isbn) {
	PublicationAbstract t =	catalogo.get(isbn);
		log.debug("elemento trovato");
		System.out.println(t);
		log.trace("Metodo terminato");
	}

	@Override
	public void searchYear(int year) {
	log.debug(" Ricerca Elemento ");
	 catalogo.values()
	 .stream().filter( ele -> year == ele.getYearOfPublication())
	 .forEach(ele-> System.out.println(ele));
	 log.trace("Metodo terminato");
	 
	}

	@Override
	public void searchAuthor(String author) {
	log.debug(" Ricerca Elemento ");
	 catalogo.values().stream().filter(ele-> ele instanceof Book)
	 .map(ele->(Book)ele)
	 .filter(ele -> author.equals(ele.getAuthor()))
	 .forEach(ele->System.out.println(ele));
	 log.trace("Metodo terminato");
		
	}
 
	@SuppressWarnings("deprecation")
	@Override
	public void saveFile() {
      	File file = new File("Memory/archivio.txt");
      	String txt = "";
      for (PublicationAbstract ele : catalogo.values()) {
    	  	txt+= ele.toString();
	}
     try {
		FileUtils.writeStringToFile(file, txt);
	} catch (IOException e) {
			log.error("Memoria Piena");
		e.printStackTrace();
	}	
     log.trace("Metodo terminato");
	}

	@Override
	public void uploadFile() {
		File file = new File("Memory/archivio.txt");
		try {
			String fileData = FileUtils.readFileToString(file, "UTF-8");
			System.out.println(fileData);
		} catch (IOException e) {
			log.error("File non trovato o corrotto");
			e.printStackTrace();
		}
		log.trace("Metodo terminato");
	}
	
	
	
	@Override
	public String toString() {
		return "CatalogoBiblioteca [catalogo=" + catalogo + ", toString()=" + super.toString() + "]";
	}


	


		
}
