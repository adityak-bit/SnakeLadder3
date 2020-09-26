package com.Tactics;

import java.util.Random;

public class SnakeLadder3 {
	public static final int Ladder = 1;
	public static final int Snake = 2;
	public static final int NoPlay = 0;
	public static final int startPosition = 0;
	public static final int winPosition = 100;

	public static void main(String[] args) {
		int newPosition = startPosition;
		Random r = new Random();
		while (newPosition != 100) {
			int diceValue = 1 + r.nextInt(6);
			int option = r.nextInt(3);
			switch (option) {
			case Ladder:
				newPosition += diceValue;
				if (newPosition > winPosition)
					newPosition -= diceValue;
				break;
			case Snake:
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
