

// Nth Fibonacci Number(in java)

//Sample Input 1:
//6
//
//
//Sample Output 1:
//8
//
//
//Explanation of sample input 1 :
//The number is ‘6’ so we have to find the “6th” Fibonacci number.
//So by using the given formula of the Fibonacci series, we get the series:    
//[ 1, 1, 2, 3, 5, 8, 13, 21]
//So the “6th” element is “8” hence we get the output.
//
//
//Expected time complexity :
//The expected time complexity is O(n).


import java.util.Scanner; 
public class Nth_Fibonacci {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int a[] = new int[n+1];
        a[0]=0;
		if(n>0)
		{
			a[1]=1;
			for(int i=2;i<=n;i++)
			{
				a[i] =a[i-1]+a[i-2];
			}
		}
         System.out.println(a[n]);
		
	}
}
