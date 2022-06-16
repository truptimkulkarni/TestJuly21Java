package PatternPrinting;

public class Pattern3 {

	public void getPattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//for (int i = row - 1; i >= 1; i--) {
			//for (int j = 1; j <= i; j++) {
		for (int i = 1; i <= row-1; i++) {
			for (int j = 1; j <=row-i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		 Pattern3 p3=new  Pattern3();
		 p3.getPattern(5);
	}

}
