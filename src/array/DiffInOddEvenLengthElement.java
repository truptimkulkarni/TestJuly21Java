//to calculte diff between sum of odd and even element lenth
package array;

public class DiffInOddEvenLengthElement {
	int getEvenOddDiff(String[] input) {
		int diff = 0;
		int even = 0;
		int odd = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() % 2 == 0) {
				even += input[index].length();
			} else {
				odd += input[index].length();
			}
		}
		System.out.println("sum of even elements:"+even);
		System.out.println("sum of odd elements:"+odd);
		if (even > odd) {
			diff = even - odd;
		} else {
			diff = odd - even;
		}
		return diff;
	}

	public static void main(String[] args) {
		DiffInOddEvenLengthElement xyz = new DiffInOddEvenLengthElement();
		String[] arr = { "trupti", "maddy", "manik", "kulkarni", "akshy", "lokhande" };
		System.out.println("diff is: " + xyz.getEvenOddDiff(arr));
	}
}
