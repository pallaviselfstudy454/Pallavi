1) Employee

package labs;

public class Employee {

		    private String name;
		    private int employeeId;
		    private double salary;
		    public Employee(String name, int employeeId, double salary)
		    {
		        this.name = name;
		        this.employeeId = employeeId;
		        this.salary = salary;
		    }

		    public String getName() 
		    {
		        return name;
		    }

		    public void setName(String name)
		    {
		        this.name = name;
		    }

		    public int getEmployeeId() 
		    {
		        return employeeId;
		    }

		    public void setEmployeeId(int employeeId) 
		    {
		        this.employeeId = employeeId;
		    }

		    public double getSalary() 
		    {
		        return salary;
		    }

		    public void setSalary(double salary) 
		    {
		        this.salary = salary;
		    }

		    public double calculateIncrementedSalary(double incrementPercentage)
		    {
		        return salary + (salary * incrementPercentage / 100);
		    }

		    public void printEmployeeDetails()
		    {
		        System.out.println("Employee Name: " + name);
		        System.out.println("Employee ID: " + employeeId);
		        System.out.println("Salary: " + salary);
		    }
		}
		

package labs;

public class EmployeeMain 
{
	    public static void main(String[] args)
	    {
	     
	        Employee employee1 = new Employee("John", 101, 50000.0);
	        Employee employee2 = new Employee("Smith", 102, 60000.0);

	        System.out.println("Employee 1 Details:");
	        employee1.printEmployeeDetails();
	        
	        
	        System.out.println("\nEmployee 2 Details:");
	        employee2.printEmployeeDetails();
	        
	        double incrementPercentage = 10.0; 

	        System.out.println("\nIncremented Salary for Employee 1: " + employee1.calculateIncrementedSalary(incrementPercentage));
	        System.out.println("Incremented Salary for Employee 2: " + employee2.calculateIncrementedSalary(incrementPercentage));
	    }
	}

OUTPUT :
	Employee 1 Details:
	Employee Name: John
	Employee ID: 101
	Salary: 50000.0

	Employee 2 Details:
	Employee Name: Smith
	Employee ID: 102
	Salary: 60000.0

	Incremented Salary for Employee 1: 55000.0
	Incremented Salary for Employee 2: 66000.0




2)Student

package labs;

public class Student {
	
	    private String name;
	    private int rollNo;
	    private int[] marks;

	    public Student(String name, int rollNo, int[] marks) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.marks = marks;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getRollNo() {
	        return rollNo;
	    }

	    public int[] getMarks() {
	        return marks;
	    }

	    public double calculatePercentage() {
	        int totalMarks = 0;
	        for (int mark : marks) {
	            totalMarks += mark;
	        }
	        return (double) totalMarks / marks.length;
	    }

	    public void printStudentDetails() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.print("Marks: ");
	        for (int mark : marks) {
	            System.out.print(mark + " ");
	        }
	        System.out.println();
	    }

	    public String getResult() {
	        double percentage = calculatePercentage();
	        return (percentage >= 60) ? "Pass" : "Fail"; 
	    }

	    public static void main(String[] args) {
	        int[] marks1 = {85, 90, 78, 88, 92};
	        Student student1 = new Student("Alice", 1, marks1);

	        int[] marks2 = {70, 65, 80, 75, 68};
	        Student student2 = new Student("Bob", 2, marks2);

	        System.out.println("Student 1 Details:");
	        student1.printStudentDetails();
	        System.out.println("Percentage: " + student1.calculatePercentage() + "%");
	        System.out.println("Result: " + student1.getResult());

	        System.out.println("\nStudent 2 Details:");
	        student2.printStudentDetails();
	        System.out.println("Percentage: " + student2.calculatePercentage() + "%");
	        System.out.println("Result: " + student2.getResult());
	    }
	}

package labs;

public class StudentMain {
	    public static void main(String[] args) {
	        
	        int[] marks1 = {85, 90, 78, 88, 92};
	        Student student1 = new Student("Alice", 1, marks1);

	        int[] marks2 = {70, 65, 80, 75, 68};
	        Student student2 = new Student("Bob", 2, marks2);

	        System.out.println("Student 1 Details:");
	        student1.printStudentDetails();
	        student1.getResult();

	        System.out.println("\nStudent 2 Details:");
	        student2.printStudentDetails();
	        student2.getResult();
	    }
	}


OUTPUT :
	Student 1 Details:
	Student Name: Alice
	Roll No: 1
	Marks: 85 90 78 88 92 
	Percentage: 86.6%
	Result: Pass

	Student 2 Details:
	Student Name: Bob
	Roll No: 2
	Marks: 70 65 80 75 68 
	Percentage: 71.6%
	Result: Pass



