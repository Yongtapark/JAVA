package java1028;

public class Book {
	//인스턴스멤버변수:객체 생성 후 객체명.필드로 접근,객체마다 개별값
	String title;
	String author;
	int ISBN;
	
	//클래스멤버변수, 클래스명.필드명 클래스 메모리 영역에 잡힘, 모든객체들이 같은 값을 공유
	static int value;

	//인자값이 있는 생성자
	public Book(String title,String author, int ISBN) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		System.out.println("인자값이 있는 생성자");
	}
	//기본생성자
	public Book() {
		System.out.println("기본생성자");
	}
	//setter()필드값 저장
	public void SetTitle(String title) {
		this.title=title;
	}
	public void SetAuthor(String author) {
		this.author=author;
	}
	public void SetISBN(int ISBN) {
		this.ISBN=ISBN;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getISBN() {
		return ISBN;
	}
	
	
	public static void main(String[]args) {
		Book javaBook=new Book("자바","황기태",333);
		System.out.println("변경 전 책가격 :"+value);
		value=20000;
		System.out.println("책가격 :"+value);
		//메소드 호출 / 출력
		javaBook.disp(javaBook);
		
//		System.out.println(javaBook); //요렇게 하면 java1028.Book@7d6f77cc 가 나옴
//		System.out.println("책제목 :"+javaBook.title);
//		System.out.println("저자 :"+javaBook.author);
//		System.out.println("바코드 :"+javaBook.ISBN);
		Book javaBook2=new Book("하하","박길동",1234);
		javaBook2.disp(javaBook2);	
		
		Book javaBook3=new Book("가나","다라",12345);
		//멤버변수들을 직접 초기화
		javaBook3.title="가나ek";
		javaBook3.author="skek";
		javaBook3.ISBN=12;
		javaBook3.disp(javaBook3);
		javaBook.value=30000;
		System.out.println("책가격 :"+value);
		
		
		
		Book javaBook4=new Book("가나","다라",12345);
		//setter로 초기화
		javaBook4.SetTitle("초콜릿");
		javaBook4.SetAuthor("초콜릿2");
		javaBook4.SetISBN(12);
		//static 메소드로 출력
		disp2(javaBook4);
		System.out.println("책가격 :"+value);
//		Book.disp2(javaBook4);//가능
//		javaBook4.disp2(javaBook4);//가능
		
	}
	public void disp(Book javaBook) {
		System.out.println("책제목 :"+javaBook.title);
		System.out.println("저자 :"+javaBook.author);
		System.out.println("바코드 :"+javaBook.ISBN);
		
	}
	public static void disp2(Book javaBook) {
		System.out.println("책제목 :"+javaBook.getTitle());
		System.out.println("저자 :"+javaBook.getAuthor());
		System.out.println("바코드 :"+javaBook.getISBN());
	}
}
