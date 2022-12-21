package durgasir;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(10);
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(30);
		marks.add(20);
		marks.add(50);
		marks.add(77);
		marks.add(80);
		marks.add(44);
		
		// find even numbers from list of integers
		List<Integer> list1 =list.stream().filter(i ->i%2 == 0).collect(Collectors.toList());
		System.out.println("Even : "+list1);
		
		//find out pass students
		System.out.println("Pass : "+marks.stream().filter( m -> m >= 35).collect(Collectors.toList()));
		// add 5 grace marks for every student
		List<Integer> updatedMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println("Add Grace : "+updatedMarks);
		
		// count failed students
		int failedCount = (int) marks.stream().filter(i -> i <= 30 ).count();
		System.out.println("failed student count  : "+failedCount);
		
		// sort marks in ascending -- default
		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted marks list : "+sortedList);

		// sort marks in descending
				List<Integer> descSortedList = marks.stream().sorted((n1,n2) -> ((n1<n2)?1 : (n1>n2)?-1:0)).collect(Collectors.toList());
				System.out.println("Sorted marks list in Desc : "+descSortedList);
	}

}
