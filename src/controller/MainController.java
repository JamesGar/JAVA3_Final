package controller;

import model.Account;
import model.Address;
import model.Admin;
import model.CourseBag;
import model.Enrollment;
import model.Faculty;
import model.LoginDataStore;
import model.Major;
import model.MajorBag;
import model.StaffBag;
import model.Student;
import model.StudentBag;
import view.FacadeGUI;
import view.MainView;

public class MainController {
	
	StaffBag staffBag;
	StudentBag studentBag;
    MainView view;
	FacadeGUI facade;
	MajorBag majorBag = new MajorBag();
	CourseBag courseBag = new CourseBag();
	
	//may need to add view in brackets
	public MainController(){
		staffBag = new StaffBag();
	
	}
	//This is here because of how the buttons work. controller needs to know view for things like switching
	//screens depending on info like valid log in, but because classes like FacadeGUI need controller, but not
	//view, we also need the above no arg constructor.
	public MainController(MainView v){
		
		//for now new instances of bag are created, but eventually prob gonna have to do what's written below:
		staffBag = new StaffBag();
		studentBag = new StudentBag();
		majorBag.add(new Major("Computer Science", 0 , 0 , 2.5 , 65.5 , 5101)); // major id of 0
		majorBag.add(new Major("Music", 0 , 0 , 2.0 , 70 , 5610)); // major id of 1
		majorBag.add(new Major("Fitness Specialist", 0 , 0 , 2.0 , 66 , 5299)); // major id of 2
		majorBag.add(new Major("Liberal Arts: History Emphasis", 0 , 0 , 2.8 , 64.5 , 5649)); // major id of 3
		majorBag.add(new Major("Theatre Arts", 0 , 0 , 2.0 , 68 , 5610)); // major id of 4
		
		majorBag.getMajor(0).addToHumanities(courseBag.getCourse(7));
		majorBag.getMajor(0).addToHumanities(courseBag.getCourse(8));
		majorBag.getMajor(0).addToMajor(courseBag.getCourse(0));
		majorBag.getMajor(0).addToMajor(courseBag.getCourse(1));
		majorBag.getMajor(0).addToMajor(courseBag.getCourse(2));
		majorBag.getMajor(0).addToMajor(courseBag.getCourse(4));
		majorBag.getMajor(0).addToMajor(courseBag.getCourse(5));
		majorBag.getMajor(0).addToMajor(courseBag.getCourse(6));
		majorBag.getMajor(0).addToMath(courseBag.getCourse(37));
		majorBag.getMajor(0).addToMath(courseBag.getCourse(38));
		majorBag.getMajor(0).addToSciences(courseBag.getCourse(44));
		majorBag.getMajor(0).addToSciences(courseBag.getCourse(45));
		
		majorBag.getMajor(1).addToHumanities(courseBag.getCourse(7));
		majorBag.getMajor(1).addToHumanities(courseBag.getCourse(8));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(25));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(61));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(62));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(63));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(64));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(65));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(23));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(22));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(24));
		majorBag.getMajor(1).addToMajor(courseBag.getCourse(26));
		
		majorBag.getMajor(2).addToHumanities(courseBag.getCourse(7));
		majorBag.getMajor(2).addToHumanities(courseBag.getCourse(8));
		majorBag.getMajor(2).addToMajor(courseBag.getCourse(11));
		majorBag.getMajor(2).addToMajor(courseBag.getCourse(68));
		majorBag.getMajor(2).addToMajor(courseBag.getCourse(69));
		majorBag.getMajor(2).addToMajor(courseBag.getCourse(12));
		majorBag.getMajor(2).addToMajor(courseBag.getCourse(13));
		majorBag.getMajor(2).addToMajor(courseBag.getCourse(14));
		majorBag.getMajor(2).addToMajor(courseBag.getCourse(15));
		majorBag.getMajor(2).addToMajor(courseBag.getCourse(16));
		majorBag.getMajor(2).addToSciences(courseBag.getCourse(67));
		majorBag.getMajor(2).addToSciences(courseBag.getCourse(46));
		
		majorBag.getMajor(3).addToHumanities(courseBag.getCourse(7));
		majorBag.getMajor(3).addToHumanities(courseBag.getCourse(8));
		majorBag.getMajor(3).addToSS(courseBag.getCourse(17));
		majorBag.getMajor(3).addToSS(courseBag.getCourse(18));
		majorBag.getMajor(3).addToSS(courseBag.getCourse(19));
		majorBag.getMajor(3).addToSS(courseBag.getCourse(20));
		majorBag.getMajor(3).addToSS(courseBag.getCourse(21));
		
		majorBag.getMajor(4).addToHumanities(courseBag.getCourse(7));
		majorBag.getMajor(4).addToHumanities(courseBag.getCourse(8));
		majorBag.getMajor(4).addToMajor(courseBag.getCourse(27));
		majorBag.getMajor(4).addToMajor(courseBag.getCourse(23));
		majorBag.getMajor(4).addToMajor(courseBag.getCourse(24));
		majorBag.getMajor(4).addToMajor(courseBag.getCourse(25));
		majorBag.getMajor(4).addToMajor(courseBag.getCourse(26));
		
	
	
		
		
		
		
		studentBag.add(new Student("Robert E.", " Bee ", new Address("Halsey Ave","Gettysburg","11888"),"unionH8tr@gmail.com", 1, 
									new Account("leer","gettysburg"),"Associates","Ammerman",majorBag,3.4,3.4, new Enrollment("Spring 2016", "Fall 2014",44.5),
									3));
		studentBag.add(new Student("Krill", " Gates ", new Address("Micro Sreet","Seattle","12944"),"gateKeepR@microsoft.com", 2, 
				new Account("gatesk","applesucks"),"Associates","Ammerman",majorBag,4.0,4.0, new Enrollment("Spring 2016", "Summer 2014",64.5),
				0));
		studentBag.add(new Student("William", " Shakesdeer ", new Address("Roanoke Streer","Riverhead","11978"),"starCrossedLover@gmail.com", 3, 
				new Account("shakesw","outbriefcandle"),"Associates","Ammerman",majorBag,2.3,2.5, new Enrollment("Spring 2016", "Fall 2015",72.5),
				4));
		studentBag.add(new Student("David", " Byrd ", new Address("Nowhere Road","Hampton Bays","11942"),"psychoKiller@yahoo.com", 4, 
				new Account("byrdd","daysgoby"),"Associates","Eastern",majorBag,3.4,3.2, new Enrollment("Spring 2016", "Fall 2014",56),
				1));
		studentBag.add(new Student("Bear", " Gryllson ", new Address("Bay Avenue","SouthHampton Pines","11234"),"bugEater@yahoo.com", 5, 
				new Account("gryllb","password"),"Associates","Grant",majorBag,2.9,3.0, new Enrollment("Spring 2016", "Summer 2014",33.5),
				2));
		
		//Taken courses that were taken by Robert E. Bee
		studentBag.getStudent(0).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(7));
		studentBag.getStudent(0).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(17));
		studentBag.getStudent(0).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(20));
		
		studentBag.getStudent(0).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(11));
		studentBag.getStudent(0).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(33));
		studentBag.getStudent(0).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(64));
		studentBag.getStudent(0).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(49));
		
		studentBag.getStudent(0).getEnrollmentInfo().getFailedBag().add(courseBag.getCourse(21));
		studentBag.getStudent(0).getEnrollmentInfo().getFailedBag().getCourse(0).setGrade("F");
		
		studentBag.getStudent(0).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(19));
		studentBag.getStudent(0).getEnrollmentInfo().getCurrentBag().getCourse(0).setFinancialAidInfo(true, true, true, false);
		studentBag.getStudent(0).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(8));
		studentBag.getStudent(0).getEnrollmentInfo().getCurrentBag().getCourse(1).setFinancialAidInfo(true, false, false, false);
		studentBag.getStudent(0).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(61));
		studentBag.getStudent(0).getEnrollmentInfo().getCurrentBag().getCourse(2).setFinancialAidInfo(false, false, false, false);
		
		
		//For Krill Gates:
		studentBag.getStudent(1).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(7));
		studentBag.getStudent(1).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(2));
		studentBag.getStudent(1).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(4));
		studentBag.getStudent(1).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(5));
		studentBag.getStudent(1).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(38));
		
		studentBag.getStudent(1).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(43));
		studentBag.getStudent(1).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(50));
		
		studentBag.getStudent(1).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(39));
		studentBag.getStudent(1).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(38));
		studentBag.getStudent(1).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(53));
		studentBag.getStudent(1).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(44));
		
		studentBag.getStudent(1).getEnrollmentInfo().getCurrentBag().getCourse(0).setFinancialAidInfo(true, true, true, true);
		studentBag.getStudent(1).getEnrollmentInfo().getCurrentBag().getCourse(1).setFinancialAidInfo(false, false, false, false);
		studentBag.getStudent(1).getEnrollmentInfo().getCurrentBag().getCourse(2).setFinancialAidInfo(false, false, false, false);
		studentBag.getStudent(1).getEnrollmentInfo().getCurrentBag().getCourse(2).setFinancialAidInfo(true, true, true, false);
		
		//William Shakesdeer:
		studentBag.getStudent(2).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(23));
		studentBag.getStudent(2).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(24));
		studentBag.getStudent(2).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(26));
		
		studentBag.getStudent(2).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(9));
		studentBag.getStudent(2).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(2));
		studentBag.getStudent(2).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(68));
		studentBag.getStudent(2).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(29));
		
		studentBag.getStudent(2).getEnrollmentInfo().getFailedBag().add(courseBag.getCourse(7));
		studentBag.getStudent(2).getEnrollmentInfo().getFailedBag().getCourse(0).setGrade("F");
		studentBag.getStudent(2).getEnrollmentInfo().getFailedBag().add(courseBag.getCourse(27));
		studentBag.getStudent(2).getEnrollmentInfo().getFailedBag().getCourse(1).setGrade("F");
		
		studentBag.getStudent(2).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(7));
		studentBag.getStudent(2).getEnrollmentInfo().getCurrentBag().getCourse(0).setFinancialAidInfo(true, true, true, true);
		studentBag.getStudent(2).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(34));
		studentBag.getStudent(2).getEnrollmentInfo().getCurrentBag().getCourse(1).setFinancialAidInfo(false, false, false, false);
		studentBag.getStudent(2).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(44));
		studentBag.getStudent(2).getEnrollmentInfo().getCurrentBag().getCourse(2).setFinancialAidInfo(false, false, false, false);
		studentBag.getStudent(2).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(47));
		studentBag.getStudent(2).getEnrollmentInfo().getCurrentBag().getCourse(2).setFinancialAidInfo(false, false, false, false);
		
		//David Byrd
		studentBag.getStudent(3).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(61));
		studentBag.getStudent(3).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(23));
		studentBag.getStudent(3).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(62));
		studentBag.getStudent(3).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(63));
		
		studentBag.getStudent(3).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(31));
		studentBag.getStudent(3).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(32));
		studentBag.getStudent(3).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(4));
		studentBag.getStudent(3).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(55));
		studentBag.getStudent(3).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(56));
		studentBag.getStudent(3).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(59));

		
		studentBag.getStudent(3).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(7));
		studentBag.getStudent(3).getEnrollmentInfo().getCurrentBag().getCourse(0).setFinancialAidInfo(true, true, true, false);
		studentBag.getStudent(3).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(24));
		studentBag.getStudent(3).getEnrollmentInfo().getCurrentBag().getCourse(1).setFinancialAidInfo(false, false, false, false);
		studentBag.getStudent(3).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(68));
		studentBag.getStudent(3).getEnrollmentInfo().getCurrentBag().getCourse(2).setFinancialAidInfo(false, false, false, false);
		studentBag.getStudent(3).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(42));
		studentBag.getStudent(3).getEnrollmentInfo().getCurrentBag().getCourse(2).setFinancialAidInfo(false, false, false, false);
		
		//Bear Gryllson
		studentBag.getStudent(4).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(11));
		studentBag.getStudent(4).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(12));
		studentBag.getStudent(4).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(14));
		studentBag.getStudent(4).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(15));
		studentBag.getStudent(4).getEnrollmentInfo().getNeededBag().add(courseBag.getCourse(16));
		
		
		studentBag.getStudent(4).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(37));
		studentBag.getStudent(4).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(33));
		studentBag.getStudent(4).getEnrollmentInfo().getTakenBag().add(courseBag.getCourse(21));

		
		studentBag.getStudent(4).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(13));
		studentBag.getStudent(4).getEnrollmentInfo().getCurrentBag().getCourse(0).setFinancialAidInfo(true, true, true, false);
		studentBag.getStudent(4).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(67));
		studentBag.getStudent(4).getEnrollmentInfo().getCurrentBag().getCourse(1).setFinancialAidInfo(true, true, true, false);
		studentBag.getStudent(4).getEnrollmentInfo().getCurrentBag().add(courseBag.getCourse(46));
		studentBag.getStudent(4).getEnrollmentInfo().getCurrentBag().getCourse(2).setFinancialAidInfo(true, true, true, false);
	
		
		
		staffBag.add(new Faculty("Herbert", "Teacher", new Address("Fleet st.","StonyBrook","11978"),"herbbieDaMan@mail.sunysuffolk.edu",0, new Account("teachh","monkey",1)));
		staffBag.add(new Faculty("Ben", "Chen", new Address("RiverHead Building","Selden","11979"),"imsanta@mail.sunysuffolk.edu",1, new Account("chenb","theinstructor",1)));
		staffBag.add(new Admin("Big", "Brother", new Address("Nobody Knows","Everywhere","??????"),"alwaysWatching124@yahoo.com",0, new Account("brothb","1984",2)));
		
		
		
	
	}
	
	
	//gets the 'userName' and 'passWord' strings from textFields
	public void loginClicked(String userName, String passWord){
		
		int accountValue = 0;
		//runs through existing Staff accounts first:
		accountValue = staffBag.verify(userName, passWord);
		//int studentId;
		
		if(accountValue == 0){
			Student thisStudent = studentBag.verify(userName, passWord);
			//System.out.println(thisStudent.toString());
				if(thisStudent != null){
					facade.setSainView(thisStudent);
				}
				else
					facade.makeDoesNotExistWindow();
		}
		else if(accountValue == 1 || accountValue == 2){
			facade.setStaffValue(accountValue);
			facade.setSearchView();
		}
		else
			System.out.println("Something went wrong with account values" + accountValue);
		
	}
	Student searchedStudent;
	public void searchClicked(int i){
		searchedStudent = null;
		searchedStudent = (Student) studentBag.search(i);
		if(searchedStudent!= null){
			facade.setSearchResults(searchedStudent.toString());
		}
		else
			facade.makeDoesNotExistWindow();
		
		
		
		
		
	}
	public void viewSearchedSain(){
		System.out.println("Got this far...");
		if(searchedStudent != null)
			facade.setSainView(searchedStudent);
		

	}
	
	public void updateSainClicked(){
		facade.setEditSainView(searchedStudent);
	}
	public void addStudentViewClicked(){
		facade.setAddStudentView();
	}
	public void whatIfClicked(){
		//adds majors to what-if? options:
		//temp: cant have add to comboBox everytime what if is clicked..
				facade.getWhatIfScreen().addOptions(majorBag.getMajor(0).getMyMajor(), majorBag.getMajor(1).getMyMajor(), majorBag.getMajor(2).getMyMajor()
						, majorBag.getMajor(3).getMyMajor(), majorBag.getMajor(4).getMyMajor());

		facade.setWhatIfView();
	}
	public void addStudentClicked(){
		boolean canContinue = true;
		
		try{
			Integer.parseInt(facade.getAddStudentPage().getMajor());
		}catch(NumberFormatException e1){
			facade.makeWrongMajorInputWindow();
			canContinue = false;
		}
		if(canContinue){
			if(Integer.parseInt(facade.getAddStudentPage().getMajor()) > majorBag.getSize()){
				canContinue = false;
				System.out.println("Major issue");
				facade.makeWrongMajorInputWindow();
			}
			//gpa try/catch is already checked by facade
			if(facade.getAddStudentPage().getGpa() > 4 || facade.getAddStudentPage().getGpa() < 0){
				canContinue = false;
				facade.makeWrongGpaInputWindow();
			}
				
			if(canContinue){
				Student newStudent = new Student(facade.getAddStudentPage().getFirstName(),facade.getAddStudentPage().getLastName(), 
						new Address(facade.getAddStudentPage().getStreet(),"NA",facade.getAddStudentPage().getZip()),facade.getAddStudentPage().getEmail(),
						(studentBag.getSize() + 1), new Account(facade.getAddStudentPage().getUserName(),facade.getAddStudentPage().getPassword()),
						facade.getAddStudentPage().getDegreeType(),facade.getAddStudentPage().getCampus(),majorBag,facade.getAddStudentPage().getGpa(),
						facade.getAddStudentPage().getGpa(), new Enrollment(facade.getAddStudentPage().getCurrentTerm(), facade.getAddStudentPage().getStartingTerm(),
						0),Integer.parseInt(facade.getAddStudentPage().getMajor()));
				studentBag.add(newStudent);
				facade.createdNewStudentWindow(newStudent.getId());
				facade.getAddStudentPage().hide();
				facade.getSearchScreen().show();
			}
		}
	}
	
	public void setFacade(FacadeGUI f){
		facade = f;
	}

}
