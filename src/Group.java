import java.util.Arrays;

public class Group {
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
			} throw new GroupIsOvercrowdedException("It's not possible to add 11's student");				
	}
	public void deleteStudent (Student student) {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i].equals(student)) {
				students[i]=null;
			}
		}
	}
	
	
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
		this.sortGroup();
		return "\nGroup " + Arrays.toString(students)+"\n";
	}
	
	
	public Student [] serchByLastName(String s) {
		int flag =0;
		for (int i = 0; i < students.length; i++) {
			if (s.equals(students[i].getLastName())) {
				flag++;
			} 
		}
		Student []  groupLastName = new Student[flag];
		flag=0;
		for (int i = 0; i < students.length; i++) {
			if (s.equals(students[i].getLastName())) {
				groupLastName[flag]=students[i];
				flag++;
			} 
		}
		return groupLastName;
	}
	
	
	
	
}
