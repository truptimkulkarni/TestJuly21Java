package array;

public class ReapeatStringCharacters {
	public static void main(String[] args) {
		String str = "trupti";
		String result = "";
		for (int index = 0; index < str.length(); index++) {
			String temp = "";
			for (int innerindex = 0; innerindex <= index; innerindex++) {
				temp += str.charAt(index);
			}
			result += temp;
		}
		System.out.println(result);
		
		/*this method is applicable above java 11, but my java is less than 11 hence the above code is valid to get expected outpu
		 * String str = "trupti";
		String result = "";
		for (int index = 0; index < str.length(); index++) {
			result=result+Character.toString(str.charAt(index).repeat(index+1));
		}*/
	}
}
