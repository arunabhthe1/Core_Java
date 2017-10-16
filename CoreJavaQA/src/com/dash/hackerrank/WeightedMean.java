package com.dash.hackerrank;

import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class WeightedMean {
	public static void main(String ar[]) {
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		int arraySize = stdin.nextInt();
		int array[] = new int[arraySize];
		int weight[] = new int[arraySize];
		for (int count = 0; count < arraySize; count++) {
			weight[count] = stdin.nextInt();
		}
		for (int count = 0; count < arraySize; count++) {

			array[count] = stdin.nextInt();
		}
		System.out.println(getWeightedMean(array, weight));

	}

	public static double getWeightedMean(int[] array, int weight[]) {
		double multiplyVaue = 0, sumValue = 0, weightedMean = 0.0;
		for (int count = 0; count < array.length; count++) {
			multiplyVaue = multiplyVaue + array[count] * weight[count];
			sumValue = sumValue + array[count];
		}

		weightedMean = ((multiplyVaue) / sumValue);
		Double truncatedDouble = new BigDecimal(weightedMean).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
		return truncatedDouble;
	}
}
