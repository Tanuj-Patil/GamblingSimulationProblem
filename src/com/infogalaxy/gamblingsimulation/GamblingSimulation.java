package com.infogalaxy.gamblingsimulation;

import java.util.Scanner;
import java.util.Random;

public class GamblingSimulation {
	
	private static final int STAKE_PER_DAY = 100;
	private static final int BET_PER_GAME = 1;
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	
	public static void gameStatus() {
//		System.out.println("Stack Available: " +STAKE_PER_DAY);
//		System.out.println("Bet per game: " +BET_PER_GAME);	
	}
	
	public static void gamePlay() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] winAmount = new int[20];
		int[] looseAmount = new int[20];	
		int[] maxLost = new int[20];
		int[] maxWon = new int[20];
		
		int lostDays = 0;
		int wonDays = 0;
		int maxL = 0;
		int maxW = 0;
		int indexL = 0;
		int indexW = 0;
		char choice = 'y';
		
		do {
			for(int i = 0; i < 20; i++) {
				int winStake = 0;
				int looseStake = 0;
	
				System.out.println("Day: " +(i+1));
				
				while(true) {
	//				gameStatus();
					int playStatus = random.nextInt(9) % 2;
	//				System.out.println("Play Status: " +playStatus);
					if(playStatus == LOOSE) {
						looseStake += 1;
					} else {
						winStake += 1;			
					}
					
					if(looseStake == STAKE_PER_DAY / 2) {
						lostDays++;
						if(looseStake > winStake) {
							maxLost[i] = looseStake - winStake;
							if(maxL < maxLost[i]) {
								maxL = maxLost[i];
								indexL = i+1;
							}
						}
						break;
					}
					if(winStake == STAKE_PER_DAY / 2) {
						wonDays++;
						if(looseStake < winStake) {
							maxWon[i] = winStake - looseStake;
							if(maxW < maxWon[i]) {
								maxW = maxWon[i];
								indexW = i+1;
							}
						}
						break;
					}	
				}
				looseAmount[i] = looseStake;
				winAmount[i] = winStake;
	//			System.out.println("Winnig Stack: " +winStack);
	//			System.out.println("Loosing Stack: " +looseStack);
				
	//			System.out.println("MaxLost: " +maxLost[i]);
	//			System.out.println("MaxWon: " +maxWon[i]);
				
				System.out.println("Loose Amount: " +looseAmount[i]);
				System.out.println("Win Amount: " +winAmount[i]);
				System.out.println("------------------------");	
			}
			System.out.println(indexL+ " is the Unluckiest day, lost rs: " +maxL);
			System.out.println(indexW+ " is the Luckiest day, won rs: " +maxW);
			System.out.println("Total Days Lost: " +lostDays);
			System.out.println("Total Days Won: " +wonDays);
		
			System.out.println("Do you want to continue playing?: (yes/no)");
			choice = scanner.next().charAt(0);
		
		}while(choice == 'y');
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation Problem developed by Tanuj Patil");
		gamePlay();
	}

}
