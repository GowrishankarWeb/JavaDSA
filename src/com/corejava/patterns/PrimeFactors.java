package com.corejava.patterns;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class PrimeFactors {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		scanner.close();
		int sum=1;
		List<Integer> lhs=new LinkedList<Integer>();
		for(int i=2;i<=number;i++) {
			while(number%i==0) {
				sum+=number;
				lhs.add(i);
				number/=i;
			}
		}
		int max=0;
		for (Integer integer : lhs) {
			System.out.println(integer);
			
			if(integer>max) {
				max=integer;
			}
		}
		System.out.println("Max Prime = "+max);
		System.out.println("Sum of prime factors are = "+sum);
	}

}
