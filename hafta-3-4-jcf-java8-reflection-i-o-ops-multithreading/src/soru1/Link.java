package soru1;

public class Link <T> {
	
	public T veri; // Düğüme gelecek olan veri
	public Link<T> sonraki; // Listede sonraki düğüm
	public Link<T> onceki; // Listede önceki düğüm
	

	public Link(T d) 
	{
		this.veri = d;
	}


	public void listele() 
	{
		System.out.print(veri + " ");
	}

}
