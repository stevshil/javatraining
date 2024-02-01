package com.collect;

import java.util.*;

public class mycollection {

	public static void main(String[] args) {
		
		// Sets
		Set<String> movies = new HashSet<String>();
		
		movies.add("Star Wars");
		movies.add("Tron");
		movies.add("Star Trek");
		movies.add("Alien");
		
		System.out.println(movies);
		
		if (movies.contains("Tron")) {
			System.out.println("Movies contains Tron");
		}
		if (movies.contains("Barbie")) {
			System.out.println("Movies contains Barbie");
		}
		
		// Lists
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(0, 1); // Puts 1 in the first element 0
		numbers.add(1, 2); // Puts 2 in the second element
		numbers.add(1, 3); // Inserts 3 at element 1 (2nd element) and moves 2 to element 2 // Same as set()
		
		System.out.println(numbers);
		System.out.println(numbers.get(1));
		
		System.out.println("Iterate through list");
		for (Object o : numbers) {
			System.out.println(o);
		}
		
		System.out.println("Iterator method");
		Iterator it=movies.iterator();
		while (it.hasNext() ) {
			Object movie = it.next();
			System.out.println(movie);
		}
		
		// One sided Generic
		Set<String> plays = new HashSet<>();
		plays.add("Book of Mormon");
		plays.add("The Holy Grail");
		plays.add("Romeo and Juliet");
		
		System.out.println(plays);
	}
}
