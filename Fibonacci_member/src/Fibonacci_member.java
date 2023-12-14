
//Fibonacci Member

//Sample Input 1 :
//5
//Sample Output 1 :
//true
//Sample Input 2 :
//14
//Sample Output 2 :
//false    


public class Fibonacci_member {

public static boolean checkMember(int n){
				
		
		int a =0;
		int b=1;
		int c;
		if(n == 0 || n ==1)
		{
			return true;
		}
        c = a+b;
		while(c<n)
		{
			a =b;
			b=c;
			c=a+b;
		}	    
		if(c == n)
		{
			return true;
		}
		else{
			return false;
		}

	}
}
