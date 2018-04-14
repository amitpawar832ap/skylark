
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 8;
		boolean flag = true;
		for(int i=2; i<num;i++ ) {
			if(num % i ==0)
			{
				System.out.println("Number is Not Prime:");
				flag = false;
				break;
			}
		}
		 if(flag) {
			System.out.println("Number is Prime :");
		}

	}

}
