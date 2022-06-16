package array;

public class CountZerosAndOne {
	
	void getZeroCount(int[] arr) {
		int count;
		
		for(int index=0; index<arr.length; index++) {
			arr[index]=0;
			
			arr[index]=arr[index]+arr[index+1];
			System.out.println(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {0,0,0,1,0,1,0,1};
		
	}
}
