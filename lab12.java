1)BankAccount

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount implements BankAccount {
    private double balance;

    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount(1000.0);
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(1500.0);
    }
}

OUTPUT :
	Deposited       : 500.0
	Current balance : 1500.0
	Withdrawn       : 200.0
	Current balance : 1300.0
	Insufficient balance.


2)RectAngle


package lab3;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Width resized to             : " + this.width);
        } else {
            System.out.println("Width must be positive.");
        }
    }

    @Override
    public void resizeHeight(int height) {
        if (height > 0) {
            this.height = height;
            System.out.println("Height resized to            : " + this.height);
        } else {
            System.out.println("Height must be positive.");
        }
    }

    public void displayDimensions() {
        System.out.println("Rectangle dimensions - Width : " + width + ", Height: " + height);
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(10, 20);
        myRectangle.displayDimensions();
        myRectangle.resizeWidth(30);
        myRectangle.resizeHeight(40);
        myRectangle.displayDimensions();
    }
}

OUTPUT :
	Rectangle dimensions - Width : 10, Height: 20
	Width resized to             : 30
	Height resized to            : 40
	Rectangle dimensions - Width : 30, Height: 40

