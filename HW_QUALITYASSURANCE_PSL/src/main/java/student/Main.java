package student;
import student.Student;
import java.util.*;
import student.Sorting;


public class Main {
	
	
	public static void main(String [] args){
		
        Main m = new Main();
		
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
	
		List <Student>unsortedStudents = new ArrayList<Student>();
		
		int cases = in.nextInt();
	
		for(int i = 1; i <= cases; i++){
			
			short id = in.nextShort();
			String fname = in.next();
			double cgpa = in.nextDouble();

			
			Student s = new Student(id, fname, cgpa);
			
			unsortedStudents.add(s);
		}
		
	    List<Student> sortedStudents = m.getSortedStudents(unsortedStudents);
	    
	    for(Student st: sortedStudents){
			System.out.println(st.toString());
		}
		
		in.close();
		
	}
	
	
	public List<Student> getSortedStudents(List<Student> unsortedStudents){
		
		
		Sorting instanceSorting = new Sorting();
		
        List<Student> sortedStudents = instanceSorting.sortStudents(unsortedStudents);
        
		return sortedStudents;
		
	}
	
	

}
