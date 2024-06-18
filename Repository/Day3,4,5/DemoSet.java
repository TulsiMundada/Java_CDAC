package day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("two");
		
		System.out.println(set);
		set.remove("two");
		System.out.println(set);
		
		set.add("four");
		for(String s : set)
		{
			System.out.println(s);
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
