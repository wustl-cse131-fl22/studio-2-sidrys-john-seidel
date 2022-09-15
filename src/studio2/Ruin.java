package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money are you starting with? "); 
		double startAmount = in.nextDouble();
		double ogAmount = startAmount;
		
		System.out.println("What is your winning probability? ");
		double winChance = in.nextDouble();
		
		System.out.println("What is your win limit? "); 
		double winLimit = in.nextDouble();
		
		System.out.println("How many days are you going to play? ");
		int totalSimulations = in.nextInt();
		
		for (int i = 0 ; i < totalSimulations ; i ++) {
			String win = ""; 
			int round = 0;
			 
			while (startAmount <= winLimit && startAmount > 0 )
				{
				round ++;
				double winningChance = Math.random();
		
				if (winningChance >= winChance){
					startAmount -= 1; 
					win = "LOSE";
					//System.out.println("You lose, you now have " + startAmount ); 
					}
				else if (winningChance <= winChance){
					startAmount += 1 ;
					win = "WIN";
					//System.out.println("You win, you now have " + startAmount);
					}
	
				}
			startAmount = ogAmount;
			 
		System.out.println("Situation " + i + ": " + round + " " + win); 
		
		if (winChance == 0.5){
			
			double expectedRuin = 1 - startAmount/winLimit;
		}
		else {
			double a = (1-winChance)/winChance;
			double expectedRuin = (a^startAmount - a^winLimit)/(1-a^winLimit);
		}
	

}
