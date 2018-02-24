package patternMatcher;
import java.util.Scanner;
public class stringReverse {
public static void main(String[] args){
	System.out.println("Enter string to reverse:");
	Scanner read = new Scanner(System.in);
	String str = read.nextLine();
	read.close();
	//calling reverse method 
	reverse(str);
	StringBuffer sb=new StringBuffer(str);
	//calling reverseUsingStringBuffer method
	reverseUsingStringBuffer(sb);
	char[] ca=new char[10];
	str.getChars(0, str.length(), ca, 0);
	String reverseString=stringReverseUsinggetChars(ca);
	System.out.println("String Reverse using getChars:" +reverseString);
}
//Using CharAr method of String Class to reverse the String
public static void reverse(String string){
	String reverse="";
	for(int i = string.length() - 1; i>=0; i--)
	{
		reverse = reverse + string.charAt(i);
	}
	if(string.equals(reverse))
	{System.out.println("Entered String is a palindrome");}
	else
	{System.out.println("Entered String is a not a palindrome");}	
}
//Using reverse method of StringBuffer Class to reverse String
public static void reverseUsingStringBuffer(StringBuffer a){
a.reverse();
System.out.println("String Reverse Using StringBuffer:  "+a);
}
public static String stringReverseUsinggetChars(char[] input){
	char[] temp=new char[10];
	for(int i=0;i<input.length;i++)
	{
		temp[i]=input[input.length-1-i];
	}
	String output=new String(temp);
	return output;
	
	//System.out.println();
}
}

