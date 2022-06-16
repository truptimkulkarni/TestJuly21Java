package array;

import java.util.Arrays;

public class MiddleCharacter {
	char[] getMiddleChar(String[] input) {
		int mchar;
		char[] output= new char[input.length];
		for(int index=0; index<input.length; index++) {
			if(input[index].length() %2 ==0) {
				mchar=input[index].length()/2-1;
				output[index]=input[index].charAt(mchar);
			}else {
				mchar=input[index].length()/2;
				output[index]=input[index].charAt(mchar);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		MiddleCharacter mc= new MiddleCharacter();
		String[] arr= {"trupti", "maday","manik","mandar"};
		char[] output=mc.getMiddleChar(arr);
		Arrays.toString(output);
		//for(int index=0; index<output.length; index++) {
			System.out.println(output);
		}
		
	}

