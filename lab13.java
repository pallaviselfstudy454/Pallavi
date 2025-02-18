1)Shape

package lab3;
interface Shape
{
	double getArea();
}


package lab3;
public class Rectangle  implements Shape 
{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}


package lab3;
public class Circle implements Shape 
{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


package lab3;
public class Triangle implements Shape 
{
    double base;
    double height;

    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() 
    {
        return 0.5 * base * height;
    }
  }


package lab3;
public class ShapeDemo 
{
	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(8, 6);

        System.out.println("Area of Rectangle  : " + rectangle.getArea());
        System.out.println("Area of Circle     : " + circle.getArea());
        System.out.println("Area of Triangle   : " + triangle.getArea());

        Shape s;

        s = rectangle;
        System.out.println("Area of rectangle  : " + s.getArea());

        s = circle;
        System.out.println("Area of circle     : " + s.getArea());

        s = triangle;
        System.out.println("Area of triangle   : " + s.getArea());
    }
}

OUTPUT :
	Area of Rectangle  : 50.0
	Area of Circle     : 153.93804002589985
	Area of Triangle   : 24.0
	Area of rectangle  : 50.0
	Area of circle     : 153.93804002589985
	Area of triangle   : 24.0


2)Employee

package lab13;
interface Employee 
{
	int getID();
    String getName();
    double getSalary();
    void setSalary(double salary); 
    void displayDetails();
}

package lab13;
public class SalariedEmployee implements Employee 
{
	    private int id;
	    private String name;
	    private double salary;

	    public SalariedEmployee(int id, String name, double salary) 
	    {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    public int getID() {
	        return id;
	    }

	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }


	    @Override
	    public void displayDetails() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }
	}


package lab13;
public class HourlyEmployee  implements Employee 
{
    private int id;
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(int id, String name, double hourlyRate, int hoursWorked) 
    {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() 
    {
        return name;
    }

    @Override
    public double getSalary() 
    {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void setSalary(double salary) 
    {
        System.out.println("Cannot directly set salary for hourly employee. Update hourly rate or hours worked.");
    }

    public void setHourlyRate(double hourlyRate) 
    {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) 
    {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + getSalary());
    }
}


package lab13;

public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
        SalariedEmployee emp1 = new SalariedEmployee(101, "Alice", 60000);
        HourlyEmployee emp2 = new HourlyEmployee(102, "Bob", 20, 40);

        emp1.displayDetails();
        System.out.println("--------------------"); // Separator
        emp2.displayDetails();

        Employee emp;

        emp = emp1;
        System.out.println("\nEmployee details :");
        emp.displayDetails();


        emp = emp2;
        System.out.println("\nEmployee details :");
        emp.displayDetails();

        emp1.setSalary(65000);
        System.out.println("\nUpdated salary for " + emp1.getName() + ": " + emp1.getSalary());

        emp2.setHourlyRate(25);
        emp2.setHoursWorked(45);
        System.out.println("\nUpdated details for " + emp2.getName() + ":");
        emp2.displayDetails();
    }
}

OUTPUT :
ID: 101
Name: Alice
Salary: 60000.0
--------------------
ID: 102
Name: Bob
Hourly Rate: 20.0
Hours Worked: 40
Salary: 800.0

Employee details :
ID: 101
Name: Alice
Salary: 60000.0

Employee details :
ID: 102
Name: Bob
Hourly Rate: 20.0
Hours Worked: 40
Salary: 800.0

Updated salary for Alice: 65000.0

Updated details for Bob:
ID: 102
Name: Bob
Hourly Rate: 25.0
Hours Worked: 45
Salary: 1125.0


