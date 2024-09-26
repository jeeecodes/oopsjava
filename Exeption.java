package javalab;
import java.util.Scanner;
public class Exeption {
	public static void main(String  []args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("Choose an operation");
		System.out.println("1:Arithmetic Operation");
		System.out.println("2:Array acess");
		System.out.println("3:exit");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			try{
				System.out.println("enter the numerator : ");
				int num=sc.nextInt();
				System.out.println("enter the denominator : ");
				int den=sc.nextInt();
				int result=num/den;
				System.out.println("the result is "+result);
			
			}
			catch(ArithmeticException e) {
				System.out.println("Caught a catch"+e.getMessage());
				
			}break;
		case 2:
			try {
				int[] arr= {1,2,3,4};
				System.out.println("Enter the array index");
				int index=sc.nextInt();
				System.out.println("the array elemnt is"+arr[index]);}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("caught a catch"+e.getMessage());
				}break;
		case 3:
			System.out.println("exitinggggg......:))))");
			break;
				default :
					System.out.println("enter a valid choice");
					break;
					
			}}
		while(choice!=3);
		sc.close();
		}
	}


