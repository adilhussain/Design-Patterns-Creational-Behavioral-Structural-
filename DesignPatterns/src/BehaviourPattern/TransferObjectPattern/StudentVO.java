package BehaviourPattern.TransferObjectPattern;

public class StudentVO {
	private String name;
	private int rollNo;
	
	public StudentVO(String name,int roll){
		this.name = name;
		this.rollNo = roll;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
