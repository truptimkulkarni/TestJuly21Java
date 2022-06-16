//to calculate sum of all elements in a string array
package array;

public class SumOfLengthOfElementInArray {
	int getSum(String[] arr) {
		int sum=0;
		for(int index=0; index<arr.length; index++) {
			sum+=arr[index].length();
		}
		return sum;
	}
	
	int getSumOfIntArray(int[] input) {
		int sum=0;
		for(int index=0; index<input.length; index++) {
			sum+=input[index];
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfLengthOfElementInArray arrr= new SumOfLengthOfElementInArray();
		String[] arr= {"trupti","mandar","akshay","manik","alka"};
		System.out.println("sum of element is: "+arrr.getSum(arr));
		int[] arr1= {12,1,13,5,23};
		System.out.println("sum of element is: "+arrr.getSumOfIntArray(arr1));
	}
}
