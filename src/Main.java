import java.lang.reflect.Array;
import java.util.Arrays;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {

	public static void main(String[] args) {
		Student st1=new Student("Ivan", "Petrov","Ivanovich",25,Sex.MALE, 6,"KPI");
		Student st2=new Student("Anna", "Davidova","Viktorivna",21,Sex.FEMALE, 2,"DNU");
		Student st3=new Student("Ikar", "Niton","Petrovich",24,Sex.MALE, 6,"KPI");
		Student st4=new Student("Yulia", "Antonova","Lionovna",25,Sex.FEMALE, 6,"KPI");
		Student st5=new Student("Oleh", "Durov","Stepanovich",25,Sex.MALE, 6,"KPI");
		Student st6=new Student("Ivan", "Petrov","Ivanovich",25,Sex.MALE, 6,"KPI");
		Student st7=new Student("Anna", "Davidova","Viktorivna",21,Sex.FEMALE, 2,"DNU");
		Student st8=new Student("Ikar", "Niton","Petrovich",24,Sex.MALE, 6,"KPI");
		Student st9=new Student("Yulia", "Antonova","Lionovna",25,Sex.FEMALE, 6,"KPI");
		Student st10=new Student("Oleh", "Durov","Stepanovich",25,Sex.MALE, 6,"KPI");
		Group gr6yearKPI = new Group();
		try {
			gr6yearKPI.addStudent(st1);
			gr6yearKPI.addStudent(st2);
			gr6yearKPI.addStudent(st3);
			gr6yearKPI.addStudent(st4);
			gr6yearKPI.addStudent(st8);
			gr6yearKPI.addStudent(st7);
			gr6yearKPI.addStudent(st6);
			gr6yearKPI.addStudent(st5);
			gr6yearKPI.addStudent(st9);
			gr6yearKPI.addStudent(st10);
			gr6yearKPI.addStudent(st5);
			gr6yearKPI.addStudent(st5);
		} catch (GroupIsOvercrowdedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(gr6yearKPI.toString());

		System.out.println(Arrays.toString(gr6yearKPI.serchByLastName("Durov")));
		
	}

}
