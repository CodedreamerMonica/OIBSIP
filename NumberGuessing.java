import java.util.*;
class NumberGuessing {
    public static void main(String[] args) {
        Random rand=new Random();
        int randNumber=rand.nextInt(100)+1;
        int num;
        int count=0;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Guess a number between (1-100): ");
            num=sc.nextInt();
            count++;
        if (num==randNumber){
            flag=true;
            System.out.println("Your guessing was correct ");
            System.out.println("You guessed in "+ count+" attempts ");
            break;
        }
        else if (num>randNumber){
            System.out.println("Guess lower ");
            System.out.println();
            
        }
        else{
            System.out.println("Guess Higher ");
            System.out.println();
        }
        }
        
    }
}
// Code by Monica