package com.java.pgms;

public class PrimeMethode2 {

	private int m = 0;
	private int flag=0;
	
	public void chechPrime(int num) {
		
		if (num == 0 || num == 1) {
			
			System.out.println(num + " is not prime");
		}
		else {
			
			check(num);
		}
		
	}
	
	public void check(int num) {
		
		m = num/2;
		
		for (int i = 2; i <= m; i++) {
			
			if (num%i == 0) {
				
				System.out.println(num + " is not prime");
				
				flag = 1;
				break;
			}
			
		}
		
		if (flag == 0) {
			
			System.out.println(num + " is prime");
		}
		
	}
	
	public static void main(String[] args) {

		PrimeMethode2 obj = new PrimeMethode2();
		obj.chechPrime(29);
		
	}

}
