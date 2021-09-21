package task20sept;

public class SearchMinNumberArray {
	public static void main(String args[]) {
		int arr[]= {3
				,5,7,2,5,6,4,1,9};
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println("Minimum number : "+min);
	}

}
