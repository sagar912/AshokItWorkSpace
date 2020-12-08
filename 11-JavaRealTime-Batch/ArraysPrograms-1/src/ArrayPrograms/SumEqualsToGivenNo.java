package ArrayPrograms;

public class SumEqualsToGivenNo {

	public static void main(String[] args) {

		int []a={3, 6, 8, -8, 10, 8 };
		int sum=16;
		int count =0;

		System.out.println("Pairs of elements whose sum is "+sum+" are : ");
		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j < a.length; j++) {

				if (a[i]+a[j] == sum) {

                    System.out.println(a[i]+" + "+a[j]+" = "+sum);
                    count++;

				}

			}
			
		}
		System.out.println("No of such pairs are ===> "+count);
		
		
	}

}
