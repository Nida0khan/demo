package abstract1;

import java.util.Scanner;



public class Square extends Shape {
	float a;
	Scanner sc=new Scanner(System.in);
	@Override
	 void input() {
		System.out.println("enter the side");
		a=sc.nextFloat();
	
	}
		@Override
		void calculateArea() {
		
			area = a*a;
	
}

@Override
void displayArea() {
	System.out.println("the area of square"+area);

}

}

