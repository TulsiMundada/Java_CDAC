package day2;

public class Calculator {

	public static void main(String[] args) {
		int res = Math.add(34, 45);
		System.out.println(res);
		
		System.out.println(Math.add(10.5f, 10));
		
		res = Math.addition(1,2,3,4,5,6,7,8,9);
		System.out.println(res);
		
		int a = 12;
		int b = 15;
		Math.swap(a, b);
		System.out.println("After Swapping a : " + a + " b : " + b);
		
		int n[] = {12, 15};
		
		Math.swap(n);
		System.out.println("After Swapping a : " + n[0] + " b : " + n[1]);
	}

}
