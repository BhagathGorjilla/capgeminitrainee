package com;
import java.io.*;

public class Stringdemo {

	public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String currentDay = br.readLine(); 
		
		switch (currentDay) {
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
			System.out.println("boring");
			break;
		case "THURSDAY":
			System.out.println("getting better");
			break;
		case "FRIDAY":
		case "SATURDAY":
		case "SUNDAY":
			System.out.println("much better");
			break;

		}
	}
}
