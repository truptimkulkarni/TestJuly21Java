package array;

public class CountPositiveNumber {
	
	public void getPositiveNumberCount(int[] input) {
		int count=0;
		for(int index=0; index<input.length;index++) {
			if(input[index]>0){
				count++;
			}
		}
		System.out.println("Total positive numbers in array are : "+count);
		}
	
	public static void main(String[] args) {
		CountPositiveNumber num=new CountPositiveNumber();
		int[] input= {1,11,-22,-10,-9,-8,21,23,26,-23,-30};
		num.getPositiveNumberCount(input);
	}
	}
	

