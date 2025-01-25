1)TYPE Casting Program :

package labs;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		        
		        int intValue = 100;
		        double doubleValue = intValue; 
		        
		        System.out.println("Implicit Casting (int to double) : " + doubleValue);        
		        
		        double dValue = 99.99;
		        int iValue = (int) dValue;  
		        System.out.println("Explicit Casting (double to int) : " + iValue);
		      
		        char charValue = 'A'; 
		        int intFromChar = charValue;  
		        System.out.println("Implicit Casting (char to int)   : " + intFromChar);
		        
		        long longValue = 5000;
		        short shortValue = (short) longValue; 

		        System.out.println("Explicit Casting (long to short) : " + shortValue);
		    }
		}

OUTPUT :
	Implicit Casting (int to double) : 100.0
	Explicit Casting (double to int) : 99
	Implicit Casting (char to int)   : 65
	Explicit Casting (long to short) : 5000







2)Variable Program:

package labs;

public class VariableDemo {
	
	    private int instanceVar = 10; 
	    private static int staticVar = 20;

	    public void myMethod() {
	        int localVar = 30; 
	        System.out.println("Local variable: " + localVar); 
	    }

	    public static void main(String[] args) 
	    {
	        VariableDemo obj = new VariableDemo();
	        
	        System.out.println("Instance variable: " + obj.instanceVar); 
	        System.out.println("Static variable: " + staticVar);
	        obj.myMethod(); 
	    }
	}

OUTPUT :
	Instance variable: 10
	Static variable: 20
	Local variable: 30
