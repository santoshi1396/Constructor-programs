/*7. Create a class to print the area of a square and a rectangle. The class has two functions with the 
same name but different number of parameters. The function for printing the area of rectangle has two 
parameters which are its length and breadth respectively while the other function for printing the area 
of square has one parameter which is the side of the square.*/


class Area{
  public static void print(int x,int y){
    System.out.println(x*y);
  }
  public static void print(int x){
    System.out.println(x*x);
  }
}

public class Area1{
	public static void main(String args[]){
	Area a =new Area();
	a.print(5,8);
	a.print(5);
	}

}