package week1.day2;

public class ConditionStatement {

	public static void main(String[] args) {
		int age=10;
		if (age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not Eligible to vote");
		}
		int mark=33;
		if (mark>=35) {
			System.out.println("pass");
		}
		else if(mark>=34) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("Fail");
		}
}
}