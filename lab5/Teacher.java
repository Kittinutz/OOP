public class Teacher extends Person{
	private String faculty;

	public Teacher(){
		super();
	}
	public Teacher(String name,int age,String f){
		super(name,age);
		this.faculty =f;
	}
	public String getFaculty(){
		return faculty;
	}
	public void setFaculty(String faculty){
		this.faculty = faculty;
	}
	public void printDetails(){
		super.printDetails();
		System.out.println("faculty:"+this.faculty);
	}
}