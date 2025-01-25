1)ReverseNumber

package labs;
import java.util.Scanner;   

public class LargestNo
{
	public static void main(String[] args)   
	{  
	int a, b, c, largest, temp;  
	 
	Scanner sc = new Scanner(System.in);  
	
	System.out.println("Enter the first number:");  
	a = sc.nextInt();  
	System.out.println("Enter the second number:");  
	b = sc.nextInt();  
	System.out.println("Enter the third number:");  
	c = sc.nextInt();
	
	temp=a>b?a:b;  
	largest=c>temp?c:temp;  
	 
	System.out.println("The largest number is: "+largest);  
	
	} 
}  


OUTPUT : 
	Enter the first number:
	12
	Enter the second number:
	56
	Enter the third number:
	98
	The largest number is: 98



2)Armstrong

package labs;

public class Arm 
{
	    public static void main(String[] args) {

	        int num = 370, number, temp, total = 0;

	        number = num;
	        while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }

	        if(total == num)
	            System.out.println(num + " is an Armstrong number");
	        else
	            System.out.println(num + " is not an Armstrong number");
	    }
	}

OUTPUT : 
	370 is an Armstrong number

