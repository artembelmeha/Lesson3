

public class Student extends Human implements Comparable{
	private int yearOfEducation; 
	private String university;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String firstName, String lastName, String middleName, 
			int age, Sex sex, int yearOfEducation, String university) {
		super(firstName, lastName, middleName, age, sex);
		this.yearOfEducation=yearOfEducation;
		this.university=university;
	}
	public int getYearOfEducation() {
		return yearOfEducation;
	}
	public void setYearOfEducation(int yearOfEducation) {
		if (yearOfEducation<1 || yearOfEducation>=7) 
			throw new IllegalArgumentException("Wrong year of education");
		this.yearOfEducation = yearOfEducation;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	@Override
	public String toString() {
		return "\n["+ super.toString()+", yearOfEducation=" + yearOfEducation + ", university=" + university + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((university == null) ? 0 : university.hashCode());
		result = prime * result + yearOfEducation;
		return result;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o == null) {
			return -1;
		}
		Student stud =(Student) o;
	
		return this.getLastName().compareToIgnoreCase(stud.getLastName());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (university == null) {
			if (other.university != null)
				return false;
		} else if (!university.equals(other.university))
			return false;
		if (yearOfEducation != other.yearOfEducation)
			return false;
		return true;
	}
	
	
	
	


}
