public class Employee extends Person{
	protected String employeeId;
	
	public Employee(){
		super();
	}
	public  Employee(String name,int age,String employeeId){
		super(name,age);
		this.employeeId = employeeId;
	}
	public String getEmployee(){
		return this.employeeId;
	}
	public void setEmployee(String employeeId){
		this.employeeId = employeeId;
	}
	public void printDetails(){
		super.printDetails();
		System.out.println("Employee Id: " + this.employeeId);
	}
}