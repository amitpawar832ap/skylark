

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =12,first =0,second =1,next;
		
		for(int i=0;i<=num;i++) {
			
			if(i<=1)
			{
				System.out.print(i+" ");
			}
			else
			{
				next = first+second;
				first = second;
				second=next;
				System.out.print(" "+next);
			}
			
		}

	}

}
