import java.util.*;
public class Mainlabfive {
	public static void main(String [] args){
		ArrayList<Person> personlist = new ArrayList<Person>();
		Person p = new Person("Person",1);
		Teacher t = new Teacher("Teacher",2,"coe");
		Employee e = new Employee("Employee",3,"563xx12014");
		PermanentEmployee pe = new PermanentEmployee("PermanentEmployee",4,"563xx12014",549000);
		ContractEmployee cp = new ContractEmployee("ContractEmployee",5,"56355xx1214",53900);
		p.printDetails();
		t.printDetails();
		e.printDetails();
		pe.printDetails();
		cp.printDetails();
		personlist.add(p);
		personlist.add(t);
		personlist.add(e);
		personlist.add(pe);
		personlist.add(cp);
		for (int i = 0;i < personlist.size();i++ ) {
			personlist.get(i).printDetails();	
		}

	}
}