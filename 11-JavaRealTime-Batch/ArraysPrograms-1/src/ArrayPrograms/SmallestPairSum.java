package ArrayPrograms;

public class SmallestPairSum {

	public static void main(String[] args) {
		
		int a[]= {1, 7, 2, 9, 6};
		int n=a.length;
		int temp,k;
	for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(a[i]>a[j]) {
			    temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
					
				}
			}
		}
		
	k=a[0]+a[1];
System.out.println("smallest pair sum in given Array ==> "+ k);
	}

}
