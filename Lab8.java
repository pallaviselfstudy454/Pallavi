1)BreakContinue :

public class BreakContinue {

    public static void main(String[] args) {
        // Example of 'break' statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i reaches 5
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Example of 'continue' statement
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { 
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
    }
}

OUTPUT:
	1 2 3 4 
	1 3 5 7 9 


2)StarPattern

package labs;

public class Star {
		    public static void main(String[] args) {
	        int rows = 4; 
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println(); 
	        }
	    }
	}

OUTPUT :

  	 *
  	***
       *****
      *******