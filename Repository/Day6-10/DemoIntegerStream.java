package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoIntegerStream {

	public static void main(String[] args) {
		Integer [] arr = {23, 7, 10, 89, 44, 56, 76, 28, 97, 11, 34, 23, 7, 10, 34};
		Integer [] arr1 = {56, 76, 28, 97, 23, 7, 10, 34};
		List<Integer> ilist = Arrays.asList(arr);
		
		Stream<Integer> istream = ilist.stream();		
		List<Integer> mapped=istream.distinct().sorted().map((n) -> n * 10).collect(Collectors.toList());
		System.out.println(mapped);
	   
		istream = ilist.stream();	
		List<Integer> filtered = istream.sorted().filter((n) -> n>50).collect(Collectors.toList());
		System.out.println(filtered);
		
		istream = ilist.stream();	
		List<Integer> firstten = istream.sorted().limit(10).collect(Collectors.toList());
		System.out.println(firstten);
		
		istream = ilist.stream();	
		System.out.println(istream.anyMatch((n) -> n==90));
		
		istream = ilist.stream();	
		System.out.println(istream.allMatch((n) -> n<100));
		
		istream = ilist.stream();
	    long total = istream.reduce(0, (n1,n2) -> n1+n2);
	    System.out.println(total);
	    
	    istream = ilist.stream();
	    Optional<Integer> min = istream.min(Integer::compareTo);
		System.out.println(min.get());
		
		 istream = ilist.stream();
		 Optional<Integer> max = istream.max(Integer::compareTo);
		 System.out.println(max.get());
		 
		 istream = ilist.stream();
		 OptionalDouble ave = istream.mapToDouble(Double::valueOf).average();
		 System.out.println(ave.getAsDouble());

		 System.out.println(Stream.of(Arrays.asList(arr), Arrays.asList(arr1)).flatMap(List::stream)
				 .distinct().collect(Collectors.toList()));
		 
		 
	}

}
