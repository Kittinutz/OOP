import java.util.*;

public class StudentList {
	//studentList code
	    private ArrayList<Student> StudentList;


//constructor
public StudentList(){
	this.StudentList = new ArrayList<Student>();
}
//method add student
public void addStudent(Student st){
	this.StudentList.add(st);
}
public int searchStudentBystCode(String stCode){
	int i ;
	for (i = 0 ; i<this.StudentList.size();i++){
		if(this.StudentList.get(i).getCode()==stCode){
			return i;
		}else{
			continue;
		}
	}
	return -1;
}
public boolean removeStudentBystCode(String stCode){
    	if (this.searchStudentBystCode(stCode) != -1) {
    		this.StudentList.remove(this.searchStudentBystCode(stCode));
    		return true;
    	}else {
    		return false;
    	}
    }

//method show all student info 
public void showAllStudentInfo(){
	int i ;
	for (i=0;i<this.StudentList.size();i++){
		System.out.println(this.StudentList.get(i));
	}
}
public int getNumberOfStudent(){
	return this.StudentList.size();
}

}