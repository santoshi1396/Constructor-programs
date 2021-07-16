/*2.Create a class named 'Rectangle' with two data members- length and breadth and a
function to calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.*/

class Rectangle{
	int length,breadth;

	public Rectangle(){
	int length = 0;
        int breadth = 0;
	}
	
	public Rectangle(int length,int breadth){
	this. length = 8;
        this. breadth = 6;
	}
	
	public Rectangle(int length){
	this.length = 8;
        this. breadth = 8;
	}
    
    public void print()
    {
        System.out.println(length*breadth);
    }
}
public class Rectangle11{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.print();
        Rectangle r2 = new Rectangle(10,2);
        r2.print();
        Rectangle r3 = new Rectangle(8);
        r3.print();
}
}