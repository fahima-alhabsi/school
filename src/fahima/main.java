package fahima;

import java.util.Scanner;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {


Scanner s = new Scanner(System.in);

		ArrayList<school> schoolList = new ArrayList<>();
		school sobj = new school();
		int schI = 0;
		boolean schFlag = true;
System.out.println("hi");
		while (schFlag) {
			System.out.println("first department");
			ArrayList<Department> departmentList = new ArrayList<>();
			Department depobj = new Department();
			boolean depFlag = true;
			int depI = 0;

			schoolList.add(sobj);
			school sclo = schoolList.get(schI);
			System.out.println("pls enter a school name ?");
sclo.setName(s.nextLine());
//sclo.setLoction(s.nextLine());
//sclo.setNumberOfClasses(s.nextInt());
//s.nextLine();
			while (depFlag) {
				System.out.println("first teacher");
				ArrayList<Teacher> teacherlist = new ArrayList<>();
				Teacher techobj = new Teacher();
				boolean teacherFlag = true;
				int teaI = 0;
				departmentList.add(depobj);
				sclo.setDepartmentList(departmentList);
				Department dplo = sclo.getDepartmentList().get(depI);
				
				System.out.println("pls enter a  department name ?");
				dplo.setName(s.nextLine());
				
				
				
				while (teacherFlag) {
					System.out.println("first Student");
					ArrayList<student> studentlist = new ArrayList<>();
					student stdobj = new student();
					int stuI = 0;
					boolean stuFlag = true;
					teacherlist.add(techobj);
					dplo.setTeacherlist(teacherlist);
					Teacher techlo = dplo.getTeacherlist().get(schI);
					
					System.out.println("pls enter a  teacher name ?");
					techlo.setName(s.nextLine());
					
					
					

					while (stuFlag) {
						System.out.println("first course");
						ArrayList<course> Courselist = new ArrayList<>();
						course corobj = new course();
						int corI = 0;
						boolean corFlag = true;
						studentlist.add(stdobj);
						techlo.setStudentlist(studentlist);
						student stdlo = techlo.getStudentlist().get(stuI);

						System.out.println("pls enter a  student name ?");
						stdlo.setName(s.nextLine());
						
						
						
						
						

						while (corFlag) {
							System.out.println("first mark");
							ArrayList<Mark> marklist = new ArrayList<>();
							Mark markobj = new Mark();
							boolean markFlag = true;
							int markI = 0;
							Courselist.add(corobj);
							stdlo.setCourselist(Courselist);
							course corlo = stdlo.getCourselist().get(corI);
							System.out.println("pls enter a  course name ?");
							corlo.setName(s.nextLine());
							
							
							
							
				
							

							while (markFlag) {
								marklist.add(markobj);
								corlo.setMarklist(marklist);
								Mark mo = corlo.getMarklist().get(markI);
								System.out.println("pls enter a  mark name ?");
								mo.setSubjectName(s.nextLine());
								
							
								

								System.out.println("do you want to add mark? yes/no");
								if (s.nextLine().equals("yes")) {
									markI++;
								} else {
									markFlag = false;
								}
							}
							System.out.println("do you want to add course? yes/no");
							if (s.nextLine().equals("yes")) {
								corI++;
							} else {
								corFlag = false;
							}
						}
						System.out.println("do you want to add student? yes/no");
						if (s.nextLine().equals("yes")) {
							stuI++;
						} else {
							stuFlag = false;
						}
					}
					System.out.println("do you want to add teacher? yes/no");
					if (s.nextLine().equals("yes")) {
						teaI++;
					} else {
						teacherFlag = false;
					}
				}
				System.out.println("do you want to add department ? yes/no");
				if (s.nextLine().equals("yes")) {
					depI++;
				} else {
					depFlag = false;
				}
			}

			System.out.println("do you want to add school? yes/no");
			if (s.nextLine().equals("yes")) {
				schI++;
				schFlag = true;
			} else {
				schFlag = false;
			}
		}
		
for(school ss:schoolList) {
	System.out.println();
	System.out.println("school name :"+ss.getName());
	for(Department d :ss.getDepartmentList()) {
		System.out.println();
		System.out.println("Department name :"+d.getName());
		for(Teacher t :d.getTeacherlist()) {
			System.out.println();
			System.out.println("Teacher name :"+t.getName());
			for(student st:t.getStudentlist()) {
				System.out.println();
				System.out.println("student name :"+st.getName()) ;
				for(course c:st.getCourselist()) {
					System.out.println();
					System.out.println("course name :"+ c.getName());
					for(Mark m:c.getMarklist()) {
						System.out.println();
						System.out.println("Mark subject name :"+m.getSubjectName());
					}	
				}
			}
		}
	}
}
	}
}


	

	