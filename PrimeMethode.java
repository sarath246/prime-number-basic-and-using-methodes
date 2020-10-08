package com.java.pgms;

public class PrimeMethode {

	public void checkPrime(int num) {
		
		int m=0;
		m = num/2;
		int flag = 0;
		
		if (num == 0 || num == 1) {
			
			System.out.println(num + " is not prime");
		}
		else {
			
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
		
	}
	
	public static void main(String[] args) {

		
		PrimeMethode obj = new PrimeMethode();
		
		obj.checkPrime(27);
		
	}

}
