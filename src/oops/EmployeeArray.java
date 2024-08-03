package oops;

import java.math.BigInteger;

import iava.math.Biginteger;

public class EmployeeArray {
	
	private int empNum;
	private String empName;
	private String address;
	private Biginteger mobileNumber;
	private String emailAddress;
	private String Gender;
	
	

	public String getGender() {
		return Gender;
	}



	public void setGender(String gender) {
		Gender = gender;
	}



	public int getEmpNum() {
		return empNum;
	}



	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Biginteger getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(Biginteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeArray empObi[]=new EmployeeArray[2];
		empObi[0].setEmpNum(100);
		empObi[0].setEmpName("Sneha");
		empObi[0].setGender("Female");
		empObi[0].setEmailAddress("knklknnl@gmail.com");
		empObi[0].setMobileNumber(new BigInteger("8789909000"));
		empObi[0].setAddress("bengaluru");
		
		empObi[1].setEmpNum(101);
		empObi[1].setEmpName("Sneha1");
		empObi[1].setGender("Female");
		empObi[1].setEmailAddress("knklknnl111@gmail.com");
		empObi[1].setMobileNumber(new BigInteger("8789909002"));
		empObi[1].setAddress("bengaluru");
		
		for(int i=0;i<empObi.length;++i) {
			System.out.println("Employee Number:"+empObi[i].getEmpNum());
			System.out.println("Employee Name:"+empObi[i].getEmpName());
			System.out.println("Employee gender:"+empObi[i].getGender());
			System.out.println("Employee email address:"+empObi[i].getEmailAddress());
			System.out.println("Employee mobile number:"+empObi[i].getMobileNumber());
			System.out.println("Employee adress:"+empObi[i].getAddress());
			
			
			
		}
		
		

	}

}
