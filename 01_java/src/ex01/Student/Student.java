package ex01.Student;

public class Student {
	
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
	}

	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	public double getAvg() {
		double avg = (float) (this.korean + this.english + this.math + this.science) / 4;
		
		
		return avg;
	}
	
	public String getGrade() {
		
		double avg = this.getAvg();
		String jum = null;
		if(avg >= 90) jum = "A학점";
		else if(avg >= 70) jum = "B학점";
		else if(avg >= 50) jum = "C학점";
		else if(avg >= 50) jum = "D학점";
		else jum = "F학점";
		return jum;
	}
	
	
	

}
