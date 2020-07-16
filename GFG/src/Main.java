//Link https://practice.geeksforgeeks.org/problems/save-ironman/0
// Working program with FastReader 
import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader s = new FastReader();
		int t = s.nextInt();

		while (t-- > 0) {
			//code
			String str=s.nextLine();
			str=str.replaceAll("[^A-Za-z0-9]", "");
			
			str=str.toLowerCase();
			StringBuilder sb = new StringBuilder(str);
			String str1= sb.reverse().toString();
			//System.out.println(str);
			if(str1.equals(str)){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}
}