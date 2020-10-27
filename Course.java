
public class Course {

	private String courseName;
	int duration;
	private Instructor instructor;
	
	//CONSTRUCTOR
	public Course(String courseName, int duration, Instructor instructor) {
		setCourseName(courseName);
		setDuration(duration);
		setInstructor(instructor);
		
	}
	//GETTERS
	public String getCourseName() {
		return courseName;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	//SETTERS
	public void setCourseName(String courseName) {
		 if(!courseName.isEmpty() && !courseName.equalsIgnoreCase(null)) {
			 this.courseName = courseName;
		 } else {
			 this.courseName = "Unknown Course Name";
		 }
	 }
	
	public void setDuration(int duration) {
		if(duration >= 4) {
			this.duration = duration;
		} else {
			this.duration = 4;
		}
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
