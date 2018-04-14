
public class RemoveSpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I love India";
		
		//char ch[] = str.toCharArray();
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String str1 : words) {
			sb.append(str1);
		}
		System.out.println(sb);

	}

}
