package org.cap.demo;

public class SalesData {
	
	public void displayData(){
		
		System.out.println("Display Data..");
		System.out.println("Hey This is Sales Data");
		int[] myArr={1,67,90,34,0};
		
		int sum=0;
		
		for(int i:myArr){
			sum=sum+i;
			System.out.println(i);
		}
	}
	
	public void printMessage(){
		System.out.println("Greetings to All!");
		System.out.println("Welcome To Sales Report!");
	}

}
