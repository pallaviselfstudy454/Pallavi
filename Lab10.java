1)Student

package labs2;

public class Student {

	    String name;
	    int roll_no;
	    String phone_no;
	    String address;

	    public static void main(String[] args) {
	    	
	        Student student1 = new Student();
	        student1.name = "Sam";
	        student1.roll_no = 1;
	        student1.phone_no = "1234567890";
	        student1.address = "123 Main St";

	        Student student2 = new Student();
	        student2.name = "John";
	        student2.roll_no = 2;
	        student2.phone_no = "9876543210";
	        student2.address = "456 Oak Ave";

	        System.out.println("Student 1:");
	        System.out.println("Name: " + student1.name);
	        System.out.println("Roll No: " + student1.roll_no);
	        System.out.println("Phone No: " + student1.phone_no);
	        System.out.println("Address: " + student1.address);
	        System.out.println();

	        System.out.println("Student 2:");
	        System.out.println("Name: " + student2.name);
	        System.out.println("Roll No: " + student2.roll_no);
	        System.out.println("Phone No: " + student2.phone_no);
	        System.out.println("Address: " + student2.address);
	    }
	}
	

OUTPUT :

Student 1:
Name: Sam
Roll No: 1
Phone No: 1234567890
Address: 123 Main St

Student 2:
Name: John
Roll No: 2
Phone No: 9876543210
Address: 456 Oak Ave


2)Average

package labs2;

import java.util.Scanner;

public class Average 
{

    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        scanner.close();

        double average = calculateAverage(num1, num2, num3);

        System.out.println("The average of the three numbers is: " + average);
    }

    public static double calculateAverage(double num1, double num2, double num3)
 {
        return (num1 + num2 + num3) / 3.0;
    }
}

OUTPUT :

Enter the first number: 45
Enter the second number: 56
Enter the third number: 39
The average of the three numbers is: 46.666666666666664
