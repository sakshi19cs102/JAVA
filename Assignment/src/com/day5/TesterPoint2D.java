package com.day5;

import java.util.Scanner;

public class TesterPoint2D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice,index = 0;
		System.out.println("Enter size of array : ");
		int size = input.nextInt();
		Point2D[] points = new Point2D[size];
		
		Point2DMenu.displayMenu();
		do {
			System.out.println("Enter your choice (or enter 6 to view menu): ");
			choice = input.nextInt();
			
			switch(choice) {
				case 1:
					for(Point2D pt: points) {
						System.out.println(pt);
					}
					break;
					
				case 2:
					if(index < size) {
						System.out.println("Enter (x,y) coordinates of the point: ");
						Point2D pt = new Point2D(input.nextInt(),input.nextInt());
						points[index] = pt;
						index++;
					}else {
						System.out.println("Array is full");
					}
					break;	
					
				case 3:
					System.out.println("Enter x and y coordinates of Point1");
					int x1 = input.nextInt();
					int y1 = input.nextInt();
					System.out.println("Enter x and y coordinates of Point2");
					int x2 = input .nextInt();
					int y2 = input.nextInt();
					
//					System.out.println(x1+y1+x2+y2);
					Point2D objPt = null, objPt2 = null;
					boolean status = false;
					
					for(Point2D ptr: points) {
						if(ptr != null) {
							if(ptr.getX()==x1 && ptr.getY()==y1) {
								objPt = ptr;
//								System.out.println("equal...........");
//								System.out.println(pt1);
								status = true;
							}
							if(ptr.getX()==x2 && ptr.getY()==y2) {
								objPt2 = ptr;
//								System.out.println("equal...........");
//								System.out.println(pt2);
								status = true;
							}else {
								status = false;
//								System.out.println(" not equal...........");
								
							}
						}
					}
//					System.out.println(pt1+"pt1");
//					System.out.println(pt2+"pt2");
					if(status == true) {
						boolean result = objPt.isEqual(objPt2);
						if(result == true) {
							System.out.println("P1 & P2 are located at the same position ");
						}else {
							System.out.println("P1 & P2 are not located at the same position");
						}
					}else {
						System.out.println("Points does not exist in array");
					}
					break;
					
				case 4:
					System.out.println("Enter x and y coordinates of Point1");
					int x3 = input.nextInt();
					int y3 = input.nextInt();
					System.out.println("Enter x and y coordinates of Point2");
					int x4 = input .nextInt();
					int y4 = input.nextInt();
					
					Point2D objPt3 = null, objPt4 = null;
					boolean status1 = false;
					double distance = 0;
					for(Point2D ptr2 : points) {
						if(ptr2 != null) {
							if(ptr2.getX() == x3 && ptr2.getY() == y3) {
								objPt3 = ptr2;
								status1 = true;
							}
							if(ptr2.getX() == x4 && ptr2.getY() == y4) {
								objPt4 = ptr2;
								status1 = true;
							}else {
								status1 = false;
							}
						}
					}
					
					if(status1 == true) {
						distance = objPt3.calculateDistance(objPt4);
						System.out.println("Distance between P1 and P2 is : "+ distance);
					}else {
						System.out.println("Points does not exist in array");
					}
					
					break;
					
				case 5:
					System.out.println("----------------------EXIT---------------------");
					break;
					
				case 6:
					Point2DMenu.displayMenu();
					break;	
			}
			
		}while(choice != 5);

	}
	

}
