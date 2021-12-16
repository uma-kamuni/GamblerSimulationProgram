package com.bridgelabz;

public class StakeAfter20Days {

	public static void main(String[] args) {
		int total = 100;  //uc1
		int bet = 1;      //uc1
		for (int day = 1; day <=20; day++)
		{
		while(total>=50 && total<=150) { //uc3
		int random = (int)(Math.random()*2); //uc2
		if (random == bet) {
			total= total+1;
			System.out.println("Gambler Win");
		}
		else {
			total= total-1;
			System.out.println("Gambler Loose");
		}
		System.out.println("Total value :"+total); //uc2
		}
		System.out.println("Resign the day with total value of the output" +total); //uc3
	}
        System.out.println("The value of stake after 20 days" +total);
}
}