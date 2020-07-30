import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	public int compare(Student stu1, Student stu2) {
		
		String p1 = stu1.getName();
	    String p2 = stu2.getName();
	  
	    return p1.compareTo(p2);
	}

}
