package Prac;

import java.util.*;

public class ques2 {
	
	public static int MaximumFreqNum(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i< arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		int max = Integer.MIN_VALUE;
		int maxEle = arr[0];
		for(int i = 0; i< arr.length; i++) {
			if(map.get(arr[i])>max) {
				max = map.get(arr[i]);
				maxEle = arr[i];
			}
		}
		return maxEle;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
