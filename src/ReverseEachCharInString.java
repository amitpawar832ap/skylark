
public class ReverseEachCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "my name is amit";
		
		String[] word = str.split(" ");
		String rev = " ";
		for(String w : word) {
			char ch[] = w.toCharArray();
			for(int i=ch.length-1;i>=0;i--) {
				rev += ch[i];
			}
			System.out.print(rev+" ");
		}
	//	System.out.println(" "+rev);
	}

}
