package com.corejava.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static{
		System.out.println("Static Block");
		//int a = 10;
	}
	{
		//int d=10;
		System.out.println("Instance Block");
	}
    public static void main(String[] args) {
    	//Main main=new Main();
    	System.out.println("Main Block");
    	List<String> testAnsweredList=new ArrayList<>();
    	testAnsweredList.add("Exception is an error in the code execution7485747485A condition that disrupts the normal flow of a program7485747485A mechanism for handling unexpected situations7485747485");
    	System.out.println("testAnswered List : "+testAnsweredList);
    	
    	List<String> multiSelectAnswerList = new ArrayList<>();
	    String inputString = testAnsweredList.get(0);

	    if (inputString != null) {
	        System.out.println("Input String: " + inputString); // Debugging line

	        String delimiter = "7485747485";
	        String[] resultArray = inputString.split(delimiter);

	        for (String part : resultArray) {
	            // Trim spaces from each part
	            String trimmedPart = part.trim();
	            multiSelectAnswerList.add(trimmedPart);
	        }
	    } else {
	        multiSelectAnswerList.add(null);
	    }
		System.out.println("Multi select answeres list : " + multiSelectAnswerList);
    	
    	//StringBuilder str=new StringBuilder("new"); //mutable //edit
    	String str="new"; //immutable //cannot edit
    	System.out.println(str.hashCode());
    	String str1="new";
		for(int i=0;i<10;i++) {
			//str=str.append(i);
			str+=i;
			System.out.println(str);
			System.out.println(str.hashCode());
		}
		
    	System.out.println(str1.hashCode());

    }
}
