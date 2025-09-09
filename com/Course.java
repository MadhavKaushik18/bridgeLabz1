/*Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
*/
package com;
public class Course {
	private String courseName;
    private int duration; // Duration in weeks or months
    private double fee;
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.printf("Fee: $%.2f%n", fee);
        System.out.println("--------------------------------");
    }
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

	public static void main(String[] args) {
		Course c1 = new Course("Java Programming", 12, 500.0);
        Course c2 = new Course("Web Development", 10, 450.0);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Tech Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

	}

}
