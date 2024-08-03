package oops;

import java.math.BigInteger;

public class Employee2 {
	
	private int empNum;
	private String empName;
	private String address;
	private BigInteger mobileNumber;
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



	public BigInteger getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(BigInteger mobileNumber) {
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
		Employee2 empObj=new Employee2();
		empObj.setEmpNum(100);
		empObj.setEmpName("Sneha");
		empObj.setGender("Female");
		empObj.setEmailAddress("knklknnl@gmail.com");
		empObj.setMobileNumber(new BigInteger("8789909000"));
		empObj.setAddress("bengaluru");
		
		System.out.println("Employee Number:"+empObj.getEmpNum());
		System.out.println("Employee name:"+empObj.getEmpName());
		System.out.println("Gender:"+empObj.getGender());
		System.out.println("Email Adress:"+empObj.getEmailAddress());
		System.out.println("Phone Number:"+empObj.getMobileNumber());
		System.out.println("Address:"+empObj.getAddress());

	}

}
