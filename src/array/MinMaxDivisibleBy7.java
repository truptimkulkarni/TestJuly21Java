//WAP to get sum of min and max number divisible by 7 in a given range using only 1 loop and one method
package array;

public class MinMaxDivisibleBy7 {

	int getMinMaxNumber(int startNumber, int endNumber) {
		int minNumber = 0;
		int maxNumber = 0;
		//boolean flag = true;
		for (int number = startNumber; number <= endNumber; number++) {
			if (number % 7 == 0) {
				//if(flag)
				if (minNumber==0) 
					minNumber = number;
			maxNumber = number;
			//flag = false;
			}
		}
		System.out.println(minNumber);
		System.out.println(maxNumber);
		return minNumber + maxNumber;
	}

	public static void main(String[] args) {
		MinMaxDivisibleBy7 a = new MinMaxDivisibleBy7();
		System.out.println(a.getMinMaxNumber(1, 50));
		
	}

}
