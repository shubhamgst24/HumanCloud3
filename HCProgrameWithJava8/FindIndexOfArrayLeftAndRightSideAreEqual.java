package HCPrograme;

public class FindIndexOfArrayLeftAndRightSideAreEqual {

	public static void main(String[] args) {

		int[]a= {1,2,3,2,1};
		int s=0;
		for(int i=1;i<a.length-1;i++)
		{
			int sum=0;
			for(int j=0;j<i;j++)
				sum+=a[j];
			int sum2=0;
			for(int j=i+1;j<a.length;j++)
				sum2+=a[j];
			if(sum==sum2)
			{
				s=i;
				break;
			}
		}
		System.out.println(s);
		
		
	}

}
