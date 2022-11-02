package java221102test;

public class Book extends Product{
	private int ISBN;		//ISBN번호
	private String title;	//책제목
	private String author;	//저자

	public Book(int productID, String description, String maker, int price
			,int ISBN ,String title, String author) {
		super(productID, description, maker, price);
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
		
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("--------------------------");
		System.out.println("ISBN>> "+ISBN);
		System.out.println("책제목>> "+title);
		System.out.println("저자>> "+author+"\n");
	}
}
