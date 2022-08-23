package Recursion1;

public class ReturnSubSetOfnArr {
	
	public static int[][] SubsetArr(int arr[], int strIdx){
		if(strIdx == arr.length) {
			int[][] a = new int[1][0];
			return a;
		}
		int[][] small = SubsetArr(arr, strIdx+1);
		int[][] output = new int[2*small.length][];
		int k = 0;
		for(int i = 0; i<small.length; i++) {
			output[k] = new int[small[i].length];
			for(int j = 0; j<small[i].length; j++) {
				output[k][j] = small[i][j];
			}
			k++;
		}
		
		for(int i = 0; i<small.length; i++) {
			output[k] = new int[small[i].length+1];
			output[k][0] = arr[strIdx];
			for(int j = 1; j< small[i].length; j++) {
				output[k][j] = small[i][j-1];
			}
			k++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
