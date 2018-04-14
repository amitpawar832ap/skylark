
public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 15,d,cube =0,c =0;
		int n=num;
		while(num>0)
		{
			d = num %10;
			cube = d*d*d;
			c += cube ;
			num /= 10;
			//ffdggf

		}
		if ( c == n) {
			System.out.println("Armstrong");
		}
		else

			System.out.println("not armstrong");
	}

}
