package tshirt;

import java.util.Scanner;

import tshirt.TshirtWithEnum.SIZE;

public class TshirtMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter TshirtSize: ");
		String size = input.next();
		
		if(size == "SMALL") {
		TShirt tshirt1 = new TShirt(TShirt.SMALL);
		System.out.println(tshirt1.calculateCost());
		}
		System.out.println( size );
		input.close();
		
		TShirt tshirt2 = new TShirt(TShirt.LARGE);
		System.out.println(tshirt2.calculateCost());
		
		
		TshirtWithEnum tshirt3 = new TshirtWithEnum(SIZE.MEDUIM);
		
		System.out.println(tshirt3.calculateCost());
		
	}
	
	
	
}
