package PatternPrinting;

public class Pattern2 {
	int row;
	Pattern2(int row){
		this.row=row;
	}
	public void getPattern() {
		for (int i = row; i >= 1; i--) {
			for (int k = 1; k <= row - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern2 p=new Pattern2(4);
		p.getPattern();
	}
}