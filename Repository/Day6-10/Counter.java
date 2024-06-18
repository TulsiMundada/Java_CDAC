package day8;

public class Counter {

	int count =0;
	
	//public synchronized int increment()
	public int increment()
	{
		count++;
		return count;
	}
}
