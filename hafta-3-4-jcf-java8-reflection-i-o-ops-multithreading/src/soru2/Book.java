package soru2;

public class Book implements Comparable<Book> {

	private String bookName;
	private int numberPages;
	private String authorName;
	private int releasaDate;

	public Book(String bookName, int numberPages, String authorName, int releasaDate) {
		this.bookName = bookName;
		this.numberPages = numberPages;
		this.authorName = authorName;
		this.releasaDate = releasaDate;
	}

	@Override
	public int compareTo(Book book) {

		return this.getBookName().compareTo(book.getBookName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + numberPages;
		result = prime * result + releasaDate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (numberPages != other.numberPages)
			return false;
		if (releasaDate != other.releasaDate)
			return false;

		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(this.getBookName());
		builder.append(" - ");
		builder.append(this.getNumberPages());
		builder.append(" - ");
		builder.append(this.getAuthorName());
		builder.append(" - ");
		builder.append(this.getReleasaDate());
		builder.append("]");
		return builder.toString();
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getReleasaDate() {
		return releasaDate;
	}

	public void setReleasaDate(int releasaDate) {
		this.releasaDate = releasaDate;
	}

}
