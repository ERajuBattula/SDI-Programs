package Day1;

public class MeanValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 6, 4, 5, 8, 9, 1 };
		int n=arr.length;
		double mean;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		mean=sum/n;
		System.out.println(mean);
	}
}
//Write a program accept 10 number of list and separate even number and odd numbers. calculate sum of even numbers and sum of odd numbers and display result of Sum of even number / sum of odd number.