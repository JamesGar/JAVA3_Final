package view;

import java.util.Date;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import model.Student;
import model.User;

public class SainDisplayScreen {
	
	Student thisStudent;
	
	TextArea basicInfo = new TextArea();
	TextArea requiredCourses = new TextArea();
	TextArea otherCourses = new TextArea();
	TextArea failedCourses = new TextArea();
	TextArea currentCourses = new TextArea();
	TextArea PEcoursesNeeded = new TextArea();
	TextArea majorCoursesNeeded = new TextArea();
	TextArea scienceCoursesNeeded = new TextArea();
	TextArea mathCoursesNeeded = new TextArea();
	TextArea nonMajorCoursesNeeded = new TextArea();
	TextArea programRequirements = new TextArea();
	TextArea summary = new TextArea();
	
	Label title = new Label("Student Advisement Information Notice (SAIN)");
	Label basicInfoLB = new Label("Basic Info:");
	Label requiredCoursesLB = new Label("Required Courses");
	Label otherCoursesLB = new Label("Other Courses");
	Label failedCoursesLB = new Label("Failed Courses:");
	Label coursesNeededLB = new Label(" Courses Needed:");
	Label PENeededLB = new Label(" Area: Physical Education");// need the number of credits needed total in this area for major.
	Label majorNeededLB = new Label(" Area: Major Required");// need the number of credits needed total in this area for major.
	Label nonMajorNeededLB = new Label(" Area: Non-Major Required");// need the number of credits needed total in this area for major.
	Label mathNeededLB = new Label(" Area: Math");// need the number of credits needed total in this area for major.
	Label scienceNeededLB = new Label(" Area: Lab Science");// need the number of credits needed total in this area for major.
	Label currentCoursesLB = new Label(" Current Courses: ");
	Label programRequirementsLB = new Label("Program Requirements:");
	
	GridPane grid = new GridPane();
	Button b1 = new Button("What If");
	Button update = new Button("Update SAIN");
	
	public SainDisplayScreen(){
		//thisStudent = s;
		update.setVisible(false);
	}
	
	public void setInfo(Student forThisStudent){
		thisStudent = forThisStudent;
		System.out.println("Sain Display Student: " + thisStudent.toString());
		basicInfo.setText("First Name: " + thisStudent.getFirstName() + "\n"
							+ "Last Name: " + thisStudent.getLastName() + "\n"
							+ "Degree: " + thisStudent.getDegreeType() + "\n"
							+ "Major: " + thisStudent.getMajor().getMyMajor() + "\n"
							+ "Cumulative GPA: " + thisStudent.getCumulativeGPA() + "\n"
							+ "Program GPA: " + thisStudent.getProgramGPA() + "\n"
							+ "Major GPA: " + thisStudent.getMajor().getMajorGPA() + "\n"
							+ "Campus: " + thisStudent.getCampus() + "\n" 
							+ "Starting Term" + thisStudent.getEnrollmentInfo().getEnteredTerm() +"\n"
							+ "Current Term: Spring 2016  \n"
							+ "Results as of: " + new Date());
		
		System.out.println("Needed Bag Size Now:" + thisStudent.getEnrollmentInfo().getNeededBag().getSize() );
		String myText = "";
		for(int i = 0; i< thisStudent.getEnrollmentInfo().getNeededBag().getSize();i++){
			myText = myText + ( thisStudent.getEnrollmentInfo().getNeededBag().getCourse(i).toString() + " "+ thisStudent.getMajor().getAreaRequirement(thisStudent.getEnrollmentInfo().getNeededBag().getCourse(i)) + "\n");
		}
		requiredCourses.setText(myText);
		myText = " ";
		for(int i = 0; i< thisStudent.getEnrollmentInfo().getTakenBag().getSize();i++){
			myText = myText + ( thisStudent.getEnrollmentInfo().getTakenBag().getCourse(i).toString() + "\n");
		}
		otherCourses.setText(myText);
		myText = " ";
		for(int i = 0; i< thisStudent.getEnrollmentInfo().getFailedBag().getSize();i++){
			myText = myText + ( thisStudent.getEnrollmentInfo().getFailedBag().getCourse(i).toString() + " "+ thisStudent.getMajor().getAreaRequirement(thisStudent.getEnrollmentInfo().getFailedBag().getCourse(i)) + "\n");
		}
		failedCourses.setText(myText);
		myText = " ";
		for(int i = 0; i< thisStudent.getEnrollmentInfo().getCurrentBag().getSize();i++){
			myText = myText + ( thisStudent.getEnrollmentInfo().getCurrentBag().getCourse(i).toStringWithAidInfo() + " "+ thisStudent.getMajor().getAreaRequirement(thisStudent.getEnrollmentInfo().getCurrentBag().getCourse(i)) + "\n");
		}
		currentCourses.setText(myText);
		
		
		
		//The following checks to see which courses have been taking already, or are currently being taken, do that they do not appear
		//under the several "Courses Required" sections.
		myText = " ";
		boolean alreadyDone = false;
		
		//groups humanities and social science courses under one "Non Major required" section
		for(int i = 0; i< thisStudent.getEnrollmentInfo().getMyMajor().getHumanitiesSize();i++){
			alreadyDone = false;
			for(int j = 0; j <thisStudent.getEnrollmentInfo().getNeededBag().getSize(); j++){
				if(thisStudent.getEnrollmentInfo().getMyMajor().getHumanititesCourse(i).equals(thisStudent.getEnrollmentInfo().getNeededBag().getCourse(j))) {
						alreadyDone = true;
						break;
				}
			}
			for(int q = 0; q<thisStudent.getEnrollmentInfo().getCurrentBag().getSize(); q++){
				if(thisStudent.getEnrollmentInfo().getMyMajor().getHumanititesCourse(i).equals(thisStudent.getEnrollmentInfo().getCurrentBag().getCourse(q))) {
					alreadyDone = true;
					break;
				}
			}
			if (alreadyDone == false)
			myText = myText + ( thisStudent.getEnrollmentInfo().getMyMajor().getHumanititesCourse(i).toStringForNeeded() +  "\n");
		}
		alreadyDone = false;
		for(int i = 0; i< thisStudent.getEnrollmentInfo().getMyMajor().getSocialSciencesSize();i++){
			alreadyDone = false;
			for(int j = 0; j <thisStudent.getEnrollmentInfo().getNeededBag().getSize(); j++){
				if(thisStudent.getEnrollmentInfo().getMyMajor().getSSCourse(i).equals(thisStudent.getEnrollmentInfo().getNeededBag().getCourse(j))) 
						alreadyDone = true;
			}
			for(int q = 0; q<thisStudent.getEnrollmentInfo().getCurrentBag().getSize(); q++){
				if(thisStudent.getEnrollmentInfo().getMyMajor().getSSCourse(i).equals(thisStudent.getEnrollmentInfo().getCurrentBag().getCourse(q))) 
					alreadyDone = true;
			}
			if (alreadyDone == false)
			myText = myText + ( thisStudent.getEnrollmentInfo().getMyMajor().getSSCourse(i).toStringForNeeded() +  "\n");
		}
		
		nonMajorCoursesNeeded.setText(myText);
		//------------------------------------------------------
		myText = " ";
		alreadyDone = false;
		System.out.println(thisStudent.getEnrollmentInfo().getMyMajor().getMajorCoursesSize());
		for(int i = 0; i< thisStudent.getEnrollmentInfo().getMyMajor().getMajorCoursesSize();i++){
			System.out.println(thisStudent.getEnrollmentInfo().getMyMajor().getMajorCourse(i).toString());
			for(int j = 0; j <thisStudent.getEnrollmentInfo().getNeededBag().getSize(); j++){
				if(thisStudent.getEnrollmentInfo().getMyMajor().getMajorCourse(i).equals(thisStudent.getEnrollmentInfo().getNeededBag().getCourse(j))) {
					System.out.println(thisStudent.getEnrollmentInfo().getMyMajor().getMajorCourse(i).getTitle() + " = " + thisStudent.getEnrollmentInfo().getNeededBag().getCourse(j).getTitle());
						alreadyDone = true;
				}
			}
//			for(int q = 0; q<thisStudent.getEnrollmentInfo().getCurrentBag().getSize(); q++){
//				if(thisStudent.getEnrollmentInfo().getMyMajor().getMajorCourse(i).equals(thisStudent.getEnrollmentInfo().getCurrentBag().getCourse(q))) 
//					alreadyDone = true;
//			}
			if (alreadyDone == false)
			myText = myText + ( thisStudent.getEnrollmentInfo().getMyMajor().getMajorCourse(i).toStringForNeeded() +  "\n");
		}
		majorCoursesNeeded.setText(myText);
		//----------------------------------------------------------
		myText = " ";
		alreadyDone = false;
		for(int i = 0; i< thisStudent.getEnrollmentInfo().getMyMajor().getSciencesCoursesSize();i++){
			for(int j = 0; j <thisStudent.getEnrollmentInfo().getNeededBag().getSize(); j++){
				if(thisStudent.getEnrollmentInfo().getMyMajor().getScienceCourse(i).equals(thisStudent.getEnrollmentInfo().getNeededBag().getCourse(j))) 
						alreadyDone = true;
			}
			for(int q = 0; q<thisStudent.getEnrollmentInfo().getCurrentBag().getSize(); q++){
				if(thisStudent.getEnrollmentInfo().getMyMajor().getScienceCourse(i).equals(thisStudent.getEnrollmentInfo().getCurrentBag().getCourse(q))) 
					alreadyDone = true;
			}
			if (alreadyDone == false)
			myText = myText + ( thisStudent.getEnrollmentInfo().getMyMajor().getScienceCourse(i).toStringForNeeded() +  "\n");
		}
		scienceCoursesNeeded.setText(myText);
		//------------------------------------------------------------
		myText = " ";
		alreadyDone = false;
		for(int i = 0; i< thisStudent.getEnrollmentInfo().getMyMajor().getMathSize();i++){
			for(int j = 0; j <thisStudent.getEnrollmentInfo().getNeededBag().getSize(); j++){
				if(thisStudent.getEnrollmentInfo().getMyMajor().getMathCourse(i).equals(thisStudent.getEnrollmentInfo().getNeededBag().getCourse(j))) 
						alreadyDone = true;
			}
			for(int q = 0; q<thisStudent.getEnrollmentInfo().getCurrentBag().getSize(); q++){
				if(thisStudent.getEnrollmentInfo().getMyMajor().getMathCourse(i).equals(thisStudent.getEnrollmentInfo().getCurrentBag().getCourse(q))) 
					alreadyDone = true;
			}
			if (alreadyDone == false)
			myText = myText + ( thisStudent.getEnrollmentInfo().getMyMajor().getScienceCourse(i).toStringForNeeded() +  "\n");
		}
		mathCoursesNeeded.setText(myText);
		
		programRequirements.setText(" Minimum GPA: " + thisStudent.getMajor().getMinimumGPA() +
									"\n Total Credits Required: " + thisStudent.getMajor().getTotalCreditsRequired()
									+ "\n Minimum Number of SCCC Credits: " + 30.0);
		thisStudent.calculateCredits();
		summary.setText("Total Credits Taken at SCCC: "+thisStudent.getTotalCredits() +"\n" + "Total Credits Toward Degree: " +thisStudent.getMajorCredits());
		
		
		
		
	}

	
	
	
	
	
	
	public GridPane getMyGrid(){
		
		//I read that preferred size was not the best option to use here... is this all right?
		basicInfo.setPrefSize(100, 100);
		basicInfo.setEditable(false);
		
		requiredCourses.setPrefSize(50, 150);
		requiredCourses.setEditable(false);
		
		otherCourses.setPrefSize(50, 150);
		otherCourses.setEditable(false);
		
		failedCourses.setPrefSize(50, 150);
		failedCourses.setEditable(false);
		
		currentCourses.setPrefSize(100, 100);
		currentCourses.setEditable(false);
		
		PEcoursesNeeded.setPrefSize(100,50);
		PEcoursesNeeded.setEditable(false);
		
		mathCoursesNeeded.setPrefSize(100,50);
		mathCoursesNeeded.setEditable(false);
		
		majorCoursesNeeded.setPrefSize(100,50);
		majorCoursesNeeded.setEditable(false);
		
		scienceCoursesNeeded.setPrefSize(100,50);
		scienceCoursesNeeded.setEditable(false);
		
		nonMajorCoursesNeeded.setPrefSize(100,50);
		nonMajorCoursesNeeded.setEditable(false);
		
		programRequirements.setPrefSize(100, 100);
		programRequirements.setEditable(false);
		
		
		grid.setHgap(10);
		grid.setVgap(5);
		grid.setConstraints(basicInfo, 1, 2, 40, 10);
		
		
		
		grid.add(b1, 43, 2);
		grid.add(title, 24, 0);
		
		
		grid.add(basicInfoLB, 1, 1);
		grid.add(basicInfo, 1, 2);
		
		grid.setConstraints(requiredCourses, 1, 13, 4, 15);
		grid.add(requiredCoursesLB, 1, 12);
		grid.add(requiredCourses, 1, 13);
		
		grid.setConstraints(otherCourses, 6, 13, 12, 15);
		grid.add(otherCoursesLB, 6, 12);
		grid.add(otherCourses, 6, 13);
		
		grid.setConstraints(failedCourses, 19, 13, 6, 15);
		grid.add(failedCoursesLB, 19, 12);
		grid.add(failedCourses, 19, 13);
		
		grid.setConstraints(currentCourses, 21, 13, 5, 15);
		grid.add(currentCoursesLB,33, 12);
		grid.add(currentCourses, 33, 13);
		
		grid.setConstraints(PEcoursesNeeded, 1, 35, 20, 3);
		grid.add(PENeededLB, 1, 34);
		grid.add(PEcoursesNeeded, 1, 35);
		grid.setConstraints(majorCoursesNeeded, 1, 30, 20, 3);
		grid.add(majorNeededLB, 1, 29);
		grid.add(majorCoursesNeeded, 1, 30);
		grid.setConstraints(nonMajorCoursesNeeded, 21, 30, 20, 3);
		grid.add(nonMajorCoursesNeeded, 21, 30);
		grid.add(nonMajorNeededLB, 21, 29);
		
		grid.setConstraints(mathCoursesNeeded, 21, 35, 20, 3);
		grid.add(mathNeededLB, 21, 34);
		grid.add(mathCoursesNeeded, 21, 35);
		
		//grid.add(scienceCoursesNeeded, 1, 40);
		grid.setConstraints(programRequirements, 1, 40, 40, 1);
		grid.add(programRequirementsLB, 1, 39);
		grid.add(programRequirements, 1, 40);
		
		grid.setConstraints(summary, 1, 43, 40, 1);
		grid.add(new Label("Summary:"), 1, 42);
		grid.add(summary, 1, 43);
		summary.setEditable(true);
		
		grid.add(update,43,4);
		
		
		return grid;
	}
	
	public void hide(){
		grid.setVisible(false);
//		basicInfo.setVisible(false);
//		requiredCourses.setVisible(false);
//		otherCourses.setVisible(false);
//		failedCourses.setVisible(false);
//		currentCourses.setVisible(false);
//		PEcoursesNeeded.setVisible(false);
//		majorCoursesNeeded.setVisible(false);
//		scienceCoursesNeeded.setVisible(false);
//		mathCoursesNeeded.setVisible(false);
//		nonMajorCoursesNeeded.setVisible(false);
//		programRequirements.setVisible(false);
//		summary.setVisible(false);
//		title.setVisible(false);
//		basicInfoLB.setVisible(false);
//		requiredCoursesLB.setVisible(false);
//		otherCoursesLB.setVisible(false);
//		failedCoursesLB.setVisible(false);
//		coursesNeededLB.setVisible(false);
//		PENeededLB.setVisible(false);
//		majorNeededLB.setVisible(false);
//		nonMajorNeededLB.setVisible(false);
//		mathNeededLB.setVisible(false);
//		scienceNeededLB.setVisible(false);
//		currentCoursesLB.setVisible(false);
//		programRequirementsLB.setVisible(false);
//		b1 = new Button("What If");
//		update = new Button("Update SAIN");
			
	}
	public void show(){
		grid.setVisible(true);
	}


}
