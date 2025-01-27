1)Electricity Bill

1)Electricity Bill

package labs2;

import java.util.Scanner;
public class ElectricityBill {
	    public static void main(String[] args) 
	    {	
	        Scanner scanner = new Scanner(System.in); 

	        System.out.print("Enter the number of units consumed: ");
	        int units = scanner.nextInt();

	        double bill = calculateBill(units);

	        System.out.printf("Total electricity bill: %.2f\n", bill); 
	    }

	    public static double calculateBill(int units)
	    {
	        double rate; 

	        if (units <= 100) {
	            rate = 4.5;
	        } else if (units <= 200) {
	            rate = 6.0;
	        } else if (units <= 300) {
	            rate = 8.0;
	        } else {
	            rate = 9.0;
	        }

	        return units * rate; 
	    }
	}

OUTPUT :
	Enter the number of units consumed: 2134
	Total electricity bill: 19206.00


2)Area

package labs2;

import java.util.Scanner;
public class Area {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        //Area of square
	        System.out.print("Enter the side of the square: ");
	        double side = scanner.nextDouble();

	        double squareArea = side * side;
	        System.out.println("Area of the square: " + squareArea);
	        
	        //Area of rectangle  
	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();
	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();

	        double rectangleArea = length * width;
	        System.out.println("Area of the rectangle: " + rectangleArea);
	        

	        //area of the triangle
	        System.out.print("Enter the base of the triangle: ");
	        double base = scanner.nextDouble();
	        System.out.print("Enter the height of the triangle: ");
	        double height = scanner.nextDouble();

	        double triangleArea = 0.5 * base * height;
	        System.out.println("Area of the triangle: " + triangleArea);

	        //area of the Circle
	        System.out.print("Enter radius of circle: ");
	        double circleRadius = scanner.nextDouble();
	        System.out.println("Area of circle: " + circleRadius);

	    }
}

OUTPUT :
	Enter the side of the square: 25
	Area of the square: 625.0
	Enter the length of the rectangle: 25
	Enter the width of the rectangle: 6
	Area of the rectangle: 150.0
	Enter the base of the triangle: 30
	Enter the height of the triangle: 21
	Area of the triangle: 315.0
	Enter radius of circle: 23
	Area of circle: 23.0


