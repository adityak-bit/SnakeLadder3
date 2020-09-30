package com.Tactics;

import java.util.Random;

public class SnakeLadder3 {
	public static void main(String[] args) {
		int noPlay = 0;
		int snake = 1;
		int ladder = 2;
		Random random = new Random();
		int option = random.nextInt(3);
		if (option == 0)
			System.out.println("NoPlay");
		else if (option == 1)
			System.out.println("Snake");
		else
			System.out.println("Ladder");
	}

}
