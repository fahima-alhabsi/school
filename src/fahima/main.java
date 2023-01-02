package fahima;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.*;



public class main {
	
	
	 public static void  main(String[] args) throws Throwable, IOException, ClassNotFoundException,FileNotFoundException {
		
		 finalize f = new finalize();
		    f.finalize();
		    
		    
	     Scanner scanner = new Scanner(System.in);
		
		
		
		
		File ff = new File("C:\\Users\\HP\\eclipse-workspace\\fahima\\f.txt");
		FileWriter FW = new FileWriter("C:\\Users\\HP\\eclipse-workspace\\fahima\\f.txt");
		
		Mark subjectMark= new Mark();
		
		FileOutputStream FOS = new FileOutputStream(new File("myObjects.txt"));
		ObjectOutputStream ObjS = new ObjectOutputStream(FOS);

		// Write objects to file
		ObjS.writeObject(subjectMark);

		ObjS.close();
		FOS.close();

		FileInputStream FIS = new FileInputStream(new File("myObjects.txt"));
		ObjectInputStream ObjIS = new ObjectInputStream(FIS);

		// Read objects
		Mark pr1 = (Mark) ObjIS.readObject();
		pr1.setSubjectName("math");
		System.out.println(pr1.getSubjectName());

		ObjIS.close();
		FIS.close();
		
		
	      String[] words=null;  
	      BufferedReader br = new BufferedReader(new FileReader ("C:\\Users\\HP\\eclipse-workspace\\fahima\\search.txt")); 
	      String s;  
	      System.out.println("write word you want to search for ");
	      String input=scanner.nextLine();   
	      int count=0;   
	      while((s=br.readLine())!=null)   
	      {
	         words=s.split(" ");  
	          for (String word : words) 
	          {
	                 if (word.equals(input))   
	                 {
	                   count++;    
	                 }
	          }
	      }
	      if(count!=0)  
	      {
	         System.out.println("The given word is present for "+count+ " Times in the file");
	      }
	      else
	      {
	         System.out.println("The given word is not present in the file");
	      }
	      
	         br.close();


		ArrayList<school> schoolelist = new ArrayList<school>();
		school muscat = new school();

		
		ArrayList<Department> departmentList = new ArrayList<Department>();
		Department department = new Department();
		Stack<String> st = new Stack();
	
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
									st.push(marks);
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
					System.out.println("school name:" + S.getName());
				FW.write("school name:  " + S.getName()+ "\n");

				for (Department D : S.getDepartmentList()) {
					System.out.println("department name:" + D.getName());
					FW.write("department name:  " + D.getName()+ "\n");

				for (Teacher T : D.getTeacherlist()) {
				System.out.println("teacher name:" + T.getName());
					FW.write("teacher name:  " + T.getName()+ "\n");

				for (student Ss : T.getStudentlist()) {
					System.out.println("student name:" + Ss.getName());
					FW.write("student name:  " + Ss.getName()+ "\n");
				

				for (course C : Ss.getCourselist()) {
					System.out.println("course name:" + C.getName());
					FW.write("course name:  " + C.getName()+ "\n");

				for (Mark M : C.getMarklist()) {
					System.out.println("subject name:" + M.getSubjectName());
					FW.write("subject name:  " + M.getSubjectName()+ "\n");
				}
				
		
				FW.close();	
						
					
				}

			}}}}}

									
	
		for (int i = 0; i <=st.size(); i++) {
			System.out.println(	st.pop());
		
			
		}
		
		
		
	}

	private static FileReader FileReader() {
		// TODO Auto-generated method stub
		return null;
	}

	private static FileWriter FileWriter() {
		// TODO Auto-generated method stub
		return null;
	}}


	

	