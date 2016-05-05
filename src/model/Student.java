package model;

public class Student extends User {
	

	
	private String degreeType;
	private String campus;
	private MajorBag major;
	private int majorID;
	private double cumulativeGPA;
	private double programGPA;
	Advisor advisor;
	Enrollment enrollmentInfo;
	
	private double totalCredits;
	private double majorCredits;
	
	
	public Student(String firstName, String lastName, Address address,
			String email, int id, Account account,String degreeType, String campus, MajorBag major,
			double cumulativeGPA, double programGPA, Enrollment enrollment, int majorID) {
		
		super(firstName, lastName, address, email, id, account);
		this.degreeType = degreeType;
		this.campus = campus;
		this.major = major;
		this.cumulativeGPA = cumulativeGPA;
		this.programGPA = programGPA;
		enrollmentInfo = enrollment;
		this.majorID = majorID;
		enrollmentInfo.setMyMajor(major.getMajor(majorID));
	}
	
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public Major getMajor() {
		return major.getMajor(majorID);
	}
//	public void setMajor(Major major) {
//		this.major = major;
//	}
	public double getCumulativeGPA() {
		return cumulativeGPA;
	}
	public void setCumulativeGPA(double cumulativeGPA) {
		this.cumulativeGPA = cumulativeGPA;
	}
	public double getProgramGPA() {
		return programGPA;
	}
	public void setProgramGPA(double programGPA) {
		this.programGPA = programGPA;
	}
	public Advisor getAdvisor() {
		return advisor;
	}
	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}
	public Enrollment getEnrollmentInfo(){
		return enrollmentInfo;
	}
	public void setEnrollmentInfo(Enrollment enroll){
		enrollmentInfo = enroll;
	}

	public int getMajorID() {
		return majorID;
	}

	public void setMajorID(int majorID) {
		this.majorID = majorID;
	}
	public double getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(double totalCredits) {
		this.totalCredits = totalCredits;
	}

	public double getMajorCredits() {
		return majorCredits;
	}

	public void setMajorCredits(double majorCredits) {
		this.majorCredits = majorCredits;
	}

	@Override
	public String toString() {
		return  "Student name:" + firstName + "Student [degreeType=" + degreeType + ", campus=" + campus
				+ ", major=" + major + ", majorID=" + majorID
				+ ", cumulativeGPA=" + cumulativeGPA + ", programGPA="
				+ programGPA + ", advisor=" + advisor + ", enrollmentInfo="
				+ enrollmentInfo + "]";
	}
	
	public void calculateCredits(){
		
		for(int i = 0; i< getEnrollmentInfo().getTakenBag().getSize();i++){
			totalCredits = (totalCredits + getEnrollmentInfo().getTakenBag().getCourse(i).getCredits());
			
		}
		for(int i = 0; i< getEnrollmentInfo().getNeededBag().getSize();i++){
			totalCredits = (totalCredits + getEnrollmentInfo().getNeededBag().getCourse(i).getCredits());
			majorCredits = (majorCredits + getEnrollmentInfo().getNeededBag().getCourse(i).getCredits());
		}
	}
	
	

}
