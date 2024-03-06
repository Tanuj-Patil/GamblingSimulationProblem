package com.infogalaxy.gamblingsimulation;

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
		Random random = new Random();
		for(int i = 1; i <= 20; i++) {
			System.out.println("Day: " +i);
			int winStack = 0;
			int looseStack = 0;
			while(true) {
//				gameStatus();
				int playStatus = random.nextInt(9) % 2;
//				System.out.println("Play Status: " +playStatus);
				if(playStatus == LOOSE) {
					looseStack += 1;
				} else {
					winStack += 1;			
				}
				
				if(looseStack == STAKE_PER_DAY / 2) {
					break;
				}
				if(winStack == STAKE_PER_DAY / 2) {
					break;
				}
				
			}
			System.out.println("Winnig Stack: " +winStack);
			System.out.println("Loosing Stack: " +looseStack);	
			System.out.println("------------------------");
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation Problem developed by Tanuj Patil");
		gamePlay();
	}

}
