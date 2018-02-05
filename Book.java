public class Book{
	private String title;
	private int pagenumber;
	private String Author;
	public Book(String title,int pagenumber,String Author){
		//รับ title pangenumber author
		this.title  = title;
		this.pagenumber = pagenumber;
		this.Author = Author;
	}
	public Book(String title, int pagenumber){
		//รับ  title pagenumber
		this.title  = title;
		this.pagenumber = pagenumber;
	}
	public Book(String title){
		//รับแค่ title
		this.title = title;
	}
	public Book(){
		//ไม่รับอะไรเลย

	}
	public String getTitle(){
		return title;
	}
	public int getPagenumber(){
		return pagenumber;
	}
	public String getAuthor(){
		return Author;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setPagenumber(int pagenumber){
		this.pagenumber = pagenumber;
	}
	public void setAuthor(String Author){
		this.Author = Author;
	}
	public void showbook(){
		System.out.println(title+':'+pagenumber+':'+Author);
	}
	public boolean sameBook(String title, int pagenumber, String Author){
		if (this.title == title && this.pagenumber == pagenumber && this.Author == Author) {
			return true;
		}
		else{
			return false;
		}
	}
}