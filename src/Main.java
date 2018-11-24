import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {

	public static void main(String[] args) {
		Student st1=new Student("Ivan", "Petrov","Ivanovich",16,Sex.MALE, 6,"KPI");
		Student st2=new Student("Anna", "Davidova","Viktorivna",17,Sex.FEMALE, 2,"DNU");
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


		} catch (GroupIsOvercrowdedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(gr6yearKPI.toString());
				
		
		System.out.println("Studend with last Name durov: "+Arrays.toString(gr6yearKPI.serchByLastName("Durov")));
		
		System.out.println("Next recruts are: \n"+Arrays.toString(gr6yearKPI.olderThan18()));
		
		System.out.println(gr6yearKPI.toString());
		
		gr6yearKPI.sortByFirstName();
		System.out.println(gr6yearKPI.toString());
		
		
		File f = new File("Group.txt");
		gr6yearKPI.saveGroup(f);
		
		Group openFromFile = new Group();
		openFromFile = openFromFile.openGroup(f);
		System.out.println("From opened fime:");
		System.out.println(openFromFile.toString());
	}

}
