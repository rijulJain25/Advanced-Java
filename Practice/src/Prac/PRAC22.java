package Prac;

public class PRAC22 {
	
	public static int kgf_Ki_Ma_Ki_Chut(int[] arr, int m) {
		
		int digCount = 0;
				
		int digCount2 = 0;
		
		int time1 = m, time2 = m;
		 
		
		for(int i = 0; i<arr.length; i++) {
			digCount2++;
			for(int j = 1; j<arr.length; j++) {
				if(i>=j) {
					if(m>=arr[i-j]) {
						time2 -= arr[i-j];
						digCount2++;
					}
				}if((i+j)<arr.length){
					if(m>=arr[i+j]) {
						time1 -= arr[i+j];
						digCount2++;
					}
				}
				m = Math.min(time1, time2);
				time1 = m;
				time2 = m;
			}
			if(digCount<digCount2) {
				digCount = digCount2;
				digCount2 = 0;
			}
		}
		return digCount;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,2,7,2};
		System.out.print(kgf_Ki_Ma_Ki_Chut(arr,6));
	}
	
}
