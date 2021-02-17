package soru5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {

		Book book1 = new Book("kitap1", 120, "Gizem Kayaduman", 1998);
		Book book2 = new Book("kitap2", 75, "Ahmet Yıldız", 2009);
		Book book3 = new Book("kitap3", 350, "Aslı Ayrık", 1988);
		Book book4 = new Book("kitap4", 256, "Fatma Keskin", 2020);
		Book book5 = new Book("kitap5", 50, "Ayşe Taş", 2003);
		Book book6 = new Book("kitap6", 321, "Hasan Yıldız", 1999);
		Book book7 = new Book("kitap7", 532, "Ferhat Kayaduman", 2013);
		Book book8 = new Book("kitap8", 65, "Feyza Kül", 2007);
		Book book9 = new Book("kitap9", 135, "Furkan Ağır", 1962);
		Book book10 = new Book("kitap10", 99, "Cengiz Orman", 1990);

		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6);
		bookList.add(book7);
		bookList.add(book8);
		bookList.add(book9);
		bookList.add(book10);

		Stream<Book> stream = bookList.stream();
		Consumer<? super Book> printer = (book) -> {
			System.out.println(book);
		};
		stream.forEach(printer);

		Predicate<Book> greaterThan100 = (book) -> {

			if (book.getNumberPages() > 100) {
				return true;
			}

			return false;
		};

		Set<Book> greaterThan100List = bookList.stream().filter(greaterThan100).collect(Collectors.toSet());

		Consumer<Book> bookPrinter = (book) -> System.out.println(book);

		System.out.println("\n\nSayfa sayısı 100'den fazla olan kitaplar\n");
		greaterThan100List.stream().forEach(bookPrinter);
	}

}
