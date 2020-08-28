package day43lambdadt;

public class Course {

	private String season;
	private String courseName;
	private int averageScore;
	private int numberOfStudents;
	
	public Course(String season, String courseName, int averageScore, int numberOfStudents) {
		this.season=season;
		this.courseName=courseName;
		this.averageScore=averageScore;
		this.numberOfStudents=numberOfStudents;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	public String toString() {
		return season + " - " + courseName + " - " + averageScore + " - " + numberOfStudents;
	}

}
