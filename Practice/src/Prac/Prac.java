package Prac;

import java.util.*;

public class Prac {
	
	public static int PairSum0(int arr[], int size) {
		if(size == 0) {
			return 0;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i: arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		
		int count = 0;
		for(int i: arr) {
			if(map.containsKey(-i) && map.get(i)!=0) {
				if(i == (-i)) {
					count += (map.get(i)*(map.get(i)-1))/2;
					map.put(i, 0);
					continue;
				}
				count += map.get(i)*map.get(-i);
				map.put(i, 0);
				map.put(-i, 0);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
