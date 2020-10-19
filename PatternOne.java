/******************************************************************************
Write your code in this editor and press "Run" button to execu
*******************************************************************************/

import java.util.Scanner;
public class PatternOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		
		String s=sc.next();
		int len = s.length();
		for(int x=0;x<len;x++)
		{
		    for(int k=len-x-1;k<len;k++) {
		    System.out.print(s.charAt(k));   
		    }
		System.out.println();
		}
	}
}


