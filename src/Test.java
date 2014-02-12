
public class Test {

	public static void main(String[] args) {
		long [][]array = new long[20][20] ;
		long j=0,k=0, sum = 0;
		
		for (k = array.length-1 ;k>=0 ; k--)
		{
			if (k== array.length-1)
			{
			 j = array.length-1;
			}
			array[(int)k][(int)j] = 1;
			sum = sum + array[(int)k][(int)j];
					
		}
		for ( j = array.length-1 ;j>=0 ; j--)
		{
			if (j== array.length-1)
			{
			 k = array.length-1;
			}
			array[(int)k][(int)j] = 1;
			sum = sum + array[(int)k][(int)j];
					
		}
		for (j= array.length-2 ;j>=0 ; j--)
		{
		for (k = array.length-2; k >=0; k--) {
			//j=array.length-2;
			array[(int)k][(int)j] = array[(int)k+1][(int)j] + array[(int)k][(int)j+1];
			sum = sum + array[(int)k][(int)j];
		}
		}
		System.out.println(sum);
	}

}
