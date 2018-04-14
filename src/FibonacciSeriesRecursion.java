
class Test{
	static int n3,n2=1,n1=0;
	
	public static void Fibonacci(int count) {
		
		if(count>0) {
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			Fibonacci(count-1);
		}
	}
}
public class FibonacciSeriesRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		int first =0,second=1;
		System.out.print(first+" "+second);
        Test.Fibonacci(count);
		
	}

}
