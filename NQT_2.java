/*
The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or
message is shifted by a number of places down the alphabet.
For example, with a shift of 1, P would be replaced by Q, Q would become R, and so on.TCS NQT 2020 | 24th Oct 1 pm to 4 pm Slot Analysis
To pass an encrypted message from one person to another, it is first necessary that both parties
have the 'key' for the cipher, so that the sender may encrypt it and the receiver may decrypt it.
the key is the number of OFFSETs to shift the cipher alphabet. Key can have basic shifts from 1
to 25 positions as there are 26 total alphabets.
As we are designing custom Caesar Cipher, in addition to alphabets, we are considering
numeric digits from 0 to 9. Digits can also be shifted by key places.
For example, if given plain text contains any digit with value 5 and key = 2, then 5 will be
replaced by 7. “-” (Minus sign) will remain as it is. Key value less than 0 should result into
"INVALID INPUT"
Example 1:
Input:
Enter your PlainText: All the Best
Enter the Key: 1
Output:
The encrypted Text is: Bmm uif Cftu
Write a function customCaesarCipher(int key, String message) which will accept plaintext and
key as input parameters and returns its cipher text as output.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	String s = "All the Best 1+5";
	StringBuilder Build = new StringBuilder(s);
	int i=0,key=2;
	while(i<s.length())
	{
        if(isValid((int)s.charAt(i)))
	    {
	        i++;
	        continue;
	    }
	    int ch = (int)s.charAt(i) + key;
	    Build.setCharAt(i,(char)ch);
	    i++;
	}
	System.out.println(Build);
	}
	public static boolean isValid(int ch)
	{
	    boolean upper = (ch>=65)&&(ch<=90);
	    boolean lower = (ch>=97)&&(ch<=122);
	    boolean num = (ch>=47)&&(ch<=57);
	    boolean sym = (char)ch=='+' && (char)ch =='-';
	    if(upper || lower || sym || num)
	    {
	        return false;
	    }
	    return true;
	}
}
