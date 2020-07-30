import java.util.Comparator;

public class TotalMarkComparator implements Comparator<Student>{
	
	public int compare(Student stu1, Student stu2) {
		
		return stu1.getTotalMarks() - stu2.getTotalMarks();
	}
}