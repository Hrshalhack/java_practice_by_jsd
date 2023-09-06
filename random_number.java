import java.util.*;

public class random_number{
    public static void main(String args[]){
      
       // Random harsh = new Random();
        Scanner sc = new Scanner(System.in);

        int number = 64;
   
    System.out.println("Game start");
    System.out.println("you have only 5 chances to guess the number");
    

         for(int i=0; i<5; i++){
                              System.out.println("Enter number");
                              int your = sc.nextInt();
                              if(your==number){
                                System.out.println("you won");
                                break;
                              }
                              else if(your<number){
                                System.out.println("your number is small");
                              }
                              else{

                                System.out.println("your number is large");
                              }
         }





    }
}


