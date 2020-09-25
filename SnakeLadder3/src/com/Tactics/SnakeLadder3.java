package com.Tactics;

import java.util.Random;

public class SnakeLadder3 {
	public static void main(String[] args) {
		int NoPlay = 0;
		int Snake = 1;
		int Ladder = 2;
		Random r = new Random();
		int option = r.nextInt(3);
		if (option == 0)
			System.out.println("NoPlay");
		else if (option == 1)
			System.out.println("Snake");
		else
			System.out.println("Ladder");
	}

}
