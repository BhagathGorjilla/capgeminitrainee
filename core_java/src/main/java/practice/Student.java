package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	private String studentName;
	private int studentRoll;
	private int studentScore;
	
	public Student() {}
	
	public Student(String studentName, Integer studentRoll , Integer studentScore){
		super();
		this.studentName=studentName;
		this.studentRoll=studentRoll;
		this.studentScore=studentScore;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public int getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRoll=" + studentRoll + ", studentScore=" + studentScore
				+ "]";
	}
	
	public  static class Implemenation{
	
		ArrayList<Student> StudentList;
		
		public List<Student> sortByScore(List<Student> List){
			
		return StudentList.stream().sorted((s1,s2)->s1.getStudentScore()-s2.getStudentScore()).collect(Collectors.toList());
		
		// return Collections.sort(StudentList,(s1,s2)->s1.getStudentScore()-s2.getStudentScore());
		 }
}
	public static void main(String[] args) { 
		
	        Implemenation obj=new Implemenation();
	        obj.StudentList = new ArrayList<Student>(); 
			
	        obj.StudentList.add(new Student("goa",1,360));
	    	obj.StudentList.add(new Student("mumbai",1,3));
	    	obj.StudentList.add(new Student("hyderabad",1,66));
		
		System.out.println(obj.sortByScore(obj.StudentList));
	
	}

}
