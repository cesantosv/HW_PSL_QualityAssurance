package student;

import student.Student;
import java.util.List;
import java.util.Collections;

public class Sorting {
	
	
	public List<Student> sortStudents(List<Student> unsortedStudents){
	
    	 Collections.sort(unsortedStudents); 
    	 
    	 return unsortedStudents;
    }

}
