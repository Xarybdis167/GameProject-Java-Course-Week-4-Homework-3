package Entities;

public class Customer {

	private int id;
	private String userName;
	private String firstName;
	private String lastName;
	private String userNumber;
	private String password;
	private String nationalId;
	private int yearOfBirth;
	
	
	public Customer(int id, String userName, String firstName, String lastName, String userNumber, String password,
			String nationalId, int yearOfBirth) {
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userNumber = userNumber;
		this.password = password;
		this.nationalId = nationalId;
		this.yearOfBirth = yearOfBirth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUserNumber() {
		return userNumber;
	}


	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNationalId() {
		return nationalId;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}


	public int getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
}
