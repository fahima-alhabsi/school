package fahima;

import java.util.ArrayList;

public class course {
	private int noOfCourses;
	private String name;
	private int markes;
	int Marklistlength;
	Mark mark =new Mark();
	

	ArrayList<Mark> marklist=new ArrayList<Mark>();

	void assginMark(int numberOfMark) {
		Marklistlength = numberOfMark;
		for(int i =0;i<numberOfMark;i++) {
			marklist.add(new Mark());		}
	}
	

	boolean Fail(){
		if (markes<20) {
			return false;
		
		}
		else {
			return true;
		}
		}
	public int getNoOfCourses() {
		return noOfCourses;
	}
	public void setNoOfCourses(int noOfCourses) {
		this.noOfCourses = noOfCourses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarkes() {
		return markes;
	}
	public void setMarkes(int markes) {
		this.markes = markes;
	}

	







}//this for closing class student


