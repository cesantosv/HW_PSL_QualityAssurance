package test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import student.Student;
import student.Sorting;




public class StudentTesting {

	String prueba;
	
	List <Student> unsortedStudentsTest;
	
	Sorting sortStudent;
	
	@Before
	public void setUp() throws Exception {
		
		unsortedStudentsTest = new ArrayList<Student>();
		sortStudent = new Sorting();
		
		String x = "HOla";
		
	    
	}
	
	@Test
	public void testObjects() {
	    assertNotNull("List should not be null",unsortedStudentsTest); 
	    assertNotNull("Object should not be null",sortStudent);
	    
	}
	
	
	@Test
	public void testCallToMethod() {
		
		List <Student> unsortedSTest = new ArrayList<Student>();
		
	    List <Student> retornedList = sortStudent.sortStudents(unsortedSTest);
	    
	    assertNotNull("Retorned list from method should not be null", retornedList);
	    
	
	}
	/**
	 * 
	 * This method is in charge of testing if a list in sorted by the attribute CGPA
	 * 
	 */
	@Test
	public void testSortByCGPA(){
		/*5
		33 Rumpa 3.68
		85 Ashis 3.85
		56 Samiha 3.75
		19 Samara 3.75
		22 Fahim 3.76*/

		
		unsortedStudentsTest.add(new Student(5,"Rumpa",5.3));
		unsortedStudentsTest.add(new Student(1,"Ashis",6.3));
		unsortedStudentsTest.add(new Student(4,"MaryJane",4.3));
		unsortedStudentsTest.add(new Student(3,"Spiderman",7.3));
		unsortedStudentsTest.add(new Student(6,"Samara",1.3));
		unsortedStudentsTest.add(new Student(2,"TonyStark",3.3));
		
		//Call to method.
		
		List<Student> response = sortStudent.sortStudents(unsortedStudentsTest);
		
		//Testing.
		
		assertEquals("Spiderman", response.get(0).getFname());
		assertEquals("Ashis", response.get(1).getFname());
		assertEquals("Rumpa", response.get(2).getFname());
		assertEquals("MaryJane", response.get(3).getFname());
		assertEquals("TonyStark", response.get(4).getFname());
		assertEquals("Samara", response.get(5).getFname());
		
		
		
		
		
	}
	
	
	
	
	
	
	
	


}
