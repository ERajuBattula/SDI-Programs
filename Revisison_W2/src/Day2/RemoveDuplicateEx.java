package Day2;

//Write a program to remove duplicate number in an  array.

public class RemoveDuplicateEx {
	public static int RemoveDuplicate(int []arr,int n) {
		if(n==0||n==1) {
			return n;
		}
		   int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 4, 3, 8, 9, 7, 4 };
		//RemoveDuplicateEx.RemoveDuplicate(arr, arr.length);
//		for(int i:arr) {
//			System.out.println(arr[i]);
//		}
		   int n = arr.length;  
	        n = RemoveDuplicate(arr, n);  
	        //printing array elements  
	        for (int i=0; i<n; i++)  
	           System.out.print(arr[i]+" ");  
	}
}
