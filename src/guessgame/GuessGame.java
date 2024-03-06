/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessgame;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author jayia
 */
public class GuessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("-------------------------------------");
        
        Random random = new Random();
        int randomNum=random.nextInt(100)+1;
        
        int guess;
        System.out.println("Try to guess the number between 1 and 100");
        
        //prompting
        do{
            System.out.println("Enter your guess:");
            Scanner s = new Scanner(System.in);
            guess = s.nextInt();
            
            if (guess>randomNum){
                System.out.println("too high!");
            }else
                if(guess<randomNum){
                    System.out.println("too low");
                }
        }while (guess!=randomNum);
        
        System.out.println("Congrats! You guessed right! The correct answer is " + randomNum + "!");
        
    }
    
}
