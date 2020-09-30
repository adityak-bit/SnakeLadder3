package com.Tactics;

import java.util.Random;

public class SnakeLadder3 {
	public static void main(String[] args) {
		Random random = new Random();
		int diceValue = 1 + random.nextInt(6);
		System.out.println(+diceValue);
	}

}
