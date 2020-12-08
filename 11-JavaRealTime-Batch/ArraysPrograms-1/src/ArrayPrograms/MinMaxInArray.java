package ArrayPrograms;

public class MinMaxInArray {

	public static void main(String[] args) {

		int array[]= {1, 2, 5, 5, 6, 6, 7, 2};
		int temp;
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]<array[j]) {
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println("Min Value in array is ==> "+ array[array.length-1]);
		System.out.println("Max Value in array is ==> "+ array[0]);
	}

}
