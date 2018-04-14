
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {9,4,7,2,8};
		int temp;
		for(int i=0;i<A.length;i++) {
			for(int j=1;j<A.length-i;j++) {
				if(A[j-1]>A[j]) {
					temp = A[j-1];
					A[j-1] = A[j];
					A[j] = temp;
				}
			}
		}
	//	System.out.println(A);
		 for(int i=0; i < A.length; i++){  
             System.out.print(A[i] + " ");  
     }  

	}

}
