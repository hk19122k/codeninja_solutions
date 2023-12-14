
//SORT 0 1 2(java code)

//Sample Input 1 :
//2
//6
//0 1 2 2 1 0
//7
//0 1 2 1 2 1 2
//Sample Output 1 :
//0 0 1 1 2 2
//0 1 1 1 2 2 2

package sort012;

public class sort012 {
	 public static void sort012(int[] arr)
	    {
	      int n = arr.length;  
	      int l = 0;
	      int r = n-1;
	      int t=0;
	      for(int i=0;i<n&&i<=r;)
	      {
	          if(arr[i] == 0)
	          {
	             t = arr[l];
	             arr[l] = arr[i];
	             arr[i] = t;
	             l++;
	             i++;
	          }
	          else if(arr[i] ==2)
	          {
	             t = arr[i];
	             arr[i] = arr[r];
	             arr[r] = t;
	             r--;  
	          }
	          else{
	              i++;
	          }
	      } 

	    }
}
