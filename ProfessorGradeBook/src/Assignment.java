
public class Assignment {
	private int student_id;
	private String assignment;
	private int assignment_type_id;
	private double grade;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getAssignment() {
		return assignment;
	}
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	public int getAssignmentTypeId() {
		return assignment_type_id;
	}
	public void setAssignmentTypeId(int assignment_type_id) {
		this.assignment_type_id = assignment_type_id;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getStudentName(int student_id){
		String name = "";
		return name;
	}
	public String getAssignmentType(int assignment_type_id) {
		String type = "";
		return type;
	}
}
