package model;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseBag implements Bag{
	
	ArrayList<Course> courseBag;
	
	public CourseBag(){
		courseBag = new ArrayList<Course>();
		Course cst111 = new Course("A","Introduction to Computer Science",4,"CST",111,0);
		courseBag.add(cst111);
		Course cst112 = new Course("A","Introduction to Programming",4,"CST",112,1);
		courseBag.add(cst112);
		Course cst141 = new Course("A","Principles of Computing Using Java",4,"CST",141,2);
		courseBag.add(cst141);
		Course cst161 = new Course("A","Web Site Design",4,"CST",161,3);
		courseBag.add(cst161);
		Course cst222 = new Course("A","Computer Architecture",4,"CST",222,4);
		courseBag.add(cst222);
		Course cst242 = new Course("A","Advanced Programming with Java",4,"CST",242,5);
		courseBag.add(cst242);
		Course cst246 = new Course("A","Data Structures",4,"CST",246,6);
		courseBag.add(cst246);
		
		Course eng101 = new Course("A","Standard Freshman Composition",3,"ENG",111,7);
		courseBag.add(eng101);
		Course eng102 = new Course("A","Introduction to literature",3,"ENG",102,8);
		courseBag.add(eng102);
		Course eng131 = new Course("A","Creative Writing",3,"ENG",131,9);
		courseBag.add(eng131);
		Course eng141 = new Course("A","Introduction to the Novel",3,"ENG",141,10);
		courseBag.add(eng141);
		
		Course pfs111 = new Course("A","Nutrition and Human Performance",3,"PFS",111,11);
		courseBag.add(pfs111);
		Course pfs114 = new Course("A","Overview of Fitness and Facility Management",3,"PFS",114,12);
		courseBag.add(pfs114);
		Course pfs201 = new Course("A","Exercise Leadership",3,"PFS",201,13);
		courseBag.add(pfs201);
		Course pfs205 = new Course("A","Fitness Assessment and Screening",3,"PFS",205,14);
		courseBag.add(pfs205);
		Course pfs209 = new Course("A","Kinesiology",3,"PFS",209,15);
		courseBag.add(pfs209);
		Course pfs217 = new Course("A","Fieldwork in fitness",3,"PFS",217,16);
		courseBag.add(pfs217);
		
		Course his101 = new Course("A","Western Civilization I",3,"HIS",101,17);
		courseBag.add(his101);
		Course his102 = new Course("A","Western Civilization II",3,"HIS",102,18);
		courseBag.add(his102);
		Course his103 = new Course("A","Foundations of American History",3,"HIS",103,19);
		courseBag.add(his103);
		Course his107 = new Course("A","Modern World History",3,"HIS",107,20);
		courseBag.add(his107);
		Course his119 = new Course("A","The Far Eastern World",3,"HIS",119,21);
		courseBag.add(his119);
		
		Course mus101 = new Course("A","Understanding Music",3,"MUS",101,22);
		courseBag.add(mus101);
		Course mus103 = new Course("A","History of Rock and Roll",3,"MUS",103,23);
		courseBag.add(mus103);
		Course mus117 = new Course("A","Music Fundamentals",3,"MUS",117,24);
		courseBag.add(mus117);
		Course mus122 = new Course("A","Music Theory I",3,"MUS",122,25);
		courseBag.add(mus122);
		Course mus121 = new Course("A","Basic Musicianship",3,"MUS",121,26);
		courseBag.add(mus121);
		
		Course thr101 = new Course("A","Understanding Theatre",3,"THR",101,27);
		courseBag.add(thr101);
		Course thr105 = new Course("A","Acting I",3,"THR",105,28);
		courseBag.add(thr105);
		Course thr115 = new Course("A","Basic Theatre Practice",3,"THR",115,29);
		courseBag.add(thr115);
		Course thr120 = new Course("A","Stage Makeup",3,"THR",120,30);
		courseBag.add(thr120);
		Course thr127 = new Course("A","Stage Combat",3,"THR",127,31);
		courseBag.add(thr127);
		Course thr152 = new Course("A","Production Laboratory I",3,"THR",152,32);
		courseBag.add(thr152);
		
		Course com101 = new Course("A","Intro to Communication",3,"COM",101,33);
		courseBag.add(com101);
		Course mat007 = new Course("A","Algebra I",3,"MAT",007,34);
		courseBag.add(mat007);
		Course mat103 = new Course("A","Statistics I",3,"MAT",103,35);
		courseBag.add(mat103);
		Course mat124 = new Course("A","Fundamentals of PreCalc I",4,"MAT",124,36);
		courseBag.add(mat124);
		Course mat141 = new Course("A","Calculus I",4,"MAT",141,37);
		courseBag.add(mat141);
		Course mat142 = new Course("A","Calculus II",4,"MAT",142,38);
		courseBag.add(mat142);
		Course mat205 = new Course("A","Discrete Math",4,"MAT",205,39);
		courseBag.add(mat205);
		Course mat206 = new Course("A","Linear Algebra",4,"MAT",205,40);
		courseBag.add(mat206);
		
		Course ped112 = new Course("A","Golf",3,"PED",112,41);
		courseBag.add(ped112);
		Course ped115 = new Course("A","Hiking Long Island Trails",3,"PED",115,42);
		courseBag.add(ped115);
		Course ped119 = new Course("A","Fitness Walking",3,"PED",119,42);
		courseBag.add(ped119);
		Course ped120 = new Course("A","Bicycling",3,"PED",120,43);
		courseBag.add(ped120);
		
		Course phy130 = new Course("A","Physics I",3,"PHY",130,44);
		courseBag.add(phy130);
		Course phy230 = new Course("A","Physics II",3,"PHY",230,45);
		courseBag.add(phy230);
		
		Course bio101 = new Course("A","Principles of Biology",3,"BIO",101,46);
		courseBag.add(bio101);
		Course che133 = new Course("A","College Chemistry I",3,"CHE",133,47);
		courseBag.add(che133);
		
		Course fre101 = new Course("A","Elementary French I",3,"FRE",101,48);
		courseBag.add(fre101);
		Course fre102 = new Course("A","Elementary French II",3,"FRE",102,49);
		courseBag.add(fre102);
		
		Course ger101 = new Course("A","Elementary German I",3,"GER",101,50);
		courseBag.add(ger101);
		Course ger102 = new Course("A","Elementary German II",3,"GER",102,51);
		courseBag.add(ger102);
		
		Course jpn101 = new Course("A","Elementary Japanese I",3,"JPN",101,52);
		courseBag.add(jpn101);
		Course jpn102 = new Course("A","Elementary Japanese II",3,"JPN",102,53);
		courseBag.add(jpn102);
		
		Course phl101 = new Course("A","Issues In Philosophy",3,"PHL",101,54);
		courseBag.add(phl101);
		Course phl111 = new Course("A","World Philosophies",3,"PHL",111,55);
		courseBag.add(phl111);
		
		Course cin114 = new Course("A","Introduction to Film Analysis",3,"CIN",114,56);
		courseBag.add(cin114);
		Course bus101 = new Course("A","Introduction to Business",3,"BUS",101,57);
		courseBag.add(bus101);
		Course bus102 = new Course("A","Money and Finance",3,"BUS",102,58);
		courseBag.add(bus102);
		
		Course art111 = new Course("A","Art History",3,"ART",111,59);
		courseBag.add(art111);
		Course art116 = new Course("A","Adobe Photoshop",3,"ART",116,60);
		courseBag.add(art116);
		
		Course mus124 = new Course("A","Piano I",2,"MUS",124,61);
		courseBag.add(mus124);
		Course mus128 = new Course("A","Piano II",2,"MUS",128,62);
		courseBag.add(mus128);
		Course mus123 = new Course("A","Aural Skills I",2,"MUS",123,63);
		courseBag.add(mus123);
		Course mus127 = new Course("A","Aural Skills II",2,"MUS",127,64);
		courseBag.add(mus127);
		Course mus206 = new Course("A","Music History I",3,"MUS",206,65);
		courseBag.add(mus206);
		Course mus126 = new Course("A","Music Theory II",3,"MUS",126,66);
		courseBag.add(mus126);
		
		Course psy101 = new Course("A","Introduction of Psychology",3,"PSY",101,67);
		courseBag.add(psy101);
		Course HSC112 = new Course("A","Safety, First Aid and CPR",3,"HSC",112,68);
		courseBag.add(HSC112);
		Course pfs212 = new Course("A","Injury Prevention and Management",3,"PFS",212,69);
		courseBag.add(pfs212);
		
		
	}

	@Override
	public void add(Object obj) {
		courseBag.add((Course)obj);
	}

	@Override
	public void remove(int i) {
		courseBag.remove(i);
		
	}

	@Override
	public Object search(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Potential way of doing it based on if subj and num existed in list, rather than entering index
//	public Course getCourse(String Subject, int number){
//		for(int i = 0; i < courseBag.size(); i++){
//			if(Subject.equals(courseBag.get(i).getTitle())){
//				return courseBag.get(i);
//			}
//		}
//	}
	
	public Course getCourse(int i){
		return courseBag.get(i);
	}
	public int getSize(){
		return courseBag.size();
	}

}
