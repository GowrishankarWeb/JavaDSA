package com.gfg;

import java.util.ArrayList;
import java.util.List;

public class Area {

	public static void main(String[] args) {
		int choice=1;
		List<Double> arr=new ArrayList<>();
		arr.add(5.0);
		System.out.println(switchCase(choice, arr));
	}
	static double switchCase(int choice, List<Double> arr){
        // code here
        switch(choice){
            case 1: 
                double area=(arr.get(0)*arr.get(0))*(22.0/7);
                System.out.println((double)((22/7)));
                double roundedArea = Math.round(area * 100.0) / 100.0;
                return roundedArea;
                
            case 2:
                return (double)arr.get(0)*(double)arr.get(1);
        }
        return 0;
    }
}
