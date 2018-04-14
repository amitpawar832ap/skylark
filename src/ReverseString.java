
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Love India";
		
		String[] words = str.split("\\s");
		String rev = " ";
		for(int i = words.length-1 ;i>=0;i--)
		{
			 rev += words[i];
		}
		 System.out.print(rev+" ");
	}

}
