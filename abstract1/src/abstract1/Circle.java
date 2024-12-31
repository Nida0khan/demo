package abstract1;

import java.util.Scanner;

public class Circle extends Shape{
	float r;
	Scanner sc=new Scanner(System.in);
	@Override
	void input() {
		System.out.println("Enter the radius of circle");
		r=sc.nextFloat();
		
	}
	@Override
	void calculateArea() {
		area=3.14f*r*r;
		
	}
	@Override
	void displayArea()
	{
		System.out.println("the area of circle"+area);
	}
	
	

}
