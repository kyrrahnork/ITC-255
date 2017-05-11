
public class Admin extends Course {
	int employeeID;
	int adminID;
	
	Course course = new Course();
	Certificate cert = new Certificate();

	public Admin() {

	}

	public void editCourse() {
		course.setCourseName(courseName);
		course.setCourseNumber(courseNumber);
		course.setCredits(credits);
		course.setDepartment(department);
		course.setDescription(description);
	}

	public void editCertificate() {
		cert.addCourse(course);
		cert.removeCourse(course);
	}

	public void editDegree() {
		
	}

	public void editRequirements() {

	}

	public void editGrades() {

	}
}
