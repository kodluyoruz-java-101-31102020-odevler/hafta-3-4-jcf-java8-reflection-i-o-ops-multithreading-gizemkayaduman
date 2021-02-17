package soru1;

public class Application {

	public static void main(String[] args) {
		
		IkiYonluListe<Integer> liste = new IkiYonluListe<Integer>();

		liste.basaEkle(22); 
		liste.basaEkle(44);
		liste.basaEkle(66);

		liste.sonaEkle(11); 
		liste.sonaEkle(33);
		liste.sonaEkle(55);

		liste.yazdir(); 

		liste.bastanSil(); 
		liste.sondanSil(); 
		liste.seciliSil(11); 
		liste.yazdir(); 
		liste.arkasinaEkle(22, 77); 
		liste.arkasinaEkle(33, 88); 

		liste.yazdir(); 
		
		IkiYonluListe<String> liste2 = new IkiYonluListe<String>();

		liste2.basaEkle("a"); 
		liste2.basaEkle("b");
		liste2.basaEkle("c");

		liste2.sonaEkle("d"); 
		liste2.sonaEkle("e");
		liste2.sonaEkle("f");

		liste2.yazdir(); 

		liste2.bastanSil(); 
		liste2.sondanSil(); 
		liste2.seciliSil("a"); 

		liste2.yazdir(); 

		liste2.arkasinaEkle("z", "v"); 
		liste2.arkasinaEkle("y", "z"); 
		liste2.yazdir(); 
	} 
		

	}

