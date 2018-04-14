
public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 121,digit,rev=0;
		
		int n=num;
		while(num>0)
		{
			digit = num % 10;
		    rev = rev * 10 + digit;
		    num /= 10;
		}
		
		System.out.println("Reverse number ="+rev);
		
		if(rev==n)
		{
			System.out.println("Number is Palindrom :");
		}

	}

}
