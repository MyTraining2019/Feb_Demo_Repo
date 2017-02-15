package org.cap.demo;

public class SalesData {
	
	public void displayData(){
		
		System.out.println("Display Data..");
		System.out.println("Hey This is Sales Data");
		int[] myArr={1,67,90,34,0};
		int sum=0;
		
		for(int i=0;i<myArr.length;i++)
			System.out.println(myArr[i]);
		
		System.out.println(sum);
	}
	
	public void printMessage(){
		System.out.println("Greetings to All!");
		System.out.println("Welcome To Sales Report!");
	}

}
