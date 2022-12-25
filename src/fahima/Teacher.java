package fahima;

import java.util.ArrayList;


public  class Teacher {
	private int ID;
	private int age;
	private String name;
	int studentlistlength;
	
	
	student student= new student();
	ArrayList<student> studentlist=new ArrayList<student>();

	void assginstudent(int numberOfStudent) {
		studentlistlength = numberOfStudent;
		for(int i =0;i<numberOfStudent;i++) {
			studentlist.add(new student()); 
			}
	}
	
	void teach(){
		System.out.println("teach");
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public Teacher get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}


