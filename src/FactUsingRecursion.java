
class Test1{
	
	static int fact = 1;
	//int num = 4;
	
	public static void factorial(int num) {
		if(num>0) {
			fact *= num;
			factorial(num-1);
		}
		
	}
	
	
}
public class FactUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1.factorial(4);
		System.out.println(Test1.fact);
	}

}
