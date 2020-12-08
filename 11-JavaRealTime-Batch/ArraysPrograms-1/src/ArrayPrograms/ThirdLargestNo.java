package ArrayPrograms;

public class ThirdLargestNo {

	public static void main(String[] args) {

		int a[] ={ 6, 8, 1, 9, 2, 1, 10, 12};
		
		int n=a.length;
		int temp;
		
		if(n<3) {
			
			System.out.println("Invalid Input , array size is less than 3");
		}
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(a[i]<a[j]) {
			    temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
					
				}
			}
		}
		
		System.out.println("Third Largest number in array is ==>"+a[2]);
	}

}
