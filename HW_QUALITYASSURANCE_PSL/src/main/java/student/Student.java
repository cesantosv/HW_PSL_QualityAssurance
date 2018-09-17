package student;

import java.util.Arrays;
import student.Sorting;



public class Student implements Comparable<Student>{
	
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	
	//Sort students.
	public int compareTo(Student s){
		//Sort with the double.
		if(s.cgpa > this.cgpa){
			return 1;
		}
		else if(s.cgpa < this.cgpa){
			return -1;
			
		}
		else{
			if(s.fname.compareTo(this.fname) > 0){
				return -1;
			}
			else if(s.fname.compareTo(this.fname) < 0){
				return 1;

			}
			else {
				if(s.id > this.id){
					return -1;
				}
				else if(s.id < this.id){
					return 1;
				}
				else{
					return 0;
				}
			}    
		}
	}
	
	public String toString(){
		return this.id +"  " + this.fname + " " + this.cgpa;
		
	}
	
	
	
	
	
	
	
    
}
