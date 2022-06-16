package PatternPrinting;

public class Pattern5 {
	
	public void getPattern(int row, int col) {
		int cnt;
		for(int i=1; i<=row;i++) {
			if(i%2==0) {
				cnt=1;
			}else {
				cnt=0;}
		for(int j=1; j<=col; j++) {
			System.out.print(cnt+" ");
			if(cnt==1) {
				cnt=0;}else {
			cnt=1;
			}
		}System.out.println();
			}
	}

	public static void main(String[] args) {
		Pattern5 p5=new Pattern5();
		p5.getPattern(4,6);
		}
		
	}



