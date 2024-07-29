package string_practice;

import java.util.Arrays;

public class SortStringCharacter {
	public static void main(String[] args) {
		String str = "learning";//Hello Java Well come to 
		/* 2ways
		 * 1. Using Sort Method
		 * 2. Using Sort Method */
//		Approach 1
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(new String(arr));
		//Approach 2
		String str1 = str;
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		System.out.println(new String(arr1));
	}
}
