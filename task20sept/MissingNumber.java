package task20sept;

public class MissingNumber {
public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
	int y=arr.length+1;
	int total_sum=(y*(y+1))/2;
	int sum=0;
	for(int i=0; i<arr.length;i++) {
		sum=sum+arr[i];}
	System.out.println("Missing Number is : " + (total_sum-sum));
}
}
