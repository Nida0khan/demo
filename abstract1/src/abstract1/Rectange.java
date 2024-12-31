package abstract1;

import java.util.Scanner;

public class Rectange extends Shape {
	float l,b;
	Scanner sc=new Scanner(System.in);
	@Override
	 void input() {
		System.out.println("enter the length");
		l=sc.nextFloat();
		System.out.println("enter the breadth");
		b=sc.nextFloat();
	}
		@Override
		void calculateArea() {
		
			area = l*b;
	
}

@Override
void displayArea() {
	System.out.println("the area of rectangle"+area);

}

}
