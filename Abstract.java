package javalab;
abstract class  Shape{
	abstract void noofside();
}
class rectangle extends Shape{
	int side;
	rectangle(int side){
		this.side=side;
	}void noofside(){
		System.out.println("the number of side of rectangle is"+side);
	}
	
}
class triangle extends Shape{
	int side;
	triangle(int side){
		this.side=side;
	}
	void noofside() {
		System.out.println(" the number of side of triangle is"+side);
	}
}
class hexagon extends Shape{
	int side;
	hexagon(int side){
		this.side=side;
	}
	void noofside() {
		System.out.println("the number of sides of hexagon is"+side);
	}
}
public class Abstract {
  public static	void main(String [] args) {
   rectangle r=new rectangle(4);
   triangle t =new triangle(3);
   hexagon h=new hexagon(6);
   r.noofside();
   t.noofside();
   h.noofside();
   
   
		
	}

}
