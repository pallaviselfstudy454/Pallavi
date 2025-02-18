1)encapsulation

package lab15;
public class Person 
{
	    private String name;
	    private int age;

	    public Person(String name, int age)
	    {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() 
	    {
	        return name;
	    }

	    public int getAge() 
	    {
	        return age;
	    }

	    public void setName(String name)
	    {
	        this.name = name;
	    }

	    public void setAge(int age) 
	    {
	        if (age >= 0) 
	        { 
	            this.age = age;
	        } else {
	            System.out.println("Invalid age. Age cannot be negative.");
	        }
	    }

	    public void displayInfo() 
	    {
	        System.out.println("Name   : " + name);
	        System.out.println("Age    : " + age);
	    }


	    public static void main(String[] args)
	    {
	        Person person = new Person("Laxman", 30);
	        
	        System.out.println("Initial Name : " + person.getName());
	        System.out.println("Initial Age  : " + person.getAge());

	        person.setName("Ram");
	        person.setAge(35);

	        System.out.println("Updated Name : " + person.getName());
	        System.out.println("Updated Age  : " + person.getAge());

	        person.setAge(-5); 
	        person.displayInfo();
	    }
	}

OUTPUT :
	Initial Name : Laxman
	Initial Age  : 30
	Updated Name : Ram
	Updated Age  : 35
	Invalid age. Age cannot be negative.
	Name   : Ram
	Age    : 35


2)student details :

package lab15;
abstract class Student 
{
	public abstract void printName();
    public abstract void printMajor();
    public abstract void printGradeLevel();
    
    public void printUniversity()
    {
        System.out.println("University: Example University");
    }

}

package lab15;
public class Undergraduate extends Student {
    private String name;
    private String major;
    private int gradeLevel;
    
    public Undergraduate (String name, String major, int gradeLevel) 
    {
        this.name = name;
        this.major = major;
        this.gradeLevel = gradeLevel;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printMajor() {
        System.out.println("Major: " + major);
    }

    public void printGradeLevel() {
        System.out.println("Grade Level: " + gradeLevel);
    }
}

package lab15;
public class Graduate extends Student 
{
    private String name;
    private String specialization; 
    private String thesisTopic;

    public Graduate(String name, String specialization, String thesisTopic) 
    {
        this.name = name;
        this.specialization = specialization;
        this.thesisTopic = thesisTopic;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printMajor() {
        System.out.println("Specialization: " + specialization);
    }

    public void printGradeLevel() {
       System.out.println("Thesis Topic: "+ thesisTopic);
    }
}

package lab15;

public class StudentDemo 
{
	 public static void main(String[] args) 
	 {
	        Undergraduate undergrad = new Undergraduate("Aarti", "Computer Science", 3);
	        Graduate grad = new Graduate("Bharti", "Artificial Intelligence", "Deep Learning Models");

	        System.out.println("Undergraduate Student Details :");
	        undergrad.printName();
	        undergrad.printMajor();
	        undergrad.printGradeLevel();
	        undergrad.printUniversity(); 

	        System.out.println("\nGraduate Student Details    :");
	        grad.printName();
	        grad.printMajor();
	        grad.printGradeLevel();
	        grad.printUniversity(); 
	 }
}

OUTPUT :
	Undergraduate Student Details :
	Name: Aarti
	Major: Computer Science
	Grade Level: 3
	University: Example University

	Graduate Student Details    :
	Name: Bharti
	Specialization: Artificial Intelligence
	Thesis Topic: Deep Learning Models
	University: Example University



