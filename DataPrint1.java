/*6. Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).*/

class DataPrint{

	DataPrint(int a, char b){
	System.out.println("Integer is: " + a + " "+ "Char is : "+b);
	
	}
	
	DataPrint(char b, int a){
	System.out.println("Char is : " + b + " "+ "Integer is: " +a);

	}

}
public class DataPrint1{
	public static void main(String args[]){
	DataPrint d = new DataPrint(10,'J');
	DataPrint d1 = new DataPrint('J',20);
	

	}
}