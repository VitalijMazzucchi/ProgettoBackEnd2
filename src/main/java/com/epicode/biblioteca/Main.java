package com.epicode.biblioteca;

import com.epicode.testi.Libro;
import com.epicode.testi.Periodicita;
import com.epicode.testi.Rivista;

public class Main {

	public static void main(String[] args) {
		Rivista gossip = new Rivista("0", "Gossip", 2022, 100, Periodicita.MENSILE);
		Rivista sport = new Rivista("1", "SportMania", 1987, 15, Periodicita.SEMESTRALE);
		Rivista scenza = new Rivista("2", "Scenza con la i", 2020, 50, Periodicita.SETTIMANALE);

        Libro l1 = new Libro("3", "La storia Finita", 1800, 1, "Micheal Ende", "fantascenza");
        Libro l2 = new Libro("4", "L uomo che sussurrava ai passanti", 2022, 150, "Bill Vocegrossa", "Thriller");
        Libro l3 = new Libro("5", "il signore degli spiccioli", 2007, 500, "Mone tina", "Biografia");
        
        Catalogo b = new CatalogoBiblioteca();
        b.addTesto(gossip);
        b.addTesto(sport);
        b.addTesto(scenza);
        
        b.addTesto(l1);
        b.addTesto(l2);
        b.addTesto(l3);
        
        b.searchAuthor("Mone tina");
        b.searchIsbn("0");
        b.searchYear(1800);
        b.saveFile();
        b.uploadFile();
	}

}
