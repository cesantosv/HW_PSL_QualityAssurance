package test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import student.Student;
import student.Sorting;
import student.Main;

public class StudentTesting {

	String prueba;
	
	List <Student> unsortedStudentsTest;
	
	Sorting sortStudent;
	
	@Before
	public void setUp() throws Exception {
		
		unsortedStudentsTest = new ArrayList<Student>();
		sortStudent = new Sorting();
	    
	}
	
	@Test
	public void testObjects() {
	    assertNotNull("List should not be null",unsortedStudentsTest); 
	    assertNotNull("Object should not be null",sortStudent);
	    
	}
	
	/**
	 * 
	 * 
	 * This method is in charge of testing the method getCgpa of Student.
	 */
	@Test
	public void testGetCgpa() {
		
		Student testStudent = new Student(1, "test" , 8.444444);
		
		double expected = 8.444444;
		
		assertEquals(expected,testStudent.getCgpa(), 0.00001);
        
	}
	
	@Test
	public void testCallToMethod() {
		
		List <Student> unsortedSTest = new ArrayList<Student>();
		
	    List <Student> retornedList = sortStudent.sortStudents(unsortedSTest);
	    
	    assertNotNull("Retorned list from method should not be null", retornedList);
	    
	}
	
	
	
    @Test
    public void testCreationOfInstance() {
    	
    	Student testStudent = new Student(007,"TestStudent", 8.99);
    	assertNotNull("The student should be created and not be null", testStudent);
    		
    }

	 /**
	 * FIRST TEST CASE:  This method of testing is in charge of testing if a 
	 * list in sorted by the attribute CGPA
	 * 
	 * 
	 * Scenario: Sort an array of Students.
	 * 
	 * Given an Array of Six Students with the following data:
	 * 
	 *  id: 5 fname: Rumpa cgpa: 5.3
	 *  id: 1 fname: Ashis cgpa: 6.3
	 *  id: 4 fname: MaryJane cgpa: 4.3 
	 *  id: 3 fname: Spiderman cgpa: 7.3
	 *  id: 6 fname: Samara cgpa: 1.3
	 *  id: 2 fname: TonyStark cgpa: 3.3
	 * 
	 * 
	 *  When I use the method to sort those students.
	 *  
	 *  Then I should expect the following output ordered descendent by cgpa:
	 *  
	 *  id: 3 fname: Spiderman cgpa: 7.3
	 *  id: 5 fname: Rumpa cgpa: 5.3
	 *  id: 1 fname: Ashis cgpa: 6.3
	 *  id: 4 fname: MaryJane cgpa: 4.3 
	 *  id: 2 fname: TonyStark cgpa: 3.3
	 *  id: 6 fname: Samara cgpa: 1.3
	 *  
	 *  And The size of the sorted List should be 6.
	 *  
	 */
	@Test
	public void testSortByCGPA(){

		unsortedStudentsTest.add(new Student(5,"Rumpa",5.3));
		unsortedStudentsTest.add(new Student(1,"Ashis",6.3));
		unsortedStudentsTest.add(new Student(4,"MaryJane",4.3));
		unsortedStudentsTest.add(new Student(3,"Spiderman",7.3));
		unsortedStudentsTest.add(new Student(6,"Samara",1.3));
		unsortedStudentsTest.add(new Student(2,"TonyStark",3.3));
		
		//Call to method.
		
		List<Student> response = sortStudent.sortStudents(unsortedStudentsTest);
		
		//Test if the size is correct.
		assertEquals(6,response.size());
		
		//Testing Sorting.
		
		assertEquals("Spiderman", response.get(0).getFname());  // cgpa: 7.3
		assertEquals("Ashis", response.get(1).getFname());  // cgpa: 6.3
		assertEquals("Rumpa", response.get(2).getFname()); // cgpa: 5.3
		assertEquals("MaryJane", response.get(3).getFname()); // cgpa: 4.3
		assertEquals("TonyStark", response.get(4).getFname()); // cgpa : 3.3
		assertEquals("Samara", response.get(5).getFname()); //cgpa: 1.3
		
	}
	

	 /***
	 * SECOND TEST CASE:  This method of testing is in charge of testing if a 
	 * list in sorted having in count that we have cases with equal cgpa and different fname.
	 * 
	 * 
	 * Scenario: Sort an array of Students.
	 * 
	 * Given an Array of Six Students with the following data:
	 * 
	 *  id: 1 fname: WarMachine cgpa: 6.3
	 *  id: 5 fname: AmericanCaptain cgpa: 6.3
	 *  id: 4 fname: MaryJane cgpa: 4.3 
	 *  id: 3 fname: Spiderman cgpa: 7.3
	 *  id: 6 fname: Thor cgpa: 1.3
	 *  id: 2 fname: TonyStark cgpa: 1.3
	 * 
	 * 
	 *  When I use the method to sort those students 
	 *  
	 *  Then I should expect the following output ordered descendent by cgpa and alfabethical ordered by fname
	 *  if we have equal cgpa.
	 * 
	 *  
	 *  id: 3 fname: Spiderman cgpa: 7.3
	 *  id: 5 fname: AmericanCaptain cgpa: 6.3
	 *  id: 1 fname: WarMachine cgpa: 6.3
	 *  id: 4 fname: MaryJane cgpa: 4.3 
	 *  id: 6 fname: Thor cgpa: 1.3
	 *  id: 2 fname: TonyStark cgpa: 1.3|
	 *  
	 *  And The size of the sorted List should be 6.
	 *  
	 ***/
    
	@Test
	public void testSameCGPAandDifferentFname(){
		
		unsortedStudentsTest.add(new Student(1,"WarMachine",6.3));
		unsortedStudentsTest.add(new Student(5,"AmericanCaptain",6.3));
		unsortedStudentsTest.add(new Student(4,"MaryJane",4.3));
		unsortedStudentsTest.add(new Student(3,"Spiderman",7.3));
		unsortedStudentsTest.add(new Student(6,"Thor",1.3));
		unsortedStudentsTest.add(new Student(2,"TonyStark",1.3));
		
		
		//Call to method.
		List<Student> response = sortStudent.sortStudents(unsortedStudentsTest);	
		//Test Size.
		
		assertEquals(6,response.size());
	
		//Testing Sorting
		
		assertEquals(3, response.get(0).getId());  // Expected id = 3 - fname: Spiderman
		assertEquals(5, response.get(1).getId());  // Expected id = 5 - fname: AmericanCaptain 
		assertEquals(1, response.get(2).getId()); // Expected id = 1 - fname: WarMachine 
		assertEquals(4, response.get(3).getId()); // Expected id: 4  - fname: MaryJane 
		assertEquals(6, response.get(4).getId()); // Expected id: 6  - fname: Thor 
		assertEquals(2, response.get(5).getId()); //Expected id: 2  - fname: TonyStark
			
	}
	
	
	 /***
	 * THIRD TEST CASE:  This method of testing is in charge of testing if a 
	 * list in sorted having in count that we have cases with equal cgpa, equal fname, so in that case
	 * it's necessary to order by id.
	 * 
	 * 
	 * Scenario: Sort an array of Students.
	 * 
	 * Given an Array of Six Students with the following data:
	 * 
	 *  id: 4 fname: abce cgpa: 5.2
	 *  id: 3 fname: abcef cgpa: 5.2
	 *  id: 6 fname: abce cgpa: 5.2 
	 *  id: 5 fname: abce cgpa: 5.2
	 *  id: 1 fname: jamiroquai cgpa: 7.3
	 *  id: 2 fname: abce cgpa: 5.2
	 * 
	 * 
	 *  When I use the method to sort those students 
	 *  
	 *  Then I should expect the following output ordered descendent by cgpa and alfabethical ordered by fname
	 *  if we have equal cgpa and ordered by id if we have cases with equal cgpa and fname.
	 * 
	 *  
	 *  id: 1 fname: jamiroquai cgpa: 7.3
	 *  id: 2 fname: abce cgpa: 5.
	 *  id: 4 fname: abce cgpa: 5.2
	 *  id: 5 fname: abce cgpa: 5.2
	 *  id: 6 fname: abce cgpa: 5.2 
	 *  id: 3 fname: abcef cgpa: 5.2
	 *  
	 *  And The size of the sorted List should be 6.
	 *  
	 ***/
     @Test
     public void testSameCGPASameFnameandDifferentId(){
    	 
    	 
 		unsortedStudentsTest.add(new Student(4,"abce",5.2));
 		unsortedStudentsTest.add(new Student(3,"abcef",5.2));
 		unsortedStudentsTest.add(new Student(6,"abce",5.2));
 		unsortedStudentsTest.add(new Student(5,"abce",5.2));
 		unsortedStudentsTest.add(new Student(1,"jamiroquai",7.3));
 		unsortedStudentsTest.add(new Student(2,"abce",5.2));
 		
 		
        //Call to method.
		
		
	    List<Student> response = sortStudent.sortStudents(unsortedStudentsTest);
	    
	    //Test Size.
	 	
	    assertEquals(6,response.size());
	    
	    //Test Sorting.
	    
		assertEquals(1, response.get(0).getId());  // Expected id = 1 - fname: jamiroquai
		assertEquals(2, response.get(1).getId());  // Expected id = 2 - fname: abce 
		assertEquals(4, response.get(2).getId()); // Expected id = 4 - fname: abce 
		assertEquals(5, response.get(3).getId()); // Expected id: 5 - fname: abce
		assertEquals(6, response.get(4).getId()); // Expected id: 6 - fname: abce 
		assertEquals(3, response.get(5).getId()); //Expected id: 3 - fname: abcef
		
     }

}
