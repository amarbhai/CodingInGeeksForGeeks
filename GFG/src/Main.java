//Link https://practice.geeksforgeeks.org/problems/save-ironman/0
// Working program with FastReader 
// import java.io.*;
//import java.lang.*;
import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while (t-- > 0) {
			//code
			String str=s.nextLine();
			str=str.replaceAll("[^A-Za-z0-9]", "");
			
			str=str.toLowerCase();
			StringBuilder sb = new StringBuilder(str);
			//String str1= sb.reverse().toString();
			System.out.println(sb);
			System.out.println(str);
			//a1@#1A
			sb=sb.reverse();
			if(sb.equals(str)){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		s.close();

	}
}