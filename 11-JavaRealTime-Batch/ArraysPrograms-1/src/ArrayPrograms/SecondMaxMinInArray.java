package ArrayPrograms;

public class SecondMaxMinInArray {

	public static void main(String[] args) {
		int array[]= {1, 2, 5, 9, 6, 4, 7, 2};
		int n=array.length;
		int temp;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(array[i]>array[j]) {
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println("Second Min Value in array is ==> "+ array[1]);
		System.out.println("Second Max Value in array is ==> "+ array[n-2]);
	}

}
