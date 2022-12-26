package fahima;
import java.util.HashSet;
import java.util.Stack;
import java.util.ArrayList;





public class school {
	school(){
		System.out.println("welcome fahima lets add our first school");
}
	private int numberOfClasses;
	private String Name;
	private String Loction;
	        int departmentListLength;
	        int department() {
	        	return 0;
	        }
	     
	        
	        
	       
	
		Department department = new Department();
		
	ArrayList<Department> departmentList=new ArrayList<>();

	

	public ArrayList<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(ArrayList<Department> departmentList) {
		this.departmentList = departmentList;
	}

	void assginDepartment(int numberOfDepartment) {
		departmentListLength = numberOfDepartment;
		for(int i =0;i<numberOfDepartment;i++) {
			departmentList.add(new Department());
		}
	}
		 HashSet<Integer> Set= new HashSet<>();
		 
		    void assignList() {
		    	Set.add(1);
		    	Set.add(5);
		    	Set.add(1);
		    	Set.add(3);
		    	Set.add(2);
		    	Set.add(3);
		    	
		    	
		    	
		       
		        System.out.println(Set);
		        
		    }

			public int getNumberOfClasses() {
				return numberOfClasses;
				
			}

			public void setNumberOfClasses(int numberOfClasses) {
				this.numberOfClasses = numberOfClasses;
			}

			public String getName() {
				return Name;
			}

			public void setName(String name) {
				Name = name;
			}

			public String getLoction() {
				return Loction;
			}

			public void setLoction(String loction) {
				Loction = loction;
			}
			
			
			
}


		


