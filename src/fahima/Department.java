package fahima;

import java.util.ArrayList;

public class Department {
	
	
	Department(){
		System.out.println("Hello HR");
	}
	private int noOfTeachers;
	private int ID;
	private String name;
	int teacherlistlength;
	
	
Teacher teacher= new Teacher("fahima", 31);
	
	
	ArrayList<Teacher> teacherlist=new ArrayList<>();
	
	

	public ArrayList<Teacher> getTeacherlist() {
		return teacherlist;
	}






	public void setTeacherlist(ArrayList<Teacher> teacherlist) {
		this.teacherlist = teacherlist;
	}






	void assginTeacher(int numberOfTeacher) {
		teacherlistlength = numberOfTeacher;
		for(int i =0;i<numberOfTeacher;i++) {
			teacherlist.add(new Teacher("fahima", 31));		}
	}
	
	
	



	public int getNoOfTeachers() {
		return noOfTeachers;
	}


	public void setNoOfTeachers(int noOfTeachers) {
		this.noOfTeachers = noOfTeachers;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	


	    

}



	