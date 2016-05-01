package model;

import java.util.ArrayList;

public class Major {
	
	private String myMajor;
	private double majorGPA;
	private double creditsTowardDegree;
	private double minimumGPA;
	private double totalCreditsRequired;
	private int hegisCode;
	
	private ArrayList<Course> majorCourses = new ArrayList<Course>();
	private ArrayList<Course> ssCourses = new ArrayList<Course>();
	private ArrayList<Course> humanitiesCourses = new ArrayList<Course>();
	private ArrayList<Course> physEdCourses = new ArrayList<Course>();
	private ArrayList<Course> mathCourses = new ArrayList<Course>();
	private ArrayList<Course> scienceCourses = new ArrayList<Course>();
	
	public Major(){
		
	}
	
	
	public Major(String myMajor, double majorGPA, double creditsTowardDegree,
			double minimumGPA, double totalCreditsRequired, int hegisCode) {
		super();
		this.myMajor = myMajor;
		this.majorGPA = majorGPA;
		this.creditsTowardDegree = creditsTowardDegree;
		this.minimumGPA = minimumGPA;
		this.totalCreditsRequired = totalCreditsRequired;
		this.hegisCode = hegisCode;
	}
	public int getHegisCode() {
		return hegisCode;
	}
	public void setHegisCode(int hegisCode) {
		this.hegisCode = hegisCode;
	}
	public String getMyMajor() {
		return myMajor;
	}
	public void setMyMajor(String myMajor) {
		this.myMajor = myMajor;
	}
	public double getMajorGPA() {
		return majorGPA;
	}
	public void setMajorGPA(double majorGPA) {
		this.majorGPA = majorGPA;
	}
	public double getCreditsTowardDegree() {
		return creditsTowardDegree;
	}
	public void setCreditsTowardDegree(double creditsTowardDegree) {
		this.creditsTowardDegree = creditsTowardDegree;
	}
	public double getMinimumGPA() {
		return minimumGPA;
	}
	public void setMinimumGPA(double minimumGPA) {
		this.minimumGPA = minimumGPA;
	}
	public double getTotalCreditsRequired() {
		return totalCreditsRequired;
	}
	public void setTotalCreditsRequired(double totalCreditsRequired) {
		this.totalCreditsRequired = totalCreditsRequired;
	}
	
	
	public void addToHumanities(Course c){
		humanitiesCourses.add(c);
	}
	public void addToSS(Course c){
		ssCourses.add(c);
	}
	public void addToMath(Course c){
		mathCourses.add(c);
	}
	public void addToMajor(Course c){
		majorCourses.add(c);
	}
	public void addToPhysEd(Course c){
		physEdCourses.add(c);
	}
	public void addToSciences(Course c){
		scienceCourses.add(c);
	}
	
	public int getHumanitiesSize(){
		return humanitiesCourses.size();
	}
	public int getSocialSciencesSize(){
		return ssCourses.size();
	}
	public int getMathSize(){
		return mathCourses.size();
	}
	public int getMajorCoursesSize(){
		return majorCourses.size();
	}
	public int getPhysEdCoursesSize(){
		return physEdCourses.size();
	}
	public int getSciencesCoursesSize(){
		return scienceCourses.size();
	}
	
	
	
	public Course getHumanititesCourse(int i){
		return humanitiesCourses.get(i);
	}
	public Course getSSCourse(int i){
		return ssCourses.get(i);
	}
	public Course getMathCourse(int i){
		return mathCourses.get(i);
	}
	public Course getMajorCourse(int i){
		return majorCourses.get(i);
	}
	public Course getPhysEdCourse(int i){
		return physEdCourses.get(i);
	}
	public Course getScienceCourse(int i){
		return scienceCourses.get(i);
	}
	
	// runs through all local bags to see which one contains the course gotten from a student's "Courses Needed"(See SAIN DISPLAY CLASS).
	public String getAreaRequirement(Course c){
		boolean found = false;
		for(int i = 0; i < humanitiesCourses.size(); i ++){
			if(humanitiesCourses.get(i).equals(c)){
				found = true;
				return "Humanities";
			}
		}
		if(found == false){
			for(int i = 0; i < majorCourses.size(); i ++){
				if(majorCourses.get(i).equals(c)){
					found = true;
					return "Major Req.";
				}
			}
			for(int i = 0; i < mathCourses.size(); i ++){
				if(mathCourses.get(i).equals(c)){
					found = true;
					return "Math";
				}
			}
			for(int i = 0; i < physEdCourses.size(); i ++){
				if(physEdCourses.get(i).equals(c)){
					found = true;
					return "Phys Ed";
				}
			}
			for(int i = 0; i < ssCourses.size(); i ++){
				if(ssCourses.get(i).equals(c)){
					found = true;
					return "Social Sciences";
				}
			}
			for(int i = 0; i < scienceCourses.size(); i ++){
				if(scienceCourses.get(i).equals(c)){
					found = true;
					return "Science";
				}
			}
			
		}
		
		return "NA";
		
	}
	

}
