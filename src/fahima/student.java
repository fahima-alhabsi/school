package fahima;

import java.util.ArrayList;

public class student {
	private int noOfStudents;
	private String ID;
	private int age;
	private String name;
	int courselistlength;
	int courselist;
	
	course course = new course();
	
	ArrayList<course> Courselist=new ArrayList<course>();
	
	
	
	public ArrayList<course> getCourselist() {
		return Courselist;
	}




	public void setCourselist(ArrayList<course> courselist) {
		Courselist = courselist;
	}




	void assgincourse(int numberOfCourse) {
		courselistlength = numberOfCourse;
		for(int i =0;i<numberOfCourse;i++) {
			Courselist.add(new course());		
			}
	}

	
	
	
	void study () {
		System.out.print("study");
		
	}
	

	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public String getID() {
		return ID;
	}
	public void setID(String studentID) {
		ID = studentID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

