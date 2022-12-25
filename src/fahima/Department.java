package fahima;

import java.util.ArrayList;

public class Department {
	private int noOfTeachers;
	private int ID;
	private String name;
	int teacherlistlength;
	
	
	
	
	Teacher teacher= new Teacher();
	
	
	ArrayList<Teacher> teacherlist=new ArrayList<Teacher>();

	void assginTeacher(int numberOfTeacher) {
		teacherlistlength = numberOfTeacher;
		for(int i =0;i<numberOfTeacher;i++) {
			teacherlist.add(new Teacher());		}
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



	