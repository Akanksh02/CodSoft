package Task01;
import java.util.*;

public class NumberGame01

{
    public static void Game()
    {
        Scanner sc = new Scanner(System.in);
        // generating random number
        int random = (int)(Math.random()*100)+1;
        int k =5;
        boolean correct = false;
        // mgs to choose number from user end
        System.out.println("Choose number....\n You have only 5 trials:)");

        while (k>0)
        {
            // asking user to enter guessed number
            System.out.print("\nEnter your guess: ");
            int guess = sc.nextInt();

            if (random==guess)  // applying condition to check weather a guessed number is correct or not
            {
                System.out.println("\nCongratulations!! \n you win:) ");
                correct = true;
                break;
            }

            // if random number is greater than guess number -- show the mgs
            else if (random > guess)
            {
                System.out.println("\nGuess number is too low!!! \n You have only "+(k-1)+"left chances");
                k--;

            }
            // if random number is less than guess number -- show the mgs
            else
            {
                System.out.println("\nGuess number is too high!!! \nYou have only "+(k-1)+"left chances ");
                k--;
            }
        }
        // if correct value is false only -- Printing 'you lost'

        if (correct==false)

        {
            System.out.println("\n\nOOPS!!! you lost:(");
        }
    }
}
class Game

{
    // main method

    public static void main(String[] args) {

        // creating object for class

        NumberGame01 n =  new NumberGame01();

        // calling Game method

        n.Game();
        Scanner sc = new Scanner(System.in);

        // when user wants to play again


        System.out.println("Would you like to play again: (y/n)");

        // taking input from user to play or not

        char playagain= sc.next().toLowerCase().charAt(0);

        // again using control statements

        if (playagain == 'y')
        {
            n.Game();
        }
        System.out.println("Thanks for playing:)");
    }
}


