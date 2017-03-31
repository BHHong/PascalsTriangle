package com.myproject.PascalsTriangle.controller;

import java.util.Arrays;

public class PascalCoefficient {

	public void printAllCoefficients(int rowNumber) {
		Integer[] firstRow = { 1 };
		System.out.println(Arrays.asList(firstRow).toString());
		Integer[] nextRow = { 1, 1 };
		System.out.println(Arrays.asList(nextRow).toString());
		for (int row = 3; row <= rowNumber; row++) {
			Integer[] prevRow = nextRow;
			nextRow = new Integer[row];
			nextRow[0] = 1;
			for (int i = 0; i < (row - 2); i++) {
				nextRow[i+1] = prevRow[i] + prevRow[i+1];
			}
			nextRow[row-1] = 1;
			System.out.println(Arrays.asList(nextRow).toString());
		}
	}

}
