
public class Instructor {

	private String firstName, lastName, phoneNum, status;
	private int experienceY;
	
	//CONSTRUCTOR
	public Instructor(String firstName, String lastName, String phoneNum, int experienceY) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setExperienceY(experienceY);
	}
	//GETTERS
	public String getStatus() {
		switch (experienceY) {
		case 1:
			status = "Junior";
			break;
		case 2:
			status = "Intermediate";
			break;
		case 3:
			status = "Senior";
		default:
			status = "Senior";
		}
				return status;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public int getexperienceY() {
		return experienceY;
	}
	//SETTERS
	
	public void setFirstName(String firstName) {
		 if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			 this.firstName = firstName;
		 } else {
			 this.firstName = "Unknown First Name";
		 }
	 }
	
	public void setLastName(String lastName) {
		 if(!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			 this.lastName = lastName;
		 } else {
			 this.lastName = "Unknown Last Name";
		 }
	 }
	
	public void setPhoneNum(String phoneNum) {
		 if(!phoneNum.isEmpty() && !phoneNum.equalsIgnoreCase(null)) {
			 this.phoneNum = phoneNum;
		 } else {
			 this.phoneNum = "000 - 00 - 00000";
		 }
	 }
	
	public void setExperienceY(int experienceY) {
		if(experienceY >= 1) {
			this.experienceY = experienceY;
		} else { this.experienceY = 1;}
	}
}
