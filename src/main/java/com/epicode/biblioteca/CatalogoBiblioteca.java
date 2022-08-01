package com.epicode.biblioteca;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import java.util.Map;	

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.testi.Libro;

import com.epicode.testi.TestoAbstract;

public class CatalogoBiblioteca implements Catalogo {
 Logger log = LoggerFactory.getLogger(CatalogoBiblioteca.class);
	private Map<String, TestoAbstract> catalogo = new HashMap<>();
	
	@Override
	public void addTesto(TestoAbstract t) {
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
	TestoAbstract t =	catalogo.get(isbn);
		log.debug("elemento trovato");
		System.out.println(t);
		log.trace("Metodo terminato");
	}

	@Override
	public void searchYear(int year) {
	log.debug(" Ricerca Elemento ");
	 catalogo.values()
	 .stream().filter( ele -> year == ele.getAnnoPubblicazione())
	 .forEach(ele-> System.out.println(ele));
	 log.trace("Metodo terminato");
	 
	}

	@Override
	public void searchAuthor(String author) {
	log.debug(" Ricerca Elemento ");
	 catalogo.values().stream().filter(ele-> ele instanceof Libro)
	 .map(ele->(Libro)ele)
	 .filter(ele -> author.equals(ele.getAutore()))
	 .forEach(ele->System.out.println(ele));
	 log.trace("Metodo terminato");
		
	}
 
	@SuppressWarnings("deprecation")
	@Override
	public void saveFile() {
      	File file = new File("Memory/archivio.txt");
      	String txt = "";
      for (TestoAbstract ele : catalogo.values()) {
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
