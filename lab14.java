1)AreaCalculator

package lab14;
public class AreaCalculator 
{
	 public double calculateArea(double length, double width) {
	        return length * width;
	    }

	    public double calculateArea(double side) {
	        return side * side;
	    }

	   	    public double calculateArea(double radius, String shape) 
	   	    {
	   	    	if (shape.equalsIgnoreCase("circle")) 
	   	    	{ 
	            return Math.PI * radius * radius;
	        } else {
	            System.out.println("Invalid Shape");
	            return 0; 
	            }
	   	    }

	    public double calculateArea(int base, int height) 
	    { 
	        return 0.5 * base * height;
	    }

	    public static void main(String[] args) {
	        AreaCalculator calculator = new AreaCalculator();

	        double rectangleArea = calculator.calculateArea(5.0, 10.0);
	        double squareArea = calculator.calculateArea(7.0);
	        double circleArea = calculator.calculateArea(4.0, "circle");
	        double triangleArea = calculator.calculateArea(8, 6);

	        System.out.println("Area of rectangle  : " + rectangleArea);
	        System.out.println("Area of square     : " + squareArea);
	        System.out.println("Area of circle     : " + circleArea);
	        System.out.println("Area of triangle   : " + triangleArea);
	        
	        double area1 = calculator.calculateArea(5,6); 
	        double area2 = calculator.calculateArea(5.0,6.0); 
	        System.out.println("Area1  : "+area1);
	        System.out.println("Area2  : "+area2);
	    }
	}

OUTPUT :
	Area of rectangle  : 50.0
	Area of square     : 49.0
	Area of circle     : 50.26548245743669
	Area of triangle   : 24.0
	Area1  : 15.0
	Area2  : 30.0


2)Polymorphism

package lab14;
public class Animal 
{
	    public void makeSound() {
	        System.out.println("Generic animal sound");
	    }

	    public void eat() {
	        System.out.println("Animal is eating");
	    }
	}

package lab14;
public class Dog extends Animal 
{
    @Override  
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() 
    { 
        System.out.println("Dog is fetching");
    }
}

package lab14;
public class Cat extends Animal 
{
    @Override
    public void makeSound() 
    {
        System.out.println("Meow!");
    }

    public void scratch() 
    { 
        System.out.println("Cat is scratching");
    }
}

package lab14;
public class PolymorphismDemo
{
	public static void main(String[] args) 
	{
       
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        System.out.println("Animal:");
        myAnimal.makeSound(); 
        myAnimal.eat();

        System.out.println("\nDog:");
        myDog.makeSound();   
        myDog.eat();         
        myDog.fetch();       
        
        System.out.println("\nCat:");
        myCat.makeSound();   
        myCat.eat();         
        myCat.scratch();     

        System.out.println("\nRuntime Polymorphism:");
        Animal animalRef; 

        animalRef = myDog; 
        animalRef.makeSound(); 
        animalRef.eat();
        
        animalRef = myCat; 
        animalRef.makeSound(); 
        animalRef.eat(); 
    }
}

OUTPUT :
 	Animal:
	Generic animal sound
	Animal is eating

	Dog:
	Woof!
	Animal is eating
	Dog is fetching

	Cat:
	Meow!
	Animal is eating
	Cat is scratching

	Runtime Polymorphism:
	Woof!
	Animal is eating
	Meow!
	Animal is eating
