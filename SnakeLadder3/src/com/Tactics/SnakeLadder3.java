package com.Tactics;

import java.util.Random;

public class SnakeLadder3 {
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int noPlay = 0;
	public static final int startPosition = 0;
	public static final int winPosition = 100;

	public static void main(String[] args) {
		int newPosition = startPosition;
		Random random = new Random();
		while (newPosition != 100) {
			int diceValue = 1 + random.nextInt(6);
			int option = random.nextInt(3);
			switch (option) {
			case ladder:
				newPosition += diceValue;
				if (newPosition > winPosition)
					newPosition -= diceValue;
				break;
			case snake:
				if (newPosition < diceValue)
					newPosition = 0;
				else
					newPosition -= diceValue;
				break;
			default:
				newPosition += 0;
				break;
			}
			System.out.println("newPos diceVal option");
			System.out.println(newPosition + "\t" + diceValue + "\t" + option);
		}
	}

}
