
public class Student  {
	
    private int Idno;
    private String name;
	private int TotalMarks;
	private int MarkInMath;
    
	
	public Student(){
		
	}


	public Student(int idno, String name, int totalMarks, int markInMath) {
		super();
		Idno = idno;
		this.name = name;
		TotalMarks = totalMarks;
		MarkInMath = markInMath;
	}


	public int getIdno() {
		return Idno;
	}


	public void setIdno(int idno) {
		Idno = idno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTotalMarks() {
		return TotalMarks;
	}


	public void setTotalMarks(int totalMarks) {
		TotalMarks = totalMarks;
	}


	public int getMarkInMath() {
		return MarkInMath;
	}


	public void setMarkInMath(int markInMath) {
		MarkInMath = markInMath;
	}

	public String toString() {
		return "Student [Idno=" + Idno + ", name=" + name + ", TotalMarks=" + TotalMarks + ", MarkInMath=" + MarkInMath
				+ "]";
	}


}