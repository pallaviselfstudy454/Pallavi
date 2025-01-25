1) CALCULATOR Program:

package labs;
public class calculator
{
		public void add(int a, int b) {
			System.out.println("Addition");
			int r = a+b;
			System.out.println(r);
		}
		public void sub(int a, int b) {
			System.out.println("Substraction");
			int r = a-b;
			System.out.println(r);
		}
		public void mult(int a, int b) {
			System.out.println("Multiplication");
			int r = a*b;
			System.out.println(r);
		}
		public void div(int a, int b) {
			System.out.println("Division");
			int r = a/b;
			System.out.println(r);
		}
		public static void main (String []args) {
			calculator c1 = new calculator();
			calculator c2 = new calculator();
			calculator c3 = new calculator();
			calculator c4 = new calculator();
			c1.add(5,  5);
			c2.sub(10, 6);
			c3.mult(25, 5);
			c4.div(152, 6);

		}
}


OUTPUT :
	Addition
	10
	Substraction
	4
	Multiplication
	125
	Division
	25






2)BANK Program :

package labs;

public class Bank
{

	public static void main(String[] args) {
		int acc_no = 5674890;
		String acc_holder_name = "ABC";
		
		double initial_amount = 10500.00;
		double deposite_amount = 80000.00;
		double withdrawl_amount = 5000.00;
		double result; 
		
		System.out.println("Account Number");
		System.out.println(acc_no);
		
		System.out.println("Account holder name");
		System.out.println(acc_holder_name);
		
		System.out.println("Initial amount in account");
		System.out.println(initial_amount);
		
		System.out.println("Amount Deposite");
		result = initial_amount+deposite_amount;
		
		System.out.println("Amount Withdrawl");
		result = result-withdrawl_amount;
		
		
		System.out.println("Printing final balance");
		System.out.println(result);
		
		
	}
}

	
OUTPUT :
	ABC
	Initial amount in account
	10500.0
	Amount Deposite
	Amount Withdrawl
	Printing final balance
	85500.0










