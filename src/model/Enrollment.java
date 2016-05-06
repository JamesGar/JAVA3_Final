package model;

import java.io.Serializable;

public class Enrollment implements Serializable{
	
	//course bags? for now...
	CoursesFailedBag failedBag;
	CoursesTakenBag takenBag;
	CoursesNeededBag neededBag;
	CoursesCurrentBag currentBag;
	private String currentTerm;
	private String enteredTerm;
	//private double totalCreditsTaken;
	private Major myMajor;
	
	public Enrollment(String currentTerm, String enteredTerm, double totalCreditsTaken){
//		courseBag = new CourseBag();  < - Pretty sure i didnt need this...
		currentBag = new CoursesCurrentBag();
		failedBag = new CoursesFailedBag();
		takenBag = new CoursesTakenBag();
		neededBag = new CoursesNeededBag();
		this.currentTerm = currentTerm;
		this.enteredTerm = enteredTerm;
		//this.totalCreditsTaken = totalCreditsTaken;
	}
	
//	public Enrollment(CourseBag courseBag, CoursesFailedBag failedBag,
//			CoursesTakenBag takenBag, CoursesNeededBag neededBag,
//			String currentTerm, String enteredTerm, double totalCreditsTaken) {
//		super();
//		this.courseBag = courseBag;
//		this.failedBag = failedBag;
//		this.takenBag = takenBag;
//		this.neededBag = neededBag;
//		this.currentTerm = currentTerm;
//		this.enteredTerm = enteredTerm;
//		this.totalCreditsTaken = totalCreditsTaken;
//	}

	public CoursesFailedBag getFailedBag() {
		return failedBag;
	}
	public void setFailedBag(CoursesFailedBag failedBag) {
		this.failedBag = failedBag;
	}
	public CoursesTakenBag getTakenBag() {
		return takenBag;
	}
	public void setTakenBag(CoursesTakenBag takenBag) {
		this.takenBag = takenBag;
	}
	public CoursesNeededBag getNeededBag() {
		return neededBag;
	}
	public void setNeededBag(CoursesNeededBag neededBag) {
		this.neededBag = neededBag;
	}
	public String getNeededCourse(int i){
		return neededBag.getCourse(i).toString();
	}
	public String getCurrentTerm() {
		return currentTerm;
	}
	public void setCurrentTerm(String currentTerm) {
		this.currentTerm = currentTerm;
	}
	public String getEnteredTerm() {
		return enteredTerm;
	}
	public void setEnteredTerm(String enteredTerm) {
		this.enteredTerm = enteredTerm;
	}
//	public double getTotalCreditsTaken() {
//		return totalCreditsTaken;
//	}
//	public void setTotalCreditsTaken(double totalCreditsTaken) {
//		this.totalCreditsTaken = totalCreditsTaken;
//	}
	public void setMyMajor(Major m){
		myMajor = m;
	}
	public Major getMyMajor(){
		return myMajor;
	}

	public CoursesCurrentBag getCurrentBag() {
		return currentBag;
	}

	public void setCurrentBag(CoursesCurrentBag currentBag) {
		this.currentBag = currentBag;
	}
	
	

}
