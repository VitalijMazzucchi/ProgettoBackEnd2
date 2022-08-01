package com.epicode.library;

import com.epicode.publication.Book;
import com.epicode.publication.Magazine;
import com.epicode.publication.Periodicity;

public class Main {

	public static void main(String[] args) {
		Magazine gossip = new Magazine("0", "Gossip", 2022, 100, Periodicity.MENSILE);
		Magazine sport = new Magazine("1", "SportMania", 1987, 15, Periodicity.SEMESTRALE);
		Magazine scenza = new Magazine("2", "Scenza con la i", 2020, 50, Periodicity.SETTIMANALE);

        Book l1 = new Book("3", "La storia Finita", 1800, 1, "Micheal Ende", "fantascenza");
        Book l2 = new Book("4", "L uomo che sussurrava ai passanti", 2022, 150, "Bill Vocegrossa", "Thriller");
        Book l3 = new Book("5", "il signore degli spiccioli", 2007, 500, "Mone tina", "Biografia");
        
        Catalog b = new LibraryCatalog();
        b.addPublication(gossip);
        b.addPublication(sport);
        b.addPublication(scenza);
        
        b.addPublication(l1);
        b.addPublication(l2);
        b.addPublication(l3);
        
        b.searchAuthor("Mone tina");
        b.searchIsbn("0");
        b.searchYear(1800);
        b.saveFile();
        b.uploadFile();
	}

}
