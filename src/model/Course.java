package model;

import java.io.Serializable;

public class Course implements Serializable{
	
	private String grade;
	private String title;
	private double credits;
	private Course prereq;
	private String subject;
	private int courseNum;
	private int courseID;
	
	private boolean countsInProgram;
	private boolean nysFinAidElig;
	private boolean fedFinAidElig;
	private boolean repeat;
	
	//course constructor without prereq.
	public Course(String grade, String title, double credits, String subject, int courseNum, int id) {
		super();
		this.grade = grade;
		this.title = title;
		this.credits = credits;
		this.subject = subject;
		this.courseNum = courseNum;
		courseID = id;
	}
	
	//course constructor with prereq.
//	public Course(String grade, String title, double credits, Course prereq) {
//		super();
//		this.grade = grade;
//		this.title = title;
//		this.credits = credits;
//		this.prereq = prereq;
//	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public Course getPrereq() {
		return prereq;
	}

	public void setPrereq(Course prereq) {
		this.prereq = prereq;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	@Override
	public String toString() {
		return subject + " " + courseNum + " " + grade ;
	}
	
	public String toStringWithAidInfo(){
		return subject + " " + courseNum + " Counts in Program: " + this.isCountsInProgram() + " NYS FIN AID:" + this.isNysFinAidElig()
				+ " FED FIN AID: " + this.isFedFinAidElig() + " Repeat: " + this.isRepeat();
	}
	public String toStringForNeeded(){
		return subject + "            " + courseNum + "            " + title + "           " + credits;
	}
	
	public void setFinancialAidInfo(boolean a, boolean b, boolean c, boolean d){
		if(a)
			countsInProgram = true;
		if(b)
			nysFinAidElig = true;
		if(c)
			fedFinAidElig = true;
		if(d)
			repeat = true;
	}

	public String isCountsInProgram() {
		
		if(countsInProgram)
			return "Y";
		else
			return "N";
				
	}

	public String isNysFinAidElig() {
		if(nysFinAidElig)
			return "Y";
		else
			return "N";
	}

	public String isFedFinAidElig() {
		if(fedFinAidElig)
			return "Y";
		else
			return "N";
	}

	public String isRepeat() {
		if(repeat)
			return "Y";
		else
			return "N";
	}
	
	

	
	
	

}
