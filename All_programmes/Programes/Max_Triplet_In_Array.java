package Programes;

public class Max_Triplet_In_Array {

	public static void main(String[] args) {

		int[]a= {1,2,3,5,6,1,2,3};
		
		int sum=Integer.MIN_VALUE;
		for(int i=0;i<a.length-2;i++)
			
			for(int j=i+1;j<a.length-1;j++)
				
				for(int k=j+1;k<a.length;k++)
					
					if(sum<(a[i]+a[j]+a[k]))
						sum=(a[i]+a[j]+a[k]);
		
		
		
		
		System.out.println(sum);
			
		
	}

}
