package javalab;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class Writeex {
	public static void main(String args[]) {
		try {
		FileInputStream fin=new FileInputStream("jeex.txt");
	    FileOutputStream fout=new FileOutputStream("jeex2.txt");
		int i;
		while((i=fin.read())!=-1) {
			fout.write(i);
		}System.out.println("sucessfully written on the other file");
		fin.close();
		fout.close();}
		catch(IOException e) {
			System.out.println("an error occured");
			e.getStackTrace();
		}
		
			
		}

}
