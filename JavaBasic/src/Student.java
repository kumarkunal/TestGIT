
public class Student {

	 int id;  
	    String name;  
	    //creating a parameterized constructor  
	   
	    Student(int i,String n){  
	    id = i;  
	    name = n;   
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    Student s1 = new Student(111,"Karan");  
	      
	    //calling method to display the values of object  
	    s1.display();  
	   
	   }  

}
