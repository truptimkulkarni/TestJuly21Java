//to get 5 smaller number from given inut number, e.g. input num=50 and output=49,48,47,46,45
//if you dont want to store numbers in array then take
//one int outputNum=0; and write outputNum=--num; and sop in for lop so that num wll get print everytime.
package array;

import java.util.Arrays;
import java.util.Scanner;

public class FiveSmallerNumberFromNumber {

	public void getFiveSmallerNum(int num) {
		int[] smallerNum = new int[5];
		for (int index = 0; index < 5; index++) {
			smallerNum[index] = --num;
		}
		System.out.println(Arrays.toString(smallerNum));
	}
	public static void main(String[] args) {
		FiveSmallerNumberFromNumber no= new FiveSmallerNumberFromNumber();
		System.out.println("Five smaler num are: ");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		no.getFiveSmallerNum(num);
	}
}
