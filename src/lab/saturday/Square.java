package lab.saturday;
/**
Calculates the area of a square given a side SaturdayLab1: Data types. Variables. Constants. Problem 2
Write a java program that declares a variable to represent the side of a square.
The side of the square is 7 units. Compute and display the area of the square.
Save the program as Square.java */

//declare class Square
public class Square {
	//declare main method
	public static void main(String[] args) {
		
		//declare variable to store the side
		int side;
		//input
		//assign/store the value 7 to variable named side
		side = 7;
		
		//processing
		//declare a variable named area to store 
		//the area of the square
		int area;
		area = side * side;
		//output
		System.out.println("area is: "+ area);
	}

}
