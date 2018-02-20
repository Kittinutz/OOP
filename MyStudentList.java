public class MyStudentList{
	public static void main(String[] args){
		StudentList PhuketWit = new StudentList();
		StudentList PSUWit = new StudentList();

		Student st = new Student("5635512014","Kittinut",4.00);
		Student st2 = new Student("5522771484","Teddy",1.98);
		Student st3 = new Student("123456713","Bear",3.95);
		Student st4 = new Student("3399003312","Payuth",3.45);
		Student st5 = new Student("3399002313","Pawit",1.93);
		
		PhuketWit.addStudent(st);
		PhuketWit.addStudent(st3);
		PSUWit.addStudent(st2);
		PSUWit.addStudent(st4);
		PSUWit.addStudent(st5);

		PhuketWit.showAllStudentInfo();
		PSUWit.showAllStudentInfo();
		System.out.println(PSUWit.searchStudentBystCode("3399003312"));
		System.out.println(PhuketWit.searchStudentBystCode("123456777"));
		System.out.println(PSUWit.removeStudentBystCode("3399002313"));
		PSUWit.showAllStudentInfo();
	}
}