package javalab;
	import java.util.*;
	public class Strtok {
		public static void main(String [] args) {
			int n,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the integer with one space gap");
			String s=sc.nextLine();
			StringTokenizer str=new StringTokenizer(s," ");
			while(str.hasMoreTokens()) {
				String a=str.nextToken();
				 n= Integer.parseInt(a);
				 System.out.println(n);
				 sum+=n;
			}
			System.out.println("Sum of integer ="+sum);
			sc.close();
			
		}

	}


