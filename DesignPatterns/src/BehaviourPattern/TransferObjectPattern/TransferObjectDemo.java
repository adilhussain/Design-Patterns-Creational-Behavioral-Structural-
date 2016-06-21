package BehaviourPattern.TransferObjectPattern;

public class TransferObjectDemo {
	public static void main(String[] args) {
		StudentBO studentObj = new StudentBO();
		studentObj.insertStudent(new StudentVO("Adil", 4));
		studentObj.printAllUsers();
		studentObj.updateStudent(new StudentVO("Kela", 0));
		studentObj.printAllUsers();
	}
}
