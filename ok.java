/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class ok {
    
 
	public static void main (String[] args) {
	
	 ArrayList<Integer> harsh = new ArrayList<>();
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the length of arraylist");
	 int n = sc.nextInt();
   System.out.println("Enter the values of arraylist in numbers only");

	for(int i=0; i<n; i++){
	    
	    int ok = sc.nextInt();
	    harsh.add(ok);
   
	}

  System.out.println("arraylist is look like this");

for(int i=0; i<n; i++){
	    
	    System.out.print(harsh.get(i)+" ");
   
	}

System.out.println("");
//System.out.println("we reverse the arraylist");

int i = 0;
int j = harsh.size()-1;
int temp=0;
int temp1=0;
     while(i<j){
         
        temp = harsh.get(i);
        temp1 = harsh.get(j);
        harsh.set(i, temp1);
        harsh.set(j, temp);
        i++;
        j--;
         
     }

 System.out.println("we reversed the arraylist");

 for(int k=0; k<n; k++){
	    
	    System.out.print(harsh.get(k)+" ");
   
	}

	
	
	}
}