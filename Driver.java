//MOISES NERVIS QUEVEDOS

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		
		Instructor ins1 = new Instructor("Jane", "Doe", "778 512 0110", 3);
		Instructor ins2 = new Instructor("Pedro", "Picapapas", "604 512 0110", 1);
		Instructor ins3 = new Instructor("Longaniza", "Jirafales", "778 715 0380", 0);
		
		Course course1 = new Course("Math1", 56, ins1);
		Course course2 = new Course("Chemestry", 11, ins2);
		Course course3 = new Course("Ethics", 8, ins3);
		Course course4 = new Course("DrivingClass", 4, ins1);
		
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
		
		printCourses(courses);
		
		System.out.println("\nEnter the last name of the instructor to search for a course:");
		String searchInstructor = input.nextLine();
		System.out.println(findInstructor(courses, searchInstructor));
		
		
	}

	//METHODS::
	public static void printCourses(ArrayList<Course>courses) {
		for(Course m : courses) {
			System.out.println("\nCourse Name is: " + m.getCourseName() + " wich takes " + m.getDuration() + " weeks.\nThe Instructor course is: " +
		m.getInstructor().getFirstName() + " " + m.getInstructor().getLastName() + 
		"\nWho is " + m.getInstructor().getStatus() + " with " + m.getInstructor().getexperienceY() + " years if experience\nThe phone number of this instructor is: " + m.getInstructor().getPhoneNum());
		}
	}
	//find Instructor
	public static String findInstructor(ArrayList<Course>courses, String lastName) {
		for(Course m : courses) {
			if(m.getInstructor().getLastName().equalsIgnoreCase(lastName)) {
				return m.getCourseName();
			}
		}
		return "\nThe Instructor does not teach any courses";
	}
}
