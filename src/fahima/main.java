package fahima;

import java.util.Scanner;

import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {

	
		
		Scanner scanner = new Scanner(System.in);

		ArrayList<school> schoolelist = new ArrayList<school>();

		school muscat = new school();

		
		//ArrayList<Department> departmentList = new ArrayList<Department>();
		Department department = new Department();
		
		ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();
		Teacher teacher = new Teacher("fahima",31);
		ArrayList<student> studentlist = new ArrayList<student>();
		student student = new student();
		
		ArrayList<course> courselist = new ArrayList<course>();
		course course = new course();
		
		ArrayList<Mark> marklist = new ArrayList<Mark>();
		Mark mark = new Mark();
		boolean condition = true;
		{
		
		
				System.out.println("enter school name");
				String name = scanner.next();
				muscat.setName(name);
				schoolelist.add(muscat);

				
				boolean option = true;
				while (option) {
					System.out.println("enter Department name");
					String dep = scanner.next();
					department.setName(dep);
					muscat.departmentList.add(department);
				
					
					
					
					
					boolean choose = true;
					while (choose) {
						System.out.println("enter Teacher name");
						String tech = scanner.next();
						teacher.setName(tech);
						department.teacherlist.add(teacher);
						
						
						
						
						
						
						boolean optional = true;
						while (optional) {
							System.out.println("enter Student name");
							String studnt = scanner.next();
							student.setName(studnt);
							
							teacher.studentlist.add(student);
						
							
							
							boolean choosen = true;
							while (choosen) {
								System.out.println("enter Course name");
								String cours = scanner.next();
								course.setName(cours);
								
                                student.Courselist.add(course);

								
						
								boolean press = true;
								while (press) {
									System.out.println("enter Subject name");
						     		String marks = scanner.next();
									mark.setSubjectName(marks);
									
								course.marklist.add(mark);
						
									
							System.out.print("Do you want to add new subject? yes/no");
							String dot = scanner.next();
							if (dot.equals("yes")) {
								press = true;
								
							} 
							else if (dot.equals("no")) {
							
							
								//System.out.println("thank you");
								press = false;
							}
										
						
								
						
								
							
							}//Subject
								System.out.println("Do you want to add new Course? yes/no");
								String Press = scanner.next();

								if (Press.equals("yes")) {
									choosen = true;
									
								} else if (Press.equals("no")) {
									choosen = false;
								}
							}
							System.out.println("Do you want to add new student? yes/no");
							String Input = scanner.next();

							if (Input.equals("yes")) {
								optional = true;
								
							} else if (Input.equals("no")) {
								optional = false;
							}
						}//Student
						System.out.println("Do you want to add new teacher? yes/no");
						String put = scanner.next();
						if (put.equals("yes")) {
							choose = true;
							 
							
						} 
						else if (put.equals("no")) {
							choose = false;
							
						}
					}//Teacher		
					System.out.println("Do you want to add new Department? yes/no");
					String put = scanner.next();
					if (put.equals("yes")) {
						option = true;
						
						
					} 
					else if (put.equals("no")) {
						System.out.println("thank you");
						option = false;
						
					}
				}//Department 
				
					
				for (school S : schoolelist) {
					System.out.println("scool name:" + S.getName());
				

				for (Department D : S.getDepartmentList()) {
					System.out.println("department name:" + D.getName());
				

				for (Teacher T : D.getTeacherlist()) {
					System.out.println("teacher name:" + T.getName());
				

				for (student Ss : T.getStudentlist()) {
					System.out.println("student name:" + Ss.getName());
				

				for (course C : Ss.getCourselist()) {
					System.out.println("course name:" + C.getName());
				

				for (Mark M : C.getMarklist()) {
					System.out.println("subject name:" + M.getSubjectName());
				}

			}}}}}

									
								
									
								
			}}}

	

	
	
	