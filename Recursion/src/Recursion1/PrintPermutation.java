/*Question:
Given an input string (STR), print all possible permutations of the input string.
Note:
The input string may contain the same characters, so there will also be the same permutations.
The order of permutations doesn’t matter.
Input Format:
The only input line contains a string (STR) of alphabets in lower case
Output Format:
Print each permutations in a new line
Constraint:
1<=length of STR<=8
Time Limit: 1sec
Sample Input 1:
cba
Sample Output 1:
abc
acb
bac
bca
cab
cba
*/


package Recursion1;

public class PrintPermutation {

	private static void swap(char[] a, int i, int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void FindPermutations(char[] a, int i, int j){
        if(i>=j){
            String permutation = "";
            for(int k = 0; k< a.length; k++){
                permutation += a[k];
            }
            System.out.println(permutation);
            return;
        }
        for(int k = i;  k <= j; k++){
            swap(a, i, k);
            FindPermutations(a, i+1, j);
            swap(a, i, k);
        }
    }
    
    public static void FindPermutations(String str){
        
        char[] arr = str.toCharArray();
        FindPermutations(arr, 0, arr.length-1);
         
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
