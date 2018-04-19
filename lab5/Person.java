public class Person{
	protected String name;
	protected int age;
	public Person(){

	}
	public Person(String name ,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;

	}
	public int getAge(){
		return this.age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void printDetails(){
		System.out.println("Name: "+this.name+" "+"age: "+this.age);
	}
}