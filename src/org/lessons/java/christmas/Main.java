package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> wishList = new ArrayList();

		Scanner input = new Scanner(System.in);

		boolean finish = true;

		while (finish) {

			System.out.println("Regali attuali: " + wishList.size() + "  !!Se vuoi terminare digita  'STOP' ");
			System.out.println();
			System.out.println("Altrimenti scrivi che regalo vuoi?");
			String gift = input.next();

			if (gift.toLowerCase().equals("stop")) {
				finish = false;
				System.out.println("Ecco la tua lista dei desideri: ");
				for (String val : wishList) {
					System.out.println("--" + val);
				}

			} else {
				wishList.add(gift);
			}

		}
		input.close();

	}

}
