1)LeapYear

package labs;
import java.util.Scanner;

public class LeapYear
{
	public class LeapYearChecker {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        scanner.close();
	    }
	}
}

OUTPUT : 
	Enter a year: 2012
	2024 is a leap year.

2)Reverse Number

package labs;
import java.util.Scanner;

public class ReverseNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        int reversedNumber = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        System.out.println("Reversed number: " + reversedNumber);

	        scanner.close();
	    }
	}

OUTPUT :
	Enter an integer: 2003
	Reversed number: 3002
