import java.util.Arrays;

public class PractiseOfString {

	public static void main(String[] args) {
		String a="I Love Java";	
		String[] aa=a.split(" ");
		System.out.println("before reverse :-"+Arrays.toString(aa));
		String[] output1= new String[aa.length];
		int count=0;
		for(int index=aa.length-1; index>=0; index--)
		{
			output1[count]=aa[index];
			count++;
		}
		System.out.println("After reverse:-"+Arrays.toString(output1));
		System.out.println("================================");
	
	String str="I Love Java";
	String str1="";
	for(int i=str.length()-1; i>=0; i--) {
		str1=str1+str.charAt(i);
	}System.out.println(str1);
	System.out.println("============================================");
	    
	
	String str2="abc-2019";
	String[] str3=str2.split("-");
	for(int j=0; j<str3.length; j++) {
	System.out.println(str3[j]);
	
}
}}