package javalab;
import java.util.Scanner;
class employee{
	double salary,da,hra,salary1;
	employee(double salary,double da,double hra){
		this.salary=salary;
		this.da=da;
		this.hra=hra;}
	void display() {
		System.out.println("emloyee....  ");
	}
	void calculate() {
		salary1=salary+salary*(da/100)+salary*(hra/100);
		System.out.println(" Gross salary is"+salary1);
	}
	}
class Engineer extends employee{
	Engineer(double salary,double hra,double da){
		super(salary,da,hra);
	}
	void display() {
		super.display();
		super.calculate();
		System.out.println("engineer....");
	}
	void calculate() {
		System.out.println("the gross  salary ofengineer is "+salary1*2);
	}
	
}
public class Overriding {
	public static void main(String [] args) {
		double salary,hra,da;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic  salary of employee");
		salary =sc.nextDouble();
		System.out.println("enter the the percentage of da");
		da=sc.nextDouble();
		System.out.println("enter hra%");
		hra=sc.nextDouble();
		Engineer k=new Engineer(salary,da,hra);
		k.display();
		k.calculate();
		sc.close();
	}

}
