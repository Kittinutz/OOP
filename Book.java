public class Book{
	private String title;
	private int pagenumber;
	private String Author;
	public Book(String title,int pagenumber,String Author){
		this.title  = title;
		this.pagenumber = pagenumber;
		this.Author = Author;
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
		System.out.printn(title+':'+pagenumber+':'+Author);
	}
}