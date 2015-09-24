package com.liquidforte.java;

public class LabFour {
	public static void main(String[] args) {
		int[][] sales = new int[5][4];
		int[] personTotal = new int[4];
		int[] productTotal = new int[5];
		
		int[][][] slips = new int[30][20][3];
		
		// input slip values here
		
		for (int day = 0; day < 30; day++) {
			for (int slip = 0; slip < 20; slip++) {
				int person = slips[day][slip][0];
				int product = slips[day][slip][1];
				int value = slips[day][slip][2];
				sales[product][person] += value;
				personTotal[person] += value;
				productTotal[product] += value;
			}
		}
		
		System.out.printf("%s	%s	%s	%s	%s	%s\n", "Product Number", "Staff A", "Staff B", "Staff C", "Staff D", "Total");
		
		for (int row = 0; row < 5; row++) {
			System.out.printf("%d		%d	%d	%d	%d	%d\n", row, sales[row][0], sales[row][1], sales[row][2], sales[row][3], productTotal[row]);
		}
		
		System.out.printf("	%s	%d	%d	%d	%d\n", "Total", personTotal[0], personTotal[1], personTotal[2], personTotal[3]);
	}
}