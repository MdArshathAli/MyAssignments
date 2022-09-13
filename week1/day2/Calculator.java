package week1.day2;

public class Calculator {
	
	public void add(int num1,int num2) {
		System.out.println(num1+num2);

	}
	public void sub(float num1,int num2,int num3) {
		System.out.println(num1-num2-num3);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator ();
		cal.add(20, 15);
		cal.sub(1.5f, 15, 20);

	}

}
