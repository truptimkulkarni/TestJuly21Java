package PatternPrinting;

public class Pattern4 {

	public static void main(String[] args) {
		int row=5,count=2;
		for(int k=1;k<=count;k++) {
		for(int i=1; i<=row;i++) {
			for (int j = row; j >=i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		/*for(int i=row-1; i>=1; i--) {
			for (int j=row; j>=row-1+i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();*/
		}

	}

}
