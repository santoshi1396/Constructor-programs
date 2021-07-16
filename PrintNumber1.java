/*5. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
different functions with the same name 'printn' having a parameter for each datatype.
*/

class PrintNumber{

	void printn(int a, int b){
	System.out.println("Sum of 2 integer is "+(a+b));
	}

	void printn(double a, double b){
	System.out.println("Sum of 2 double is "+(a+b));
	}

	void printn(String a, String b){
	System.out.println("Sum of 2 String is "+(a+b));
	}

}
 public class PrintNumber1{
	public static void main(String args[]){

	PrintNumber p =new PrintNumber();
	p.printn(4,6);
	p.printn(1.5,5.8);
	p.printn("Good","Evening");
	
	}

}