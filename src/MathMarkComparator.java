import java.util.Comparator;

public class MathMarkComparator implements Comparator<Student> {
 
    public int compare(Student stu1, Student stu2) {
    	
        return stu1.getMarkInMath() - stu2.getMarkInMath();
    }
}