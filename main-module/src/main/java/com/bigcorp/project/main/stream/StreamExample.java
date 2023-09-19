package com.bigcorp.project.main.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> entiers = new ArrayList<>();
		entiers.add(1);
		entiers.add(2);
		entiers.add(4);
		entiers.add(6);

		entiers.stream()
				.filter(i -> i > 3)
				.map(i -> "Je vaux : " + i)
				.filter(s -> s.endsWith("6"))
				.forEach(s -> System.out.println(s));

		for (Integer i : entiers) {
			if (i > 3) {
				String s = "Je vaux : " + i;
				if (s.endsWith("6")) {
					System.out.println(s);
				}
			}
		}

	}

}
