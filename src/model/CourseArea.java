package model;

public class CourseArea extends Course {
	
	//probably ignore/ delete this
	
	private String subject;
	private int courseNumber;
	private String areaTitle;

	public CourseArea(String grade, String title, double credits) {
		super(grade, title, credits);
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getAreaTitle() {
		return areaTitle;
	}

	public void setAreaTitle(String areaTitle) {
		this.areaTitle = areaTitle;
	}
	
	
	

}
