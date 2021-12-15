package com.bridgelabz;

public class GamblerWinorLoose {
	public static void main(String[] args) {
		int total = 100;  //uc1
		int bet = 1;      //uc1
		int random = (int)(Math.random()*2); //uc2
		if (random == bet) {
			total= total+1;
			System.out.println("Gambler Win");
		}
		else {
			total= total-1;
			System.out.println("Gambler Loose");
		}
		System.out.println("Total value :"+total);

}

}