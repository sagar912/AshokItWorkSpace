package ArrayPrograms;

public class MaxDiffBetwen2Arrays {
	

		public static void main(String[] args) {

			int a[] ={9, 2, 12, 5, 4, 7, 3, 19, 5};
			
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
	 
	int k=a[0]-a[a.length-1];		
			System.out.println("Max Difference betwets en elemenin array is ==>"+k);
		}

}
