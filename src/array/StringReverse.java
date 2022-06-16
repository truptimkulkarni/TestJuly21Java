package array;

public class StringReverse {
	
	String[] getReverseArray(String[] str) {
		String[] output=new String[str.length];
		for(int index=0; index<str.length; index++) {
			output[index]=getReverseString(str[index]);
			//output[index]=)(str[index]);
			
		}
		return output;
	}
	
	String getReverseString(String input) {
		String output="";
		for(int index=input.length()-1; index>=0; index--) {
			output=output+input.charAt(index);
			output=output.replace(output.charAt(0),Character.toUpperCase(output.charAt(0)));
		}return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse sr=new StringReverse();
		String[] input= {"trupti", "techno","credits"};
		String[] output=(sr.getReverseArray(input));
		for(int index=0; index<output.length; index++) {
			System.out.println(output[index]);
		}
	}

}
