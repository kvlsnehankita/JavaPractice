package oops;

import java.math.BigInteger;

public class EmployeeV1 {

	private int empNum;
	private String empName;
	private String address;
	private BigInteger mobileNumber;
	private String emailAddress;
	private String Gender;

	EmployeeV1() {
		empNum = 100;
		empName = "Sneha";
		address = "Bengaluru";
		mobileNumber = new BigInteger("32443234");
		emailAddress = "fdssdf@gmail.com";
		Gender = "Female";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeV1 empObj = new EmployeeV1();
		System.out.println(empObj.toString());

	}

	@Override
	public String toString() {
		return "EmployeeV1 [empNum=" + empNum + ", empName=" + empName + ", address=" + address + ", mobileNumber="
				+ mobileNumber + ", emailAddress=" + emailAddress + ", Gender=" + Gender + "]";
	}

}
