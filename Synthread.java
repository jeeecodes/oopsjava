package javalab;
import java.util.*;
class Table
{
void printTable(int n)
{
synchronized(this)
{
for(int i=1;i<=10;i++)
{
System.out.println(+n+"*"+i+"="+(n*i));

}
}
}
}
class Mythread3 extends Thread
{
Table t;
int n;
Mythread3(Table t)
{
this.t=t;
}
public void run()
{
t.printTable(n);
}
}
class Mythread4 extends Thread
{
Table t;
int n;
Mythread4(Table t)
{
this.t=t;
}
public void run()
{
t.printTable(n);
}
}
public class Synthread
{
public static void main(String args[])
{
Table t = new Table();
Scanner sc=new Scanner(System.in);
Mythread3 th1 = new Mythread3(t);
Mythread4 th2 = new Mythread4(t);
System.out.println("Enter the table you want to run by thread1");
th1.n=sc.nextInt();
System.out.println("Enter the table you want to run by thread2:");
th2.n=sc.nextInt();
th1.start();
th2.start();
}
}
	


