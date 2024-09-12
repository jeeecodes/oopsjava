package javalab;
import java.util.Scanner;
interface human{
	final int jobid=1030;
	void learn(String str);
	void work();
}
interface recruitment{
	void screening(int score);
}
 class programmer implements human,recruitment{
	public void learn(String str) {
		System.out.println("the trained area is  "  +str);
	}
	public void screening(int score) {
		System.out.println("the score is " +score);
		
	}
	public void work() {
	System.out.println("the role is senior developer ");
	
}}
public class Interface {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the trained area:");
		String str=sc.nextLine();
		System.out.println("enter the score obtained:");
		int score=sc.nextInt();
		programmer p=new programmer();
		System.out.println("the deatails is........");
		p.learn(str);
		p.screening(score);
		p.work();
		System.out.println("the job id is"  +p.jobid);
		sc.close();
		
	}
		
	}



