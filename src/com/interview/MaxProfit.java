package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class MaxProfit {

	public static void main(String[] args) {
		int[] prices={7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		 int min=prices[0];
	        List<Integer> profit=new ArrayList<Integer>();
	        for(int i=1;i<prices.length;i++){
	            if(prices[i]>min){
	                profit.add(prices[i]-min);
	            }
	            else if(prices[i]<min){
	                min=prices[i];
	            }
	        }
	        if(profit.isEmpty()) return 0;
	        return (int)Collections.max(profit);
    }

}
