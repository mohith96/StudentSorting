import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sortdemo {

	public static void main(String[] args) {
		
		System.out.println("===== SORTING BY MULTIPLE ATTRIBUTES =====");
		
		List<Student> student = new ArrayList<Student>();
		
		student.add(new Student(123, "Nikhil", 960, 88));
		student.add(new Student(123, "Nikhil", 950, 84));
		student.add(new Student(123, "Nikhil", 950, 80));
		student.add(new Student(234, "Ramesh", 950, 92));
		student.add(new Student(234, "Ramesh", 980, 90));
		student.add(new Student(234, "Ramesh", 940, 88));
		student.add(new Student(234, "Ramesh", 940, 74));
		student.add(new Student(345, "Gupta", 960, 94));
		student.add(new Student(456, "Kamlesh", 960, 78));
		student.add(new Student(567, "Mohith", 952, 96));
		student.add(new Student(567, "Mohith", 940, 90));
		student.add(new Student(567, "Mohith", 940, 76));
		
		
		System.out.println("*** Before sorting:");
		 
        for (Student stu : student) {
            System.out.println(stu);
        }
 
       
        Collections.sort(student, new NameComparator()
        		.thenComparing(new TotalMarkComparator())
        		.thenComparing(new MathMarkComparator()));
        	
  
        		System.out.println("\n*** After sorting:");
 
        for (Student stu : student) {
            System.out.println(stu);
        }
 
    }
	}
