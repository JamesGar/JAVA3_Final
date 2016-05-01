package model;

public class CurrentCourse extends Course{
	
	private boolean countsInProgram;
	private boolean nysFinAidElig;
	private boolean fedFinAidElig;
	private boolean repeat;

	public CurrentCourse(String grade, String title, double credits) {
		super(grade, title, credits);
		// TODO Auto-generated constructor stub
	}

	public CurrentCourse(String grade, String title, double credits,
			boolean countsInProgram, boolean nysFinAidElig,
			boolean fedFinAidElig, boolean repeat) {
		super(grade, title, credits);
		this.countsInProgram = countsInProgram;
		this.nysFinAidElig = nysFinAidElig;
		this.fedFinAidElig = fedFinAidElig;
		this.repeat = repeat;
	}

	public boolean isCountsInProgram() {
		return countsInProgram;
	}

	public void setCountsInProgram(boolean countsInProgram) {
		this.countsInProgram = countsInProgram;
	}

	public boolean isNysFinAidElig() {
		return nysFinAidElig;
	}

	public void setNysFinAidElig(boolean nysFinAidElig) {
		this.nysFinAidElig = nysFinAidElig;
	}

	public boolean isFedFinAidElig() {
		return fedFinAidElig;
	}

	public void setFedFinAidElig(boolean fedFinAidElig) {
		this.fedFinAidElig = fedFinAidElig;
	}

	public boolean isRepeat() {
		return repeat;
	}

	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}
	
	

}
