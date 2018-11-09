package com.java.enumDemo;

public class EnumDemo {


	public static void main(String[] args) {
		
		
		
		Directions dir = Directions.NORTH;
		
		if (dir == Directions.EAST){
			
			System.out.println("Directon is East");
			
		}else if (dir == Directions.NORTH){
			System.out.println("Directon is North");
			
		}else if (dir ==Directions.WEST){
			System.out.println("Directon is West");
			
		}else {
			System.out.println("Directon is South");
			
		}
	}

}

enum Directions{
	EAST, WEST, NORTH, SOUTH
}
