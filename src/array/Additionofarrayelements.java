package array;

public class Additionofarrayelements {
	
	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int sum=0;
	for(int index=0; index<arr.length; index++) {
		sum+=arr[index];
	}
	System.out.println("Addition of all numbers in array is : "+sum);
}
}
