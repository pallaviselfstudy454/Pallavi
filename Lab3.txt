1)Demonstrate Primitive DataType

package labs;

public class demo
{
	public static void main(String args[]) 
	{
		char a = 'A';
		int n = 12;
		byte u = 2;
		short d = 43;
		double i = 4.234;
		float p = 2.984f;
		long s = 2345;
		
		System.out.println("char:"+a);
		System.out.println("int :"+n);
		System.out.println("byte :"+u);
		System.out.println("short :"+d);
		System.out.println("double :"+i);
		System.out.println("float :"+p);
		System.out.println("long :"+s);
	}
}


Output :
	char : A
	int : 12
	byte : 2
	short : 43
	double : 4.234
	float : 2.984
	long : 2345



2) Student Result


package labs;

public class Student
{
	public static void main(String[] args)
	{
		
		        int[] marks = {12,54,69,86,88}; 
		        
		        int totalMarks = 0;
		        
		        for (int mark : marks) 
		        {
		            totalMarks += mark;
		        }

		        double percentage = (double) totalMarks / marks.length;

		       
		        String result = percentage >= 40 ? "Pass" : "Fail";
		    
		        System.out.println("Total Marks: " + totalMarks);
		        
		        System.out.println("Percentage: " + percentage + "%");
		        
		        System.out.println("Result: " + result);
		    }
	}
	
OUTPUT :
	Total Marks: 309
	Percentage: 61.8%
	Result: Pass