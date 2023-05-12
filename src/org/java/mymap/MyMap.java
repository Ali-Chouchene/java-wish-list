package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";
		String notAlfa = ". , - # . ; !  ";
		System.out.println(Arrays.asList(str.split(" ")));
		Map<String, Integer> myMap = new HashMap<>();
		Map<String, Integer> myMap1 = new HashMap<>();
		String[] word1 = notAlfa.split(" ");
		for (int i = 0; i < word1.length; i++) {
			myMap1.put(word1[i].toString(), 1);
		}
		String[] word = str.split(" ");
		for (int i = 0; i < word.length; i++) {

			if (myMap1.containsKey(word[i].toString())) {

			} else if (myMap.containsKey(word[i])) {
				myMap.put(word[i].toString(), myMap.get(word[i]) + 1);

			} else {
				myMap.put(word[i].toString(), 1);
			}

		}
		System.out.println(myMap1);
		System.out.println(myMap);
	}

}
