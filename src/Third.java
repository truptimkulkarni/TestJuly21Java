
public class Third {

	int getCharFreqCount(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("char :-" +ch + " freq:- " + count);
		return count;
	}

	void printFreqOfEachChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (index == str.indexOf(str.charAt(index)))
				getCharFreqCount(str, str.charAt(index));
		}
	}
	public static void main(String[] args) {
		Third t = new Third();
		String str = "priyanka";
		t.printFreqOfEachChar(str);
	}
}
