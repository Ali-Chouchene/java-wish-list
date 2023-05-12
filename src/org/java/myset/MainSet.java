package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		Set<Integer> myInt = new HashSet<>();
		for (int i = 0; myInt.size() < 5; i++) {
			Random rand = new Random();
			int ranNum = rand.nextInt(12 + 1 - 2) + 2;
			if (!myInt.contains(ranNum)) {
				myInt.add(ranNum);
			}

		}

		System.out.println("numeri estratti: ");
		for (Integer val : myInt) {
			System.out.println("-  " + val);
		}
	}

}
