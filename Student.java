//1.Write a program to print the names of students by creating a Student class. 
//If no name is passed while creating an object of the Student class, then the name should
// be "Unknown", otherwise the name should be equal to the String value passed while 
//creating the object of the Student class.

class Student{
	void name(){
	System.out.println("Unknown");
	}

	void name(String a){
	System.out.println(a);
	}
	
	public static void main(String args[]){

	Student s = new Student();
	s.name();
	s.name("Tom");
	}


}