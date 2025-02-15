import java.util.*;
public class GuesstheNumber {
    public static void main(String[] args){
        int answer=(int)(Math.random()*100)+1;
        int k=5;
        Scanner sc=new Scanner(System.in);

        System.out.println("Guess a Number between 1 to 100.\nYou have 5 trails to guess the correct number");
        while(k>0){
            System.out.println("Guess a number : ");
            int guess=sc.nextInt();
            if(guess==answer){
                System.out.println("Congratulations!!.You have guessed the number.");
                break;
            }
            else if (guess > answer) {
                System.out.println("Your guess is too high.\nYou have " + (k-1) + " tries left.");
                k--;
            }
            else{
                System.out.println("Your guess is too low.\nYou have " + (k-1) + " tries left.");
                k--;
            }

        }
    }
}