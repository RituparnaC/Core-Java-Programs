package com.java;

public class IfElse {

	public static void main(String[] args) {
		
		int n = 1;
		if (n % 2 == 0)
		{
		
			if(n >= 2 && n <= 5) 
			{
				
				System.out.println("not weird"); 
			}
			else if(n >= 6 && n <= 20) 
			{
				System.out.println("Weird");
		    }
		
			else if (n > 20) {
				System.out.println("Not Weird");
			}
				
		}
		else 
		{
				System.out.println("weird");
		}
	}

}
