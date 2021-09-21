package task20sept;

public class findMaxNumberIn_Array {
	public static void main(String args[]) {
	
		int[] arr= {4,6,23,5,6,7,8,90};
		int max=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("maximum number : "+max);
	}

}
