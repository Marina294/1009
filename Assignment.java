// Marina.Y & Kengo
import java.util.Random;
import java.util.Scanner;

import sun.tools.jstat.SymbolResolutionClosure;

public class Assignment {

  public static void main(String[] args) {
    
    Scanner wantToPlay = new Scanner(System.in);  
    System.out.println("Hello and welcome to the two player math game, would you like to play? (y/n)");
    String yOrN = wantToPlay.nextLine(); 
    int player1 = 3;
    int player2 = 3;
    if (yOrN.equals("y")) {
    System.out.println("You each have 3 lives");


while (player1 > 0 && player2 >0) {
Random rand = new Random();
int number1 = rand.nextInt(10)+1;

Random rand2 = new Random();
int number2 = rand2.nextInt(10)+1;
// player1 question
Scanner question = new Scanner(System.in);  
System.out.println("Player 1: what is " + number1 + " + " + number2);
int answer = question.nextInt(); 
if (number1 + number2 == answer) {
System.out.println("Correct!");
System.out.println("The lives: Player 1:" +player1+"/3 Player 2: " + player2 +"/3");
} else {
  System.out.println("Incorrect! The answer was " + (number1 + number2));
  player1 = player1 - 1;
  System.out.println("The lives: Player 1:" +player1+"/3 Player 2: " + player2 +"/3");
}
// player2 question
if (player1 != 0) {
Random rand3 = new Random();
int number3 = rand3.nextInt(10)+1;
Random rand4 = new Random();
int number4 = rand4.nextInt(10)+1;
Scanner question2 = new Scanner(System.in);  
System.out.println("Player 2: what is " + number3 + " + " + number4);
int answer2 = question2.nextInt(); 
if (number3 + number4 == answer2) {
System.out.println("Correct!");
System.out.println("The lives: Player 1:" +player1+"/3 Player 2: " + player2 +"/3");
} else {
  System.out.println("Incorrect! The answer was " + (number3 + number4));
  player2 = player2 - 1;
  System.out.println("The lives: Player 1:" +player1+"/3 Player 2: " + player2 +"/3");
}
}
    }
  }
else {
System.out.println("ByeBye");}

    // Random rand = new Random();
    // int num = rand.nextInt(10) + 100;


    // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    // System.out.println("Enter username");

    // String userName = myObj.nextLine(); 
   
    if (player1 == 0) {
      System.out.println("Player 2 wins!");
    } else if (player2 == 0) {
      System.out.println("Player 1 wins!");
    }

  }
  
}