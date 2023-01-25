package Programes;

public class EqualTheArray {

	public static void main(String[] args) {


		int[]a= {1,2,3,3,2,1};
		System.out.println(findmidOfArray(a));
	}

	private static int findmidOfArray(int[] a) {
		
		/* in here approach of finding mid element in array
		 * it means we divided array in two parts
		 * but mid is not included in both part
		 * mid is finding on the basis of 
		 * both parts addition is same this element index is printed
		 * if mid is not find it return -1
		 */
		for(int i=1;i<a.length;i++)
		{
			int sum1=0;
			for(int j=0;j<i;j++)
			{
				sum1+=a[j];
			}
			int sum2=0;
			for(int j=i+1;j<a.length;j++)
			{
				sum2+=a[j];
			}
			if(sum1==sum2)
			{
				return i;
			}
		}
		return -1;
	}

}
