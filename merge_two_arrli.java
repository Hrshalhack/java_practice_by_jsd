




/*package whatever //do not write package name here */
import java.util.*;


class merge_two_arrli{
    
 
	public static void main (String[] args) {
	
	 ArrayList<String> name = new ArrayList<>();
	 ArrayList<String> surname = new ArrayList<>();

	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of persons");
     int n = sc.nextInt();
     sc.nextLine();
	 System.out.println("Enter the first names of persons");

	for(int i=0; i<n; i++){
	    
	    String ok = sc.nextLine();
	    name.add(ok);
   
	}

   System.out.println("Enter the sur names of persons");

   for(int i=0; i<n; i++){
	    
	    String ok = sc.nextLine();
	    surname.add(ok);
   
	}



  System.out.println("name is look like this");

for(int i=0; i<n; i++){
	    
	    System.out.print(name.get(i)+" ");
   
	}
System.out.println();
System.out.println("surname is look like this");

for(int i=0; i<n; i++){
	    
	    System.out.print(surname.get(i)+" ");
   
	}

System.out.println("");

ArrayList<String> fullname = new ArrayList<>();
System.out.println("fullname is look like this");
for(int i=0; i<n; i++){
	    
         String s = name.get(i) + " " + surname.get(i);
         fullname.add(s);
	    System.out.print(fullname.get(i)+"    ");
   
	}


 

 
	
	
	}
}