package oops;

import java.math.BigInteger;

public class MarksStudents2 {
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
		MarksStudents2 newmarks = new MarksStudents2();
		newmarks.setMaths(95);
		newmarks.setScience(88);
		newmarks.setSocial(77);
		newmarks.setKannada(80);
		newmarks.setEnglish(85);

		System.out.println("maths marks:" + newmarks.getMaths());
		System.out.println("science marks:" + newmarks.getScience());
		System.out.println("social marks:" + newmarks.getSocial());
		System.out.println("kannada marks:" + newmarks.getKannada());
		System.out.println("english marks:" + newmarks.getEnglish());

		MarksStudents2[] marksArray = new MarksStudents2[4];
		marksArray[0] = new MarksStudents2();
		marksArray[0].setMaths(95);
		marksArray[0].setScience(88);
		marksArray[0].setSocial(77);
		marksArray[0].setKannada(80);
		marksArray[0].setEnglish(85);

		marksArray[1] = new MarksStudents2();
		marksArray[1].setMaths(95);
		marksArray[1].setScience(88);
		marksArray[1].setSocial(77);
		marksArray[1].setKannada(80);
		marksArray[1].setEnglish(85);

		marksArray[2] = new MarksStudents2();
		marksArray[2].setMaths(95);
		marksArray[2].setScience(88);
		marksArray[2].setSocial(77);
		marksArray[2].setKannada(80);
		marksArray[2].setEnglish(85);

		marksArray[3] = new MarksStudents2();
		marksArray[3].setMaths(95);
		marksArray[3].setScience(88);
		marksArray[3].setSocial(77);
		marksArray[3].setKannada(80);
		marksArray[3].setEnglish(85);

		if (marksArray != null) {
			for (MarksStudents2 student : marksArray) {
				if (student == null) {
					return;
				}
				System.out.println("maths marks:" + newmarks.getMaths());
				System.out.println("science marks:" + newmarks.getScience());
				System.out.println("social marks:" + newmarks.getSocial());
				System.out.println("kannada marks:" + newmarks.getKannada());
				System.out.println("english marks:" + newmarks.getEnglish());

			}
		}
	}
}
