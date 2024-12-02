package com.corejava.patterns;
import java.util.Scanner;
public class a11b12c3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string=scanner.nextLine();
		scanner.close();
		int num=0;
		int length=string.length();
		for(int i=0;i<length;i++) {
			//0<=n<=9 // 0123456789 // 48 49 50 .... 57
			if('0'<= string.charAt(i) && string.charAt(i)<='9') {
				char ch=string.charAt(i-1); //b
				//'0' = 48  // a2b3c4
				//num = string.charAt(i) - '0'; // 50 - 48 = 2 // 5
				num=0; //0 // 3<3 && (t)
				while(i<length && ('0'<= string.charAt(i) && string.charAt(i)<='9')) {
					int n = string.charAt(i) - '0'; // 53 - 48 = 5
					num = (num*10)+n; // 4*10 = 40+5 = 45
					i++; //3
				}
				for(int j=0;j<num;j++) {
					System.out.print(ch);
				}
			}
		}
	}
}