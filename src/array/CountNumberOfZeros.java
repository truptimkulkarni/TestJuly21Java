package array;

public class CountNumberOfZeros {
	int count=0;
	public int getNumberOfZeros(int[] input) {
		for(int index=0; index<input.length; index++) {
			if(input[index]==0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		CountNumberOfZeros zeros=new CountNumberOfZeros();
		int[] array= {0,1,2,56,78,3,9,0,23,0,0,0,0};
		System.out.println("Number of zeros: "+zeros.getNumberOfZeros(array));
	}
}
