package PatternPrinting;

public class Pattern1 {
	
	
	public static void getPattern(int row) {
		int count=1;
		for(int i=1; i<=row; i++) {
			for(int k=1;k<=row-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				//System.out.print(count+" ");
				//System.out.print(count);
				//count++;
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		getPattern(4);
	}

}
