//to shift all zeros at the starting of array
package array;

import java.util.Arrays;

public class ShiftZerosAtStart {
	int count=0;
	public int toShiftZeros(int[] array) {
		for(int index=0; index<array.length;index++) {
			if(array[index]==0) {
				count++;
			}
		}
		System.out.println(count);
		return count;
		
	}		
	
	public int[] getArray(int[] input) {
		int[] output=new int[input.length];
		int num=toShiftZeros(input);
		for(int index=0; index<input.length; index++) {
			if(input[index]!=0) {
			output[count]=input[index];
			count++;}
		}
		return output;
	}
	public static void main(String[] args) {
		ShiftZerosAtStart zeros=new ShiftZerosAtStart();
		int[] array= {1,0,2,0,3,4,5,0,0,0};
		System.out.println("output array: "+Arrays.toString(zeros.getArray(array)));
	}
}

