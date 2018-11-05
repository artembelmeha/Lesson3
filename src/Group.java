import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Group implements Voenkom {
	private Student [] students = new Student[10];

	public Group() {
		super();
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	public void addStudent(Student student) throws GroupIsOvercrowdedException {		
			for (int i = 0; i < this.students.length; i++) {
				if (this.students[i]==null) {
					this.students[i] = student;
					return;
				}  
			} throw new GroupIsOvercrowdedException("It's not possible to add more than 10 student");				
	}
	public void deleteStudent (Student student) {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i].equals(student)) {
				students[i]=null;
			}
		}
	}
	
/*	 Old methods
	public void sortGroup() {
		Student tempStr;
		  for (int t = 0; t < this.students.length - 1; t++) {
	            for (int i= 0; i < this.students.length - t -1; i++) {
	            	
	                if(this.checkSort(this.students[i+1].getLastName(), this.students[i].getLastName())) {
		                    tempStr = this.students[i];
		                    this.students[i]=this.students[i+1];
		                    this.students[i+1]=tempStr; 	
	                } 
	            }
	        }		

	}
	
	

*/
	public boolean checkSort(String s1, String s2) {
		int flag = 0;

        try {
            flag = s1.compareTo(s2);

        } catch (NullPointerException e) {

            flag = 0;

        }

        return (flag > 0) ? false : true;
		
	}


	@Override
	public String toString() {
	//	this.sortGroup();
	//	Arrays.sort(students);
		return "\nGroup " + Arrays.toString(students)+"\n";
	}
	
	
	public Student [] serchByLastName(String s) {
		int flag =0;
		for (int i = 0; i < students.length; i++) {
			if (students[i]!=null) {
			if (s.equals(students[i].getLastName())) 	flag++;
			}
		}
		Student []  groupLastName = new Student[flag];
		flag=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i]!=null) {
			if (s.equals(students[i].getLastName())) {
				groupLastName[flag]=students[i];
				flag++;
			}
			}
		}
		return groupLastName;
	}
	public void interactiveAddStudents() throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		int yearOfEducation=0;; 
		String university=null; 
		String firstName=null;
		String lastName=null;
		String middleName=null;
		int age=0;
		String sexString=null;
		Sex sex=null;
		try {
			System.out.println("Student's First name: ");
			firstName = scan.nextLine();
			System.out.println("Student's Last name:");
			lastName = scan.nextLine();
			System.out.println("Student's Middle name:");
			middleName = scan.nextLine();
			System.out.println("Student's university: ");
			university = scan.nextLine();
			
			System.out.println("Student's sex:");
			sexString = scan.nextLine();
			sexString=sexString.toLowerCase();
			if(sexString.equals("male")) {
				sex = Sex.MALE;
			} else if (sexString.equals("female")) {
				sex = Sex.FEMALE;
			} else sex = null;
			
			
			System.out.println("Student's age:");
			age = scan.nextInt();
			System.out.println("Student's year of education:");
			yearOfEducation = scan.nextInt();
			
			
			
			
			
			
		} catch (InputMismatchException e) {
			System.out.println("Incorect input");
		}
		Student st=new Student(firstName, lastName,middleName,age,sex, yearOfEducation,university);
		try {
			this.addStudent(st);
		} catch (GroupIsOvercrowdedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Student[] olderThan18() {
		Student [] stud = new Student[this.students.length];
		int flag = 0;
		for (int i = 0; i < stud.length; i++) {
			if (students[i]!=null) {
			if (this.students[i].getSex() == Sex.MALE && this.students[i].getAge()>=18) {
				stud[flag]=this.students[i];
				flag++;
			}
			}
		}
		return stud;
	}
	
	public void sortByFirstName() {
		Student tempStr;
		  for (int t = 0; t < this.students.length - 1; t++) {
			   if (students[t]!=null) {
				   for (int i= 0; i < this.students.length - t -1; i++) {
					   if (students[i+1]!=null) {
						   if(this.checkSort(this.students[i+1].getFirstName(), this.students[i].getFirstName())) {
							   tempStr = this.students[i];
							   this.students[i]=this.students[i+1];
							   this.students[i+1]=tempStr; 	
						   }
					   }
				   }
			   	}
	        }	
	}
	/*
 	public Student[] sortByAge() {
		Arrays.sort(st, (a, b) -> Comp.comp(a, b) != Comp.CON ? Comp.CON : a.getAge() - b.getAge());
		return st;
	}
 	public Student[] sortBySex() {
		Arrays.sort(st, (a, b) -> {
			if (Comp.comp(a, b) != Comp.CON) {
				return Comp.CON;
			} else {
				if ((a.getSex() == Sex.Male && b.getSex() == Sex.Male)
						|| (a.getSex() == Sex.Female && b.getSex() == Sex.Female)) {
					return 0;
				}
				if(a.getSex()==Sex.Female) {
					return 1;
				}
				return -1;
			}
		});
		return st;
	}
	
	*/
	
	
	
}
