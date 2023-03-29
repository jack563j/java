class Manipal{  
	int students  =200;
}   

class CADept  extends Manipal{  
	int cast=50;   	
}  

class jai{
	public static void main(String args[]){  
   		CADept a = new CADept();  
   		System.out.println("Total students in manipal university"+a.students);  
  		System.out.println("Computer applications department students are:" +a.cast);  
	}  
}