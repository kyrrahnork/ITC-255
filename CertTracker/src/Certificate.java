import java.util.ArrayList;

public class Certificate {
	private String courseName;
	private String description;
	private String id;
	private ArrayList<Course> requiredCourse;
	
	public void certificate(){
		this.courseName = courseName;
		this.description = description;
		this.id = id;
		this.requiredCourse = requiredCourse;
	}
	
	public boolean addCourse(Course c){
		return true;
	}
	
	public boolean removeCourse(Course c){
		return true;
	}
	
}
