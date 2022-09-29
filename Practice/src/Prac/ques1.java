package Prac;

import java.util.ArrayList;
import java.util.HashMap;

public class ques1 {
	
	public static ArrayList<Integer> RemoveDuplicates(int[] arr){
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i = 0; i< arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			map.put(arr[i], true);
			output.add(arr[i]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
