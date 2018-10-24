package javaConcepts;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,5,7,9,10};
		//Arrays.sort(ar);		
		//int res = Arrays.binarySearch(ar,2);
		
		//Arrays.sort(ar,Collections.reverseOrder());
		
		int l = 0 ;
		int r = ar.length-1;
		int num=10;
		while(l<=r)
		{
			int mid = (l+r)/2;		
			
			if(ar[mid] == num)
			{
				System.out.println("found at index " + mid);
				break;
			}
			
			if(ar[mid] > num)
			{
				r = mid-1;
			}
			else
			{
				l = mid+1;
			}		
		}
		
		
	}

}
