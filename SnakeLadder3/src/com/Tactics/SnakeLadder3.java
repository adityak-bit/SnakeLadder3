package com.Tactics;

import java.util.Random;

public class SnakeLadder3 {
	public static void main(String[] args) {
		Random r = new Random();
		int DiceValue = 1 + r.nextInt(6);
		System.out.println(+DiceValue);
	}

}
