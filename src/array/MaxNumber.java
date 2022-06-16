//to find mx no in an array
package array;

public class MaxNumber {
	int maxNumber=0;
	int getMaxNumber(int[] input) {
		for(int index=0; index<input.length; index++) {
			if(input[index]>maxNumber) 
				maxNumber=input[index];
			}
		return maxNumber;
	}
	
	public static void main(String[] args) {
		MaxNumber max=new MaxNumber();
		int[] input= {3,5,7,9,11,99,5,100};
		System.out.println("max no is "+max.getMaxNumber(input));
	}
	}

