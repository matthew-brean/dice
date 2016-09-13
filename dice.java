/*******************************************************************************
* Created by: Matthew Brean
* Created on: 2016-09-13
* Created for: ICS4U
* Daily Assignment: Unit #1-05
* This program rolls a dice and you guess the number
*******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class dice {

public static void main(String[] args)
{
    Scanner DICE = new Scanner(System.in);

//randomizer
Random rand = new Random();
int randomNumber = rand.nextInt(6) + 1; // 6 is max and 1 is min # it can randomly generate


int numberOfTries = 0;
boolean win = false;

while (win==false){

System.out.println("Guess a number between 1 & 6.");
 int guess = DICE.nextInt();
 numberOfTries++;

 if (guess == randomNumber){
  System.out.println("You are correct!");
  }


 else {
 System.out.println("You are wrong!");}

 }
 }
}
