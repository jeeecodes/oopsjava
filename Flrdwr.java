package javalab;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Flrdwr {
	public static void main(String [] args){
		try { 
			Scanner sc=new Scanner(System.in);
			File obj1=new File("file3.txt");
			System.out.println("file text created");
			FileWriter fout=new FileWriter("file3.txt");
			System.out.println("enter your keam rank");
			int n=sc.nextInt();
			fout.write(n+"\n");
			fout.close();
			System.out.println("data added");
			FileReader fin=new FileReader("file3.txt");
			BufferedReader br=new BufferedReader(fin);
			String Line;
			System.out.println("content of file3.txt is :");
			while((Line=br.readLine())!=null){
				System.out.println(Line);
			}br.close();
			}
		catch(IOException e) {
			System.out.println("Exception occured");
			e.getMessage();
		}
		
	}

}
