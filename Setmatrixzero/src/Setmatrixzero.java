

//Set Matrix Zeros (in java)

//Sample Input 1 :
//2
//2 3
//7 19 3
//4 21 0
//3 3
//1 2 3
//4 0 6
//7 8 9
//Sample Output 1 :
//7 19 0
//0 0 0
//1 0 3
//0 0 0
//7 0 9
//Explanation For Sample Input 1 :
//For First Case - Similar to the example explained above. 
//
//For Second Case - 
//Only the cell (2,2) has zero. So all the elements of the second row and second column are changed to zeros.


public class Setmatrixzero {

	public static void setZeros(int matrix[][]) {
	      
		int a = matrix.length;
        int b = matrix[0].length;

        int[] r = new int[a];
        int[] c = new int[b];

        for(int i =0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(matrix[i][j] == 0)
                {
                    r[i] =1;
                    c[j] =1;
                }
            }
        }
           for(int i =0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(r[i] == 1 || c[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
}
}
