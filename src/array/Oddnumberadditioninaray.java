//to get odd number addtion in an array
package array;

public class Oddnumberadditioninaray {
	
	int getOddNumberAddition(int[] input) {
		int sum=0;
		for(int index=0; index<input.length; index++) {
			if(input[index] % 2 !=0) {
				sum+=input[index];}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Oddnumberadditioninaray array=new Oddnumberadditioninaray();
		int[] arr= {1,2,3,4,5,1};
		int sum=array.getOddNumberAddition(arr);
		System.out.println(sum);
	}
}
