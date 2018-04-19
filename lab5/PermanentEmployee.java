public class PermanentEmployee extends Employee{
	private int Salary;
	public PermanentEmployee(){
		super();
	}
	public PermanentEmployee(String name,int age,String employeeId,int Salary){
		super(name,age,employeeId);
		this.Salary = Salary;
	}
	public int getSalary(){
		return this.Salary;
	}
	public void setSalary(int Salary){
		this.Salary = Salary;
	}
	public void printDetails(){
		super.printDetails();
			System.out.println("Salary: "+ this.Salary);
	}
} 