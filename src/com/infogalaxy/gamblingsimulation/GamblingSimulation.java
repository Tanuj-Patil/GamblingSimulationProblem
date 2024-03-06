package com.infogalaxy.gamblingsimulation;

import java.util.Random;

public class GamblingSimulation {

	private static final int STAKE_PER_DAY = 100;
	private static final int BET_PER_GAME = 1;
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	
	private static int winStack = 0;
	private static int looseStack = 0;
	
	public static void gameStatus() {
		System.out.println("Stack Available: " +STAKE_PER_DAY);
		System.out.println("Bet per game: " +BET_PER_GAME);
		System.out.println("Winnig Stack: " +winStack);
		System.out.println("Loosing Stack: " +looseStack);		
		System.out.println("------------------------");
	}
	
	public static void gamePlay() {
		Random random = new Random();
		int playStatus = random.nextInt(9) % 2;
		System.out.println("Play Status: " +playStatus);
		if(playStatus == LOOSE) {
			looseStack += 1;
		} else {
			winStack += 1;			
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation Problem developed by Tanuj Patil");
		gameStatus();
		gamePlay();
		gameStatus();
	}

}
