

/// Check If The String Is A Palindrome (JAVA SOLUTION)

//Sample Input 1 :
//2
//N2 i&nJA?a& jnI2n
//A1b22Ba
//Sample Output 1 :
//Yes
//No
//Explanation 1 :
//For the first test case, S = “N2 i&nJA?a& jnI2n”. If we ignore the special characters, whitespaces and convert all uppercase letters to lowercase, we get S = “n2injaajni2n”, which is a palindrome. Hence, the given string is also a palindrome.
//
//For the second test case, S = “A1b22Ba”. If we ignore the special characters, whitespaces and convert all uppercase letters to lowercase, we get S = “a1b22ba”, which is not a palindrome. Hence, the given string is not a palindrome.
//Sample Input 2 :
//3
//codingninjassajNiNgNidoc
//5?36@6?35
//aaBBa@
//Sample Output 2 :
//Yes
//Yes
//No


public class String_Palindrome {

		// TODO Auto-generated method stub
		public static boolean checkPalindrome(String str) {
		      String t = "";
		        for (char i : str.toCharArray()) {
		            if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z') || Character.isDigit(i)) { //to remove all the white spaces & special characters
		                t = t+i;
		            }
		        }

		        int a = 0, j = t.length() - 1;
		        while (a <= j) {
		            if (Character.toLowerCase(t.charAt(a)) != Character.toLowerCase(t.charAt(j))) {
		                return false;
		            }
		            a++;
		            j--;
		        }
		        return true;
	}

}
