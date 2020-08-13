package com.bern;
/*This programme enforces privacy with cryptography.
 * It is concerned with the security of data sent over the internet
 * Using an encryption technology, data can be securely 
 * transmitted over the internet.
 * This programme decrypts any four digits entered.
 * This programme was written by Odiaka E. Bernard.
 */
import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your four digit number: ");
		int digit = input.nextInt();
		
		// separating each digit of the input
		
		if(digit >= 1000 && digit <10000) {
			int firstNum = digit/1000;
			int firstRem = digit % 1000;
			
			int secNum = firstRem/100;
			int secRem = firstRem % 100;
			
			int thirdNum = secRem/10;
			int thirdRem = secRem %  10;
			
			int fourthNum = thirdRem;
			
			
			int tempNum = firstNum;
			firstNum = thirdNum;
			thirdNum = tempNum;
			
			tempNum = secNum;
			secNum = fourthNum;
			fourthNum = tempNum;

			
			//adding 7 to each digit and finding the modulo 
			int newFirst = ((firstNum + 10) - 7) % 10;
			int newSec = ((secNum +10) - 7) % 10;
			int newThird = ((thirdNum + 10) - 7) % 10;
			int newFourth = ((fourthNum + 10) - 7) % 10;
			 
						
			System.out.printf(""+newFirst+""+newSec+""+newThird+""+newFourth+"\n");
			System.out.println();
			
		}else {
			System.out.println("You have entered incorrect value");
		}

	}

}
