
import java.util.*;
import java.io.*;

class GFG {
    
    
  
     
        
       static int[] arr = new int[5];
        
         static int top = -1;
        
      public static void push(int temp){
            top++;
             if(top<=4){
                 
                 arr[top] = temp;
             }
             else{
                 System.out.println("your stack is full");
             }
        }
        
        
       public static void  pop(){
            if(top==-1){
                System.out.println("your stack is empty");
            }
            else{
                  top--;
            }
        }
        
       public static void  peek(){
            if(top==-1){
                System.out.println("your stack is empty");
            }
            else{
                  System.out.println(arr[top]);
            }
        }
        
        
        public static void isempty(){
            if(top==-1){
                System.out.println("your stack is empty");
            }
            else{
                  System.out.println("your stack is empty");
            }
        }
        
    
    
    
    
    
    

	public static void main (String[] args) {
	
	

	

	
	push(5);
    push(4);
	
	peek();
	pop();
	peek();
	isempty();
	pop();
	pop();
	isempty();
	
	
	}
}