package soru2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import chapter3.set.interfaces.model.Book;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Set<Book> books = new HashSet<Book>();
		books.add(new Book("Java Book", 300, "Gizem Kayaduman", 2020));
		books.add(new Book("C Book", 250, "Ayşe Tekin", 2019));
		books.add(new Book("React-Native Book", 55, "Aslı Yılmaz", 2010));
		books.add(new Book("PHP Book", 298, "Ömer Kaya", 2018));
		books.add(new Book("Node.js Book", 125, "Ahmet Duman", 1998));
		books.add(new Book("React-Native Book", 55, "Aslı Yılmaz", 2010));
		
		Set<Book> allBooks = new TreeSet<Book>(books);
 
        System.out.println("----A'dan Z'ye kitap ismine göre sıralama----\n");
        for(Book book : allBooks) {
            System.out.println(book);
        }
        
        BookComparatorByNumberPage comparatorByNumberpage = new BookComparatorByNumberPage();
        Set<Book> sortedBooksByNumberPage = new TreeSet<Book>(comparatorByNumberpage);
        sortedBooksByNumberPage.addAll(books);
		
		System.out.println("\n\n----Kitap sayfa sayısına göre sıralama----\n");
		for(Book sortedBook : sortedBooksByNumberPage) {
            System.out.println(sortedBook);
        }
	}
	


}
