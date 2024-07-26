package oops;

public class Student {
	private int studentId;
	private String studentName;
	private String gender;
	private int Standard;
	

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getStandard() {
		return Standard;
	}


	public void setStandard(int standard) {
		Standard = standard;
	}


	public static void main(String[] args) {
		Student studnew=new Student();
		studnew.setStudentId(100);
		studnew.setStudentName("Sneha");
		studnew.setGender("Female");
		studnew.setStandard(12);
		
		System.out.println("studentid:"+studnew.getStudentId());
		System.out.println("student name:"+studnew.getStudentName());
		System.out.println("gender:"+studnew.getGender());
		System.out.println("standard:"+studnew.getStandard());
		
		

	}

}
