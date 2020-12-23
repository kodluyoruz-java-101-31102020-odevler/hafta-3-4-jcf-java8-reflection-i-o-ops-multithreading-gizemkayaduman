package soru2;

import java.util.Comparator;

public class BookComparatorByNumberPage implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		int book1NumberPages = book1.getNumberPages();
		int book2NumberPages = book2.getNumberPages();
		
		
		// Integer.compare(book1PublishYear, book2PublishYear);
		
		if(book2NumberPages > book1NumberPages) {
			return -1;
		}
		else if(book1NumberPages > book2NumberPages) {
			return 1;
		}
		else 
			
			return 0;
		
	}

	

}
