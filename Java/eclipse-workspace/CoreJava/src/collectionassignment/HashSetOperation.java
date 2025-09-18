package collectionassignment;

import java.util.*;

public class HashSetOperation {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 3, 4, 7, 8, 9));
		
		System.out.println("Set1: " + set1);
		System.out.println("Set2: " + set2);
		
		// Union
		HashSet<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("\nUnion: " + union);
		
		// Intersection
		HashSet<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: " + intersection);
		
		// Difference (set2 - set1)
		HashSet<Integer> difference = new HashSet<>(set2);
		difference.removeAll(set1);
		System.out.println("Difference: " + difference);
		
	}
}
