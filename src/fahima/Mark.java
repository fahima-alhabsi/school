package fahima;

import java.io.Serializable;
import java.util.ArrayList;

public class Mark implements Serializable{
	boolean state;
	private String subjectName;
	boolean pass (int mark) {
		if (mark>15) {
			return true;
		}
		else {
			return false;
		}
		
			
		}
	
	public String getSubjectName() {
		return subjectName;
		
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	

	


	
}