package Test;

public class PrimeNumber {
	int count = 0;
	int sum = 0;
	float avg = 0;

	void verifyPrimeNumber(int number) {
		boolean flag = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				flag = false;
				// System.out.println(number: + "is not Prime");
				break;
			}
		}

		if (flag) {
			System.out.println(number + " is Prime");
			count++;
			sum=sum+number;
			avg=sum/count;
			
		}
	}

	void getPrimeNumberInRange(int startNumber, int endNumber) {
		for (int number = startNumber; number <= endNumber; number++) {
			verifyPrimeNumber(number);
		}
	}
	
	

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.getPrimeNumberInRange(2, 20);
		System.out.println("Total number prime count is: " + pn.count);

		System.out.println("Sum of all prime nos is: "+pn.sum);
		System.out.println("avg of no is : "+pn.avg);
	}

}
