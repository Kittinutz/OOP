public class Mybook{
	public static void main(String[] args){
		Book   mybook1; 
		mybook1 = new Book(); 
		Book mybook2;
		mybook2 = new Book("Java Programming");
		Book mybook3;
		mybook3 = new Book("C Programming",500);
		

		mybook1.setTitle("OOP");
		mybook1.setPagenumber(1000);
		mybook2.setTitle("Netwrok");
		mybook2.setPagenumber(600);
	

		mybook1.showbook();
		mybook2.showbook();
		mybook3.showbook();
		mybook1.setAuthor("JK");
		mybook1.showbook();
		if(mybook1.sameBook("oop",100,"JK")){
			 System.out.println("true");

		}else{
			 System.out.println("flase");
		}
	}
}