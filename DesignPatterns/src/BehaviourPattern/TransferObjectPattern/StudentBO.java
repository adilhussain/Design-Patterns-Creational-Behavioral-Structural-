package BehaviourPattern.TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	List<StudentVO> students;
	public StudentBO(){
		students = new ArrayList<StudentVO>();
		students.add(new StudentVO("Abhilash", 0));
		students.add(new StudentVO("Setty", 1));
	}
	public StudentVO getStudent(int rollNo){
		return students.get(rollNo);
	}
	public boolean insertStudent(StudentVO newStudent){
		return students.add(new StudentVO(newStudent.getName(), newStudent.getRollNo()));
	}
	public void deleteStudent(StudentVO student){
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No "
				+ student.getRollNo() +", deleted from database");
	}
	public List<StudentVO> getAllStudents(){
		return students;
	}
	public void updateStudent(StudentVO newStudent){
		students.get(newStudent.getRollNo()).setName(newStudent.getName());
	}
	public void printAllUsers(){
		for(StudentVO student : students){
			System.out.println(student.getRollNo() + " ::: " + student.getName());
		}
	}
}
