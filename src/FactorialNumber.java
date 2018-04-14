
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4;
		int fact =1;
		while(num>0)
		{
			fact*=num;
			num--;
		}
		System.out.println(fact);
	}

}
