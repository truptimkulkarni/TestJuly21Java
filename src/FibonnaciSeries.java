
public class FibonnaciSeries {
	
	/*int num1=0;
	int num2=1;
	int n=8;
	void getFibonacciSeries(){
		int sum=0;
		for(int index=0; index<=n; index++) {
			sum=num1+num2;
		}
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(sum);
		num1=num2;
		num2=sum;
		//System.out.print(num1);
		//System.out.print(num2);
	}*/
	
	void getFibonacciSeriesNum(int num) {
		int num1;
		int num2 = 0;
		int num3 = 1;
		System.out.println("Fibonacci Series for " + num + " numbers are below");
		while (num != 0) {
			System.out.print(num2 + " ");
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			num--;
		}
	}
	public static void main(String[] args) {
		FibonnaciSeries fs= new FibonnaciSeries();
		fs.getFibonacciSeriesNum(8);
	}
}
