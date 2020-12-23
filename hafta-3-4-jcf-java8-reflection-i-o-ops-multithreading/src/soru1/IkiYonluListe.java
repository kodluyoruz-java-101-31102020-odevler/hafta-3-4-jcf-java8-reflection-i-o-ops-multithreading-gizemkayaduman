package soru1;

public class  IkiYonluListe <T> {
	
	private Link <T> ilk; // ilk veriyi tutan referans
	private Link <T> son; // son veriyi tutan referans
	// -------------------------------------------------------------

	public IkiYonluListe() 
	{
		this.ilk = null; 
		this.son = null;
	}

	
	public boolean bosMu() 
	{
		return ilk == null;
	}

	
	public void basaEkle(T dd) 
	{
		 Link <T> yeniDugum = new Link<T>(dd); 

		if (bosMu()) 
			son = yeniDugum;
		else
			ilk.onceki = yeniDugum; 
		yeniDugum.sonraki = ilk; 
		ilk = yeniDugum; 
		
	}


	public void sonaEkle(T dd) // Listenin sonuna ekleme fonksiyonu
	{
		Link <T> yeniDugum = new Link<T>(dd); // yeni düğüm oluşturuyoruz.
		if (bosMu()) //Listenin boşluk kontrolü
			ilk = yeniDugum; 
		else {
			son.sonraki = yeniDugum; // son ile yeni düğüm yer değişiyor.
			yeniDugum.onceki = son;
		}
		son = yeniDugum; 
	}


	public Link <T> bastanSil() 
	{
		Link <T> yedek = ilk;
		if (ilk.sonraki == null) 
			son = null; 
		else
			ilk.sonraki.onceki = null; 
		ilk = ilk.sonraki; 
		return yedek;
	}

	
	public Link <T> sondanSil() 
	{ 
		Link <T> yedek = son;
		if (ilk.sonraki == null)
			ilk = null;
		else
			son.onceki.sonraki = null;
		son = son.onceki;
		return yedek;
	}

	public boolean arkasinaEkle(T anahtar, T dd) { 
		Link <T> aktif = ilk;
		while (aktif.veri != anahtar) // Eşleşme bulunana kadar döngü döndürüyoruz
		{
			aktif = aktif.sonraki;
			if (aktif == null)
				return false; // Bulunmayınca false dönüyor
		}
		Link <T> yeniDugum = new Link <T>(dd); // Yeni düğüm oluşturuyoruz

		if (aktif == son) // Eğer son veri ise
		{
			yeniDugum.sonraki = null; // yeni düğüm boşa çıkıyor
			son = yeniDugum;
		} else
		{
			yeniDugum.sonraki = aktif.sonraki; 
						
			aktif.sonraki.onceki = yeniDugum;
		}
		yeniDugum.onceki = aktif; 
		aktif.sonraki = yeniDugum; 
		return true; 
	}

	public Link <T> seciliSil(T anahtar) // Seçili sıradaki elemanı silmek için kullanılan fonksiyon
	{ 
		Link <T> aktif = ilk; 
		while (aktif.veri != anahtar) // Eşleşme bulana kadar
		{
			aktif = aktif.sonraki; // Döngü sürekli bir sonrakine aktarılıyor
			if (aktif == null)
				return null; // eşleşme bulunamadı
		}
		if (aktif == ilk) 
			ilk = aktif.sonraki; 
		else 
				
			aktif.onceki.sonraki = aktif.sonraki;

		if (aktif == son) 
			son = aktif.onceki; 
		else 
			
			aktif.sonraki.onceki = aktif.onceki;
		return aktif; // Bulunan değer döndürülüyor
	}

	public void yazdir() {
		System.out.print("Liste : ");
		Link <T> aktif = ilk; 
		while (aktif != null) // Listenin sonuna kadar kontrol ediliyor
		{
			aktif.listele(); // Veri yazdırılıyor
			aktif = aktif.sonraki; // Döngü döndürülüyor
		}
		System.out.println("");
	}

} 


