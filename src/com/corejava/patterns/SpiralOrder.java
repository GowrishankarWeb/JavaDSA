package com.corejava.patterns;
import java.util.Scanner;
public class SpiralOrder {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int row=ip.nextInt();
		int col=ip.nextInt();  
		int a[][]= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=ip.nextInt();
			}
		}
		ip.close();
//		3
//		3
//		1 2 3
//		4 5 6
//		7 8 9
//		1 2 3 6 9 8 7 4 
		int rowStart=0, rowEnd=row-1, colStart=0, colEnd=col-1;
		while(rowStart<rowEnd && colStart<colEnd) {
			for(int i=colStart;i<=colEnd;i++) {
				System.out.print(a[rowStart][i]+" ");
			}
			rowStart++;
			for(int i=rowStart;i<=rowEnd;i++) {
				System.out.print(a[i][colEnd]+" ");
			}
			colEnd--;
			if(rowStart<rowEnd) {
				for(int i=colEnd;i>=colStart;i--) {
					System.out.print(a[rowEnd][i]+" ");
				}
				rowEnd--;
			}
			if(colStart<colEnd) {
				for(int i=rowEnd;i>=rowStart;i--) {
					System.out.println(a[i][colStart]+" ");
				}
				colStart++;
			}
		}
	}
}