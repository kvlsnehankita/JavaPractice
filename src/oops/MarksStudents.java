package oops;

public class MarksStudents {
	private int maths;
	private int science;
	private int social;
	private int english;
	private int kannada;
	
	
	

	public int getMaths() {
		return maths;
	}




	public void setMaths(int maths) {
		this.maths = maths;
	}




	public int getScience() {
		return science;
	}




	public void setScience(int science) {
		this.science = science;
	}




	public int getSocial() {
		return social;
	}




	public void setSocial(int social) {
		this.social = social;
	}




	public int getEnglish() {
		return english;
	}




	public void setEnglish(int english) {
		this.english = english;
	}




	public int getKannada() {
		return kannada;
	}




	public void setKannada(int kannada) {
		this.kannada = kannada;
	}




	public static void main(String[] args) {
		MarksStudents newmarks=new MarksStudents();
		newmarks.setMaths(95);
		newmarks.setScience(88);
		newmarks.setSocial(77);
		newmarks.setKannada(80);
		newmarks.setEnglish(85);
		
		System.out.println("maths marks:"+newmarks.getMaths());
		System.out.println("science marks:"+newmarks.getScience());
		System.out.println("social marks:"+newmarks.getSocial());
		System.out.println("kannada marks:"+newmarks.getKannada());
		System.out.println("english marks:"+newmarks.getEnglish());
		
		int marks[]= {95,88,77,80,85};
		float avg;
		float sum=0;

		
		int length = marks.length;

		
		for (int mark : marks) {
		  sum += mark;
		
		}

		System.out.println("Total marks"+sum);
		avg = sum / length;

		
		System.out.println("The average marks is: " + avg);
		
		float percent;
		
		percent = (sum/500) * 100 ;
		
		System.out.println("The percentage of marks" + percent);
		
		
	}

}

