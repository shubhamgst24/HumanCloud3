package Programes;

public class TwoSumElementIndexInArray {

	public static void main(String[] args) {
		
		int []a= {1,2,3,5,6,8,2,12};
		int x=15;
		for(int i=0;i<a.length-1;i++)
			for(int j=i+1;j<a.length;j++)
				if(x==a[i]+a[j])
				System.out.println(i+" "+j);
	}

}
